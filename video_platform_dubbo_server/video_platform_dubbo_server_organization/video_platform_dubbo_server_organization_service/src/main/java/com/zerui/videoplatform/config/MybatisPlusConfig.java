package com.zerui.videoplatform.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//扫描dao或者是Mapper接口
@MapperScan("com.zerui.videoplatform.mapper")
public class MybatisPlusConfig {

}