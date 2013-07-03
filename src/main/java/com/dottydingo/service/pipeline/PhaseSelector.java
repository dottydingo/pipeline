package com.dottydingo.service.pipeline;

/**
 */
public interface PhaseSelector<C>
{
    PhaseExecutor<C> getNextPhase(C context);
}
