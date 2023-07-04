package com.yupi.project.service;

import com.atwj.client.WjApiClient;
import com.atwj.model.User;
import com.atwj.utils.SignUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author wj
 * @create_time 2023/7/3
 * @description
 */
@SpringBootTest
@Slf4j
public class ClientTest {


    @Resource
    private WjApiClient wjApiClient;

    @Test
    void test() {
        User user = new User();
        user.setUserName("wj");
        System.out.println(wjApiClient.getUsernameByPost(user));
    }

    @Test
    void test1() {
        String s = SignUtil.generateSignature("abc");
        Assertions.assertTrue(SignUtil.verify("abc", s));
    }

}
