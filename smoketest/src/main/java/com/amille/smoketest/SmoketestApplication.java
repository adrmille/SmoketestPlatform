package com.amille.smoketest;

import com.amille.smoketest.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SmoketestApplication {

    @Autowired
    private MailService mailService;

    public static void main(String[] args) {
        SpringApplication.run(SmoketestApplication.class, args);
    }

    @PostConstruct
    private void init() {

        // TODO Smoketest code here

    }

}

