package com.dottydingo.service.pipeline;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 */
public class PhaseExecutorRegistry<C>
{
    private Map<String,PhaseExecutor<C>> phaseExecutorMap = new ConcurrentHashMap<String, PhaseExecutor<C>>();

    public void registerPhaseExecutor(String name, PhaseExecutor<C> phaseExecutor)
    {
        if(phaseExecutorMap.put(name,phaseExecutor) != null)
            throw new RuntimeException(
                    String.format("Duplicate phaseExecutor registered under name %s",name));
    }

    public PhaseExecutor<C> getPhaseExecutor(String name)
    {
        PhaseExecutor<C> router = phaseExecutorMap.get(name);
        if(router == null)
            throw new RuntimeException(
                    String.format("No phaseExecutor registered under name %s",name));

        return router;
    }

    public void setPhaseExecutorMap(Map<String, PhaseExecutor<C>> phaseExecutorMap)
    {
        this.phaseExecutorMap.putAll(phaseExecutorMap);
    }
}
