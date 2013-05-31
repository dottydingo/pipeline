package com.dottydingo.pipeline;

/**
 */
public interface PhaseSelector<C>
{
    PhaseExecutor<C> getNextPhase(C context);
}
