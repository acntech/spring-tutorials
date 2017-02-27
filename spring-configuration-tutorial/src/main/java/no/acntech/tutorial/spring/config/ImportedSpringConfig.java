package no.acntech.tutorial.spring.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("no.acntech.tutorial.spring.bean")
@Configuration
public class ImportedSpringConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImportedSpringConfig.class);

    public ImportedSpringConfig() {
        LOGGER.info("Loaded configuration");
    }
}
