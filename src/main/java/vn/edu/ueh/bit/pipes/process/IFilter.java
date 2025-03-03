package vn.edu.ueh.bit.pipes.process;
public interface IFilter<T> {
    T execute(T input);
}
