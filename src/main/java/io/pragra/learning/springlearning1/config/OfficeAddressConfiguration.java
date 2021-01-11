package io.pragra.learning.springlearning1.config;

import io.pragra.learning.springlearning1.OfficeAddress;
import io.pragra.learning.springlearning1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class OfficeAddressConfiguration {
    @Bean
    public OfficeAddress officeAddress(){
        return new OfficeAddress("pragra");
    }
    @Bean("person2")
    public Person person(){
        return new Person("Subash",25,officeAddress(), Arrays.asList("Watching tv","instagram"));

    }
}
