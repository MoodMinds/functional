package org.moodminds.function;

import java.util.function.Supplier;

/**
 * An {@link EvaluableThrowing1} that throws {@link RuntimeException}.
 *
 * @param <V> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable<V> extends EvaluableThrowing1<V, RuntimeException>, Supplier<V> {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default V eval() {
        return get();
    }

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable<R> then(Evaluable1Throwing8<? super V, ? extends R, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
        return ((Evaluable1Throwing8<V, R, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) after::eval).after(this)::eval;
    }

    /**
     * Return an operation that always returns the given constant value.
     *
     * @param <V> the type of the result
     */
    static <V> Evaluable<V> constant(V value) {
        return EvaluableThrowing8.<V, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>constant(value)::eval;
    }
}
