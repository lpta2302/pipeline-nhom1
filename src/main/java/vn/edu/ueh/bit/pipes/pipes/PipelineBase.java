package vn.edu.ueh.bit.pipes.pipes;

import vn.edu.ueh.bit.pipes.core.entities.interfaces.IFilter;

public abstract class PipelineBase<T> {
    public PipelineBase() {
    }
    public abstract void registerFilter(IFilter<T> filter);
    public abstract T processFilter(T message);
}
