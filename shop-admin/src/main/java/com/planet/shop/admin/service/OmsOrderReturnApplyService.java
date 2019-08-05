package com.planet.shop.admin.service;

import com.planet.shop.admin.dto.OmsReturnApplyQueryParam;
import com.planet.shop.admin.dto.OmsUpdateStatusParam;
import com.planet.shop.mbg.model.OmsOrderReturnApply;
import com.planet.shop.admin.dto.OmsOrderReturnApplyResult;

import java.util.List;

/**
 * 退货申请管理Service
 * Created by macro on 2018/10/18.
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
