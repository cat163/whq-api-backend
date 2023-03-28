package com.whq.api.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: whq
 * @description: 接口信息更新请求
 * @time: 2023/3/20 15:08
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String useRequestParams;

    private static final long serialVersionUID = 1L;

}
