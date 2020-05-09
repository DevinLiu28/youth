package com.rebirth.user.service.impl;

import com.rebirth.user.entity.UserInfo;
import com.rebirth.user.mapper.UserInfoMapper;
import com.rebirth.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by *** on 2019/1/10.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer  userId) {
        return userInfoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserInfo record) {
        return userInfoMapper.insertSelective(record);
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer  userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }
}