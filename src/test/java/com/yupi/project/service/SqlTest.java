package com.yupi.project.service;

import com.yupi.project.mapper.UserInterfaceInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author wj
 * @create_time 2023/7/5
 * @description
 */
@SpringBootTest
public class SqlTest {

    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;


    @Test
    void test() {
        System.out.println(userInterfaceInfoMapper.updateUserInterfaceInfoNum(2L, 1L));
    }


}
