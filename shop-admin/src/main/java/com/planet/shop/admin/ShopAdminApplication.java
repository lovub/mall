package com.planet.shop.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 应用启动入口
 * Created by macro on 2018/4/26.
 */
@SpringBootApplication
@MapperScan({"com.planet.shop.mbg.mapper","com.planet.shop.admin.dao"})
@EnableTransactionManagement
public class ShopAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopAdminApplication.class, args);
    }
}
