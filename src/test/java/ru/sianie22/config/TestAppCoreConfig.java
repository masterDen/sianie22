package ru.sianie22.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * author: Denis Grigorichev
 * Created at: 23.02.16
 */
@PropertySource("testApplication.properties")
@Configuration
@Profile("test")
public class TestAppCoreConfig extends CoreConfiguration{
}
