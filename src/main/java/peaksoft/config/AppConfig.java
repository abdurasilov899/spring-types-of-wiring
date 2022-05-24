package peaksoft.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.Island2;
import peaksoft.model.Ocean1;
import peaksoft.model.Rabbit4;
import peaksoft.model.Wood3;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {
    @Bean
    public static Island2 getWood(Wood3 wood3) {
        return new Island2(wood3);
    }

}