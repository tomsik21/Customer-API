package com.amdocs.customerapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabaseCustomer {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabaseCustomer.class);

  @Bean
  CommandLineRunner initDatabaseCustomer(CustomerRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Customer("Dan", "Danin", true, 30.0,  "DanD@email.com", 1231231234)));
      log.info("Preloading " + repository.save(new Customer("Pat", "Star", false, 45.0,  "PatS@email.com", 1231231235))); 
      
    };
  }
}