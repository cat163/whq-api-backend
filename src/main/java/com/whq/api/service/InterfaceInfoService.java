package com.whq.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whq.api.model.entity.InterfaceInfo;


/**
* @author 35029
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-20 14:37:50
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
