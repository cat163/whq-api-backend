package com.whq.api.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.whq.api.model.entity.UserInterfaceInfo;

/**
* @author 35029
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-03-27 15:06:01
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b);

    /**
     * 计算数量
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
