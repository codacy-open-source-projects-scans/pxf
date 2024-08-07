package org.greenplum.pxf.api.function;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Represents an operation that accepts five input arguments and returns no
 * result. This is the five-arity specialization of {@link Consumer}.
 * Unlike most other functional interfaces, {@code PentaConsumer} is expected
 * to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object, Object, Object, Object, Object)}.
 *
 * @param <P> the type of the first argument to the operation
 * @param <S> the type of the second argument to the operation
 * @param <T> the type of the third argument to the operation
 * @param <U> the type of the fourth argument to the operation
 * @param <V> the type of the fifth argument to the operation
 *
 * @see Consumer
 */
@FunctionalInterface
public interface PentaConsumer<P, S, T, U, V> {
    /**
     * Performs this operation on the given arguments.
     *
     * @param p the first input argument
     * @param s the second input argument
     * @param t the third input argument
     * @param u the forth input argument
     * @param v the fifth input argument
     */
    void accept(P p, S s, T t, U u, V v);

    /**
     * Returns a composed {@code Consumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation. If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     * @return a composed {@code PentaConsumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
    default PentaConsumer<P, S, T, U, V> andThen(PentaConsumer<? super P, ? super S, ? super T, ? super U, ? super V> after) {
        Objects.requireNonNull(after);
        return (p, s, t, u, v) -> {
            accept(p, s, t, u, v);
            after.accept(p, s, t, u, v);
        };
    }
}
