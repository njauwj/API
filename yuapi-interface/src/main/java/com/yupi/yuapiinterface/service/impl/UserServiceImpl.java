package com.yupi.yuapiinterface.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.yuapiinterface.mapper.UserMapper;
import com.yupi.yuapiinterface.model.User;
import com.yupi.yuapiinterface.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * 用户服务实现类
 *
 * @author wj
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {


}




