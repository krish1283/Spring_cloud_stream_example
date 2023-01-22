package org.krish.cloud.steam.main;

import org.apache.kafka.streams.TopologyDescription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.function.Function;

@SpringBootApplication
@ComponentScan(basePackages = "org.krish.cloud.steam")
public class StreamCloudWebApp {
    public static void main(String[] args) {
        SpringApplication.run(StreamCloudWebApp.class,"--spring.cloud.stream.source=toStream");
    }

    @Bean
    public Function<String, String> uppercase() {
        return value -> {
            System.out.println("Received: " + value);
            return value.toUpperCase();
        };
    }
}