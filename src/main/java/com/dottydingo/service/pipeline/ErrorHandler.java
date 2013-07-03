package com.dottydingo.service.pipeline;

/**
 */
public interface ErrorHandler<C>
{
    void handleError(C context, Throwable throwable);
}
