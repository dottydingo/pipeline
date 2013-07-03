package com.dottydingo.service.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public class DefaultErrorHandler<C> implements ErrorHandler<C>
{
    private static Logger logger = LoggerFactory.getLogger(DefaultErrorHandler.class);

    @Override
    public void handleError(C context, Throwable throwable)
    {
        logger.error("Error executing pipeline with no Error Handler specified.",throwable);
    }
}
