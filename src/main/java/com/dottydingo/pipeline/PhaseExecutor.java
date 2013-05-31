package com.dottydingo.pipeline;

/**
 */
public interface PhaseExecutor<C>
{
    void execute(C phaseContext);
}
