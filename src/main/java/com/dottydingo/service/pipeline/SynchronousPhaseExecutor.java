package com.dottydingo.service.pipeline;

/**
 */
public class SynchronousPhaseExecutor<C> implements PhaseExecutor<C>
{
    protected Phase<C> phase;
    protected PhaseSelector<C> nextPhaseSelector = new NoOpNextPhaseSelector<C>();
    protected ErrorHandler<C> errorHandler = new DefaultErrorHandler<C>();

    public void setPhase(Phase<C> phase)
    {
        this.phase = phase;
    }

    public void setNextPhaseSelector(PhaseSelector<C> nextPhaseSelector)
    {
        this.nextPhaseSelector = nextPhaseSelector;
    }

    public void setErrorHandler(ErrorHandler<C> errorHandler)
    {
        this.errorHandler = errorHandler;
    }

    @Override
    public void execute(C phaseContext)
    {
        try
        {
            phase.execute(phaseContext);

            PhaseExecutor<C> nextRouter = nextPhaseSelector.getNextPhase(phaseContext);
            if(nextRouter != null)
                nextRouter.execute(phaseContext);
        }
        catch (Throwable throwable)
        {
            errorHandler.handleError(phaseContext,throwable);
        }

    }
}
