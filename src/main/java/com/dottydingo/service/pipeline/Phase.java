package com.dottydingo.service.pipeline;

/**
 */
public interface Phase<C>
{
    void execute(C phaseContext) throws Exception;
}
