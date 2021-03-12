package com.winsoar.cams.service.Impl;

import com.winsoar.cams.entity.Foodcard;
import com.winsoar.cams.dao.FoodcardDao;
import com.winsoar.cams.service.FoodcardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Foodcard)表服务实现类
 *
 * @author makejava
 * @since 2021-02-22 16:46:41
 */
@Service("foodcardService")
public class FoodcardServiceImpl implements FoodcardService {
    @Resource
    private FoodcardDao foodcardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param foodcardId 主键
     * @return 实例对象
     */
    @Override
    public Foodcard queryById(Long foodcardId) {
        return this.foodcardDao.queryById(foodcardId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Foodcard> queryAllByLimit(int offset, int limit) {
        return this.foodcardDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param foodcard 实例对象
     * @return 实例对象
     */
    @Override
    public Foodcard insert(Foodcard foodcard) {
        this.foodcardDao.insert(foodcard);
        return foodcard;
    }

    /**
     * 修改数据
     *
     * @param foodcard 实例对象
     * @return 实例对象
     */
    @Override
    public Foodcard update(Foodcard foodcard) {
        this.foodcardDao.update(foodcard);
        return this.queryById(foodcard.getFoodcardId());
    }

    /**
     * 通过主键删除数据
     *
     * @param foodcardId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long foodcardId) {
        return this.foodcardDao.deleteById(foodcardId) > 0;
    }

    @Override
    public List<Map<String, Object>> getInfo() {
        return foodcardDao.getInfo();
    }

    @Override
    public Integer setztai(String zt, String cardNum) {
        return foodcardDao.setztai(zt,cardNum);
    }


}
