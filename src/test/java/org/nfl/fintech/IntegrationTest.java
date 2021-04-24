package org.nfl.fintech;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.nfl.fintech.MfFirstModuleApp;
import org.nfl.fintech.config.TestSecurityConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { MfFirstModuleApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
