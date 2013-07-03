package com.dottydingo.service.pipeline;

/**
 */
public class DefaultPhaseRunnableFactory<C> implements PhaseRunnableFactory<C>
{
    @Override
    public Runnable createRunnable(final C phaseContext, final ContextRunnable<C> router)
    {
        return new Runnable()
        {
            @Override
            public void run()
            {
                router.run(phaseContext);
            }
        };
    }
}
