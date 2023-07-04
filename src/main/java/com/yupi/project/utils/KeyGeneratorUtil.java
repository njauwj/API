package com.yupi.project.utils;


import cn.hutool.core.util.IdUtil;

public class KeyGeneratorUtil {


    public static String genAccessKey() {
        return IdUtil.randomUUID();
    }

    public static String genSecretKey() {
        return IdUtil.randomUUID();
    }
}