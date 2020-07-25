package org.accp.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = { "org.accp.dao" })
public class BeansConfig {
	

}
