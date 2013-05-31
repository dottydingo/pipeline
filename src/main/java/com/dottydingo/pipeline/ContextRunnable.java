package com.dottydingo.pipeline;

/**
 */
public interface ContextRunnable<C>
{
    void run(C phaseContext);
}
