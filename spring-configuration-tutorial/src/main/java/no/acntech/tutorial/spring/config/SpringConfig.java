package no.acntech.tutorial.spring.config;

import no.acntech.tutorial.spring.bean.SimpleSpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({AnotherSpringConfig.class})
@Configuration
public class SpringConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringConfig.class);

    public SpringConfig() {
    }

    @Bean
    public SimpleSpringBean simpleSpringBean() {
        return new SimpleSpringBean("Hello Spring Configuration!");
    }
}
