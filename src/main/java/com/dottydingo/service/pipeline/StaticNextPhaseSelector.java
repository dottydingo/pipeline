package com.dottydingo.service.pipeline;

/**
 */
public class StaticNextPhaseSelector<C> implements PhaseSelector<C>
{
    private PhaseExecutor<C> nextPhase;

    public StaticNextPhaseSelector()
    {
    }

    public StaticNextPhaseSelector(PhaseExecutor<C> nextPhase)
    {
        this.nextPhase = nextPhase;
    }

    public void setNextPhase(PhaseExecutor<C> nextPhase)
    {
        this.nextPhase = nextPhase;
    }

    @Override
    public PhaseExecutor<C> getNextPhase(C context)
    {
        return nextPhase;
    }
}
