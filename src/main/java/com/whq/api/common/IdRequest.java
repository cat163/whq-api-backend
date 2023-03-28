package com.whq.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通过id请求
 *
 * @author whq
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}