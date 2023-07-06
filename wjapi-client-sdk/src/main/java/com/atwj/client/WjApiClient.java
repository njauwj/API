package com.atwj.client;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.atwj.model.User;
import com.atwj.utils.SignUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * @author wj
 * @create_time 2023/7/3
 * @description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WjApiClient {


    private String accessKey;
    private String secretKey;

    public static final String URI = "http://localhost:8090";

    public String getNameByGet(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.get(URI + "/api/name/get/", paramMap);
        return result;
    }

    public String getNameByPost(String name) {
        String signature = SignUtil.generateSignature(name + secretKey);
        HashMap<String, String> headerMap = new HashMap<>();
        headerMap.put("accessKey", accessKey);
        headerMap.put("sign", signature);
        String result = HttpUtil.post(URI + "/api/name/post/", name);
        return result;
    }

    public String getUsernameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        String signature = SignUtil.generateSignature(json + secretKey);
        HashMap<String, String> headerMap = new HashMap<>();
        headerMap.put("accessKey", accessKey);
        headerMap.put("sign", signature);
        headerMap.put("body", json);
        String result = HttpRequest.post(URI + "/api/name/user/").addHeaders(headerMap).body(json).execute().body();
        return result;
    }

}
