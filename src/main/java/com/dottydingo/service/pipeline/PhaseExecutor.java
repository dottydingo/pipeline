package com.dottydingo.service.pipeline;

/**
 */
public interface PhaseExecutor<C>
{
    void execute(C phaseContext);
}
