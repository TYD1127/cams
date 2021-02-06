package com.winsoar.cams.utils;

import com.winsoar.cams.dao.UserMapper;
import com.winsoar.cams.pojo.JwtUser;
import com.winsoar.cams.pojo.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by echisan on 2018/6/23
 */
@Service("UserDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("登录用户：" + username + "不存在");
        }
        return new JwtUser(user);
    }

}
