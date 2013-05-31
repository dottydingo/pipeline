package com.dottydingo.pipeline;

/**
 */
public interface Phase<C>
{
    void execute(C phaseContext) throws Exception;
}
