//全局的ajax访问，处理ajax清求时session超时
$.ajaxSetup({
    contentType : "application/x-www-form-urlencoded;charset=utf-8",
    complete : function(XMLHttpRequest, textStatus) {
        if (textStatus == "parsererror") {
            layer.confirm('登录超时,请重新登录', function(index) {
                window.location.href = getRealPath() + '/index.jsp';
            });
        } else if (textStatus == "error") {
            layer.alert("请求超时，请稍后再试！");
        }
    }
});

function getRealPath() {
    var localObj = window.location;
    var contextPath = localObj.pathname.split("/")[1];
    var basePath = localObj.protocol + "//" + localObj.host + "/" + contextPath;
    return basePath;
}

var previewJson = new Array();
var preConfigList = new Array();

function initFileinput(ctrlName, uploadUrl, isRequired, allowedFileExtensions) {
    var control = $('#' + ctrlName);

    control.fileinput({
        uploadAsync : false, // 默认true异步上传
        language : "zh",// 配置语言
        uploadUrl : uploadUrl,
        // enctype : 'multipart/form-data',
        allowedFileExtensions : (allowedFileExtensions ? allowedFileExtensions : [ "jpg", "jpeg", "gif", "png", "bmp" ]),/* 上传文件格式 */
        maxFileSize : 10240,
        maxFileCount : 10,
        required : isRequired,
        showUpload : false, // 是否显示上传按钮 (一键上传所有图片)
        showRemove : false, // 显示移除按钮,跟随文本框的那个
        showPreview : true, // 是否显示预览
        showBrowse : true,// 是否显示浏览按钮
        showCancel : false,// 是否显示取消按钮
        showCaption : false,// 是否显示标题 (选择框下方文件路径及名称及选择图片数量)
        dropZoneEnabled : false,// 是否显示拖拽区域(显示图片窗口)
        validateInitialCount : true,// 验证初始计数
        browseClass : "btn btn-primary", // 按钮样式
        browseOnZoneClick : true,
        previewSettings : {
            image : {
                width : "120px",
                height : "120px",
                'max-width' : "100%",
                'max-height' : "100%"
            }
        },
        overwriteInitial : false,// 不覆盖原来的图片
        initialPreviewFileType : 'image',
        initialPreview : previewJson,
        initialPreviewConfig : preConfigList
    });

    // 删除确认
    control.on('filebeforedelete', function(event, key, data) {
        if (!confirm('确定删除原文件？删除后不可恢复')) {
            return true;
        }
    });
}

// var previewJsonVideo = new Array();
// var preConfigListVideo = new Array();
// function videoinput(videoName, uploadUrl, isRequired) {
// var control = $('#' + videoName);
// control.fileinput({
// uploadAsync : false, // 默认true异步上传
// language : "zh",// 配置语言
// uploadUrl : uploadUrl,
// enctype : 'multipart/form-data',
// allowedFileExtensions : [ "mp4" ],/* 上传文件格式 */
// maxFileSize : 1024 * 50,
// maxFileCount : 1,
// required : isRequired,
// showUpload : false, // 是否显示上传按钮 (一键上传所有图片)
// showRemove : false, // 显示移除按钮,跟随文本框的那个
// showPreview : true, // 是否显示预览
// showBrowse : true,// 是否显示浏览按钮
// showCancel : false,// 是否显示取消按钮
// showCaption : false,// 是否显示标题 (选择框下方文件路径及名称及选择图片数量)
// dropZoneEnabled : false,// 是否显示拖拽区域(显示图片窗口)
// validateInitialCount : true,// 验证初始计数
// browseClass : "btn btn-primary", // 按钮样式
// browseOnZoneClick : true,
// previewSettings : {
// video : {
// width : "280px",
// height : "180px",
// 'max-width' : "100%",
// 'max-height' : "100%"
// }
// },
// overwriteInitial : false,// 不覆盖原来的图片
// initialPreviewFileType : 'video',
// initialPreview : previewJsonVideo,
// initialPreviewConfig : preConfigListVideo
// });
// }

// 一个点击取消，取消全选
function choose(a) {
    if ($(a).prop("checked") == false) {
        $('#allChoose').prop("checked", false);
    } else {
        if ($("input[class='checkchild']").not("input:checked").length == 0) {
            $('#allChoose').prop("checked", true);
        }
    }
}

// 打开全屏窗口
function layer_show_max(title, url) {
    var index = layer.open({
        type : 2,
        area : [ 800, 600 ],
        fix : false, // 不固定
        maxmin : true,
        shade : 0.4,
        title : title,
        content : url
    });
    layer.full(index);
}

