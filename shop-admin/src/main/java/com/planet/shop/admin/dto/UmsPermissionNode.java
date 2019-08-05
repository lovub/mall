package com.planet.shop.admin.dto;

import com.planet.shop.mbg.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by macro on 2018/9/30.
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}
