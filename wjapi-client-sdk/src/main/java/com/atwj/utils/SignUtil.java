package com.atwj.utils;

import cn.hutool.crypto.digest.DigestUtil;

/**
 * @author wj
 * @create_time 2023/7/4
 * @description
 */
public class SignUtil {


    public static String generateSignature(String body) {
        return DigestUtil.md5Hex(body);
    }

    public static boolean verify(String data, String signed) {
        return DigestUtil.md5Hex(data).equals(signed);
    }


}