// 打开中等窗口800*600
function layer_show_middle(title, url) {
    layer_show(title, url, 800, 600);
}

// 打开小窗口600*400
function layer_show_small(title, url) {
    layer_show(title, url, 600, 400);
}

// 刷新附页面列表并关闭编辑窗口
function refreshParentAndClose(parentTable) {
    // 取消关闭页面刷新父级页面（刷新父级的时候会自动关闭弹层）
    if (parentTable) {
        parentTable.draw(false);
        // 当你在iframe页面关闭自身时
        var index = parent.layer.getFrameIndex(window.name); // 先得到当前iframe层的索引
        parent.layer.close(index); // 再执行关闭
    } else {
        window.parent.location.reload();
    }
}

var uEditorToolBars1 = [ //
'fullscreen', 'undo', 'redo', 'bold', 'italic', 'underline', 'backcolor', 'fontsize', //
'fontfamily', 'justifyleft', 'justifyright', 'justifycenter', 'justifyjustify', 'strikethrough', //
'superscript', 'subscript', 'removeformat', 'formatmatch', 'autotypeset', 'forecolor', 'backcolor', 'simpleupload', 'insertimage' ];
var uEditorToolBars2 = [ //
'fullscreen', 'source', '|', //
'undo', 'redo', '|', //
'bold', 'italic', 'underline', 'fontborder', 'strikethrough', 'superscript', 'subscript', 'removeformat', 'formatmatch', 'autotypeset', 'blockquote', 'pasteplain', '|', //
'forecolor', 'backcolor', 'insertorderedlist', 'insertunorderedlist', 'selectall', 'cleardoc', '|', //
'rowspacingtop', 'rowspacingbottom', 'lineheight', '|', //
'customstyle', 'paragraph', 'fontfamily', 'fontsize', '|', //
'directionalityltr', 'directionalityrtl', 'indent', '|', //
'justifyleft', 'justifycenter', 'justifyright', 'justifyjustify', '|', //
// 'touppercase', 'tolowercase', '|', //
// 'link', 'unlink', 'anchor', '|', //
'imagenone', 'imageleft', 'imageright', 'imagecenter', '|', //
'simpleupload', 'emotion', 'scrawl', 'map', 'pagebreak', 'template', 'background', '|', // 'insertimage','insertvideo','music','attachment','gmap','insertframe','insertcode','webapp',
'horizontal', 'date', 'time', 'spechars', '|', // 'snapscreen', 'wordimage',
'inserttable', 'deletetable', 'insertparagraphbeforetable', 'insertrow', 'deleterow', 'insertcol', 'deletecol', 'mergecells', 'mergeright', 'mergedown', 'splittocells', 'splittorows', 'splittocols', '|', // 'charts',
'print', 'preview', 'searchreplace', 'drafts', 'help' ];// 

// UEDITOR_CONFIG
var uEditorConfig = {
    // 这里可以选择自己需要的工具按钮名称,此处仅选择如下五个
    toolbars : [ uEditorToolBars2 ],
    // 默认的编辑区域高度
    initialFrameHeight : 200,
    // 元素路径 隐藏
    elementPathEnabled : false,
    // 非只读
    readonly : false,
    // 是否开启字数统计
    wordCount : true,
    // 允许的最大字符数
    maximumWords : 2000,
    // 更多其他参数，请参考ueditor.config.js中的配置项
    fontsize : [ 10, 11, 12, 14, 16, 18, 20, 24, 36, 50, 60, 70, 80, 90, 100 ]
};

// 列表页导入Excel展示错误信息
function show_excel_error(data) {
    var html = '';
    html += '<div id="modal-demo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-top: 150px">';
    html += '  <div class="modal-dialog">';
    html += '    <div class="modal-content radius">';
    html += '      <div class="modal-header">';
    html += '        <h3 class="modal-title" style="color:red;" id="dialog_title">请修改后重新导入</h3>';
    html += '        <a class="close" data-dismiss="modal" aria-hidden="true" href="javascript:void(0)">×</a>';
    html += '      </div>';
    html += '      <div class="modal-body" style="height: 200px; overflow-y:scroll">';
    html += '        <p id="dialog_text"></p>';
    html += '      </div>';
    html += '      <div class="modal-footer">';
    html += '        <button class="btn btn-primary" data-dismiss="modal" aria-hidden="true">确定</button>';
    html += '        <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>';
    html += '      </div>';
    html += '    </div>';
    html += '  </div>';
    html += '</div>';
    $("body .page-container").append(html);
    $("#dialog_text").html(data);
    $("#modal-demo").modal("show");
}
