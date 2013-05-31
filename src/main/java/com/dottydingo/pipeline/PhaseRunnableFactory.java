package com.dottydingo.pipeline;

/**
 */
public interface PhaseRunnableFactory<C>
{
    Runnable createRunnable(C phaseContext, ContextRunnable<C> router);
}
