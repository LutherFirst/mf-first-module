package org.nfl.fintech.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Mf First Module.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link tech.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {}
