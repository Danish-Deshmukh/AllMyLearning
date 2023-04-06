package section14Lambda.Lambda2Expressions;

@FunctionalInterface
public interface Operation<T> {
    T operate(T value1, T value2);
}
