package com.yupi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.project.model.entity.UserInterfaceInfo;
/**
 * @Entity com.yupi.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    int updateUserInterfaceInfoNum(Long interfaceInfoId, Long userId);


}




