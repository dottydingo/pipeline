package com.dottydingo.service.pipeline;

/**
 */
public interface ContextRunnable<C>
{
    void run(C phaseContext);
}
