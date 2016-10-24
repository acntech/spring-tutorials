package no.acntech.tutorial.spring.config;

import no.acntech.tutorial.spring.bean.SimpleSpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestSpringConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestSpringConfig.class);

    public TestSpringConfig() {
        LOGGER.info("Loaded configuration");
    }

    @Bean
    public SimpleSpringBean simpleSpringBean() {
        return new SimpleSpringBean("Hello Test Profile Spring Configuration!");
    }
}
