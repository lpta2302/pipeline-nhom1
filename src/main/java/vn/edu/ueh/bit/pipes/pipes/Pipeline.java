package vn.edu.ueh.bit.pipes.pipes;

import vn.edu.ueh.bit.pipes.core.entities.interfaces.IFilter;

public class Pipeline<T> extends PipelineBase<T> {
    public Pipeline() {
    }

    @Override
    public void registerFilter(IFilter<T> filter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerFilter'");
    }

    @Override
    public T processFilter(T message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processFilter'");
    }
}
