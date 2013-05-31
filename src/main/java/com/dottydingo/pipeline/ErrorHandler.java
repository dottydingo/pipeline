package com.dottydingo.pipeline;

/**
 */
public interface ErrorHandler<C>
{
    void handleError(C context, Throwable throwable);
}
