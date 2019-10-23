package com.spring.vault.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableConfigurationProperties(VaultConfigurationCustom.class)
public class ApplicationVault implements CommandLineRunner {

  private final VaultConfigurationCustom configuration;

    public ApplicationVault(VaultConfigurationCustom configuration) {

        this.configuration = configuration;
    }


    public static void main(String[] args) {

        SpringApplication.run(ApplicationVault.class, args);
    }

    @Override
    public void run(String... args) {

        Logger logger = LoggerFactory.getLogger(ApplicationVault.class);

        logger.info("  test.username is {}", configuration.getUsername());
        logger.info("  test.password is {}", configuration.getPassword());
    }
}
