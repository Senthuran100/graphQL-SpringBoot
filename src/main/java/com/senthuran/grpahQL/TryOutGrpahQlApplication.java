package com.senthuran.grpahQL;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class TryOutGrpahQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TryOutGrpahQlApplication.class, args);
    }

}
