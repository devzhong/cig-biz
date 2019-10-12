package com.mamba.cig.cigbiz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.mamba.cig.cigbiz.dao")
@EnableTransactionManagement
@EnableDiscoveryClient
public class CigBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(CigBizApplication.class, args);
    }

}
