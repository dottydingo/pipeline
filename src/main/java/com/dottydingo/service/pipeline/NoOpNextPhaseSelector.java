package com.dottydingo.service.pipeline;

/**
 */
public class NoOpNextPhaseSelector<C> implements PhaseSelector<C>
{
    private PhaseExecutor<C> nextPhase = new NoOpPhaseExecutor<C>();
    @Override
    public PhaseExecutor<C> getNextPhase(C context)
    {
        return nextPhase;
    }

    private static class NoOpPhaseExecutor<C> implements PhaseExecutor<C>
    {
        @Override
        public void execute(C phaseContext)
        {

        }
    }
}
