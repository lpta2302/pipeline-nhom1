package vn.edu.ueh.bit.pipes.core.entities.interfaces;

public interface IFilter<T> {
    T execute(T message);
}
