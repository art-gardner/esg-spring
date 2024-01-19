package com.example.addresses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(AddressRepository repository) {

        Address address = new Address(123L, "Rachel Stroggins", "43 Trout Road", "", "Swifton", "Ambershire", "England", "PR4 76DF");
        return args -> {
            log.info("Preloading " + repository.save(address));
        };
    }
}