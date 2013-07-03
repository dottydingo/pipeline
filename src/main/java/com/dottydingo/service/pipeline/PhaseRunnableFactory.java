package com.dottydingo.service.pipeline;

/**
 */
public interface PhaseRunnableFactory<C>
{
    Runnable createRunnable(C phaseContext, ContextRunnable<C> router);
}
