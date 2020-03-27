package com.msvc.demo;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.msvc.demo.model.EmployeeEntity;
import com.msvc.demo.repository.EmployeeRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    EmployeeRepository repository;
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception 
    {       
        Optional<EmployeeEntity> emp = repository.findById(2L);
 
        logger.info("Employee id 2 -> {}", emp.get());
        System.out.println("Employee id"+ emp.get());
    }
}
