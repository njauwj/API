package com.yupi.project.model.dto.interfaceinfo;

import lombok.Data;

/**
 * @author wj
 * @create_time 2023/7/5
 * @description
 */
@Data
public class InvokeInterfaceRequest {

    /**
     * 接口ID
     */
    private Long id;

    /**
     * 请求参数
     */
    private String userRequestParams;


}
