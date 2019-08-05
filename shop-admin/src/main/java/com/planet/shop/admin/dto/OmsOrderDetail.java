package com.planet.shop.admin.dto;

import com.planet.shop.mbg.model.OmsOrder;
import com.planet.shop.mbg.model.OmsOrderItem;
import com.planet.shop.mbg.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * Created by macro on 2018/10/11.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
