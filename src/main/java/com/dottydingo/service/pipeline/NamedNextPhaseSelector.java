package com.dottydingo.service.pipeline;

/**
 */
public class NamedNextPhaseSelector<C> implements PhaseSelector<C>
{
    private PhaseExecutorRegistry<C> phaseExecutorRegistry;
    private String nextPhaseName;

    public NamedNextPhaseSelector()
    {
    }

    public NamedNextPhaseSelector(PhaseExecutorRegistry<C> phaseExecutorRegistry, String nextPhaseName)
    {
        this.phaseExecutorRegistry = phaseExecutorRegistry;
        this.nextPhaseName = nextPhaseName;
    }

    public void setPhaseExecutorRegistry(PhaseExecutorRegistry<C> phaseExecutorRegistry)
    {
        this.phaseExecutorRegistry = phaseExecutorRegistry;
    }

    public void setNextPhaseName(String nextPhaseName)
    {
        this.nextPhaseName = nextPhaseName;
    }

    @Override
    public PhaseExecutor<C> getNextPhase(C context)
    {
        return phaseExecutorRegistry.getPhaseExecutor(nextPhaseName);
    }
}
