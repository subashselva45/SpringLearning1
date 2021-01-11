package io.pragra.learning.springlearning1.config;

import io.pragra.learning.springlearning1.HomeAddress;
import io.pragra.learning.springlearning1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Configuration
public class AppConfig {
    @Bean
    public HomeAddress homeAddress(){
        return new HomeAddress("Rankin",467,"windsor","canada");
    }
    @Bean
    public Person person(){
        return new Person("Subash",25,homeAddress(), Arrays.asList("Watching tv","instagram"));

    }
}
