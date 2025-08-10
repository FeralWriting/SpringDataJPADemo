package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingdatajpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingdatajpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingdatajpaApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            //Save customers
            repository.save(new Customer("James", "Thomas"));
            repository.save(new Customer("Adrian", "Jefferson"));
            repository.save(new Customer("Kim", "Mims"));
            repository.save(new Customer("Fin", "Bubble"));
            repository.save(new Customer("Quit", "Mims"));

            //Fetch /w findAll
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            repository.findAll().forEach(customer -> {
                log.info(customer.toString());
            });
            log.info("");

            //Fetch /w findById(1L)
            Customer customer = repository.findById(1L);
            log.info("Customers found with findById(1L):");
            log.info("----------------------------------");
            log.info(customer.toString());
            log.info("");

            //Fetch by last name
            log.info("Customers found with findByLastName('Mims'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Mims").forEach(mims -> {
                log.info(mims.toString());
            });
            log.info("");
        };
    }

}
