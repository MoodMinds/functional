package org.moodminds.function;

/**
 * Represents an operation returning a result by the input argument
 * and declares possible exception to be thrown.
 *
 * @param <V> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface EvaluableThrowing1<V, E extends Exception> extends EvaluableThrowing2<V, E, E> {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    V eval() throws E;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> EvaluableThrowing1<R, E> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((Evaluable1Throwing8<V, R, E, E, E, E, E, E, E, E>) after::eval).after(this)::eval;
    }

    /**
     * Return an operation that always returns the given constant value.
     *
     * @param <V> the type of the result
     * @param <E> the type of possible exception that might be thrown
     */
    static <V, E extends Exception> EvaluableThrowing1<V, E> constant(V value) {
        return EvaluableThrowing8.<V, E, E, E, E, E, E, E, E>constant(value)::eval;
    }
}
