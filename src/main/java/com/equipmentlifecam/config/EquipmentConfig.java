package com.equipmentlifecam.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.equipmentlifecam.backend.repositories")
@EntityScan(basePackages = "com.equipmentlifecam.backend.domain")
@ComponentScan
public class EquipmentConfig {

}
