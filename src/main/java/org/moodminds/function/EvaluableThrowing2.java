package org.moodminds.function;

/**
 * Represents an operation returning a result by the input argument
 * and declares 2 possible exceptions to be thrown.
 *
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 */
@FunctionalInterface
public interface EvaluableThrowing2<V, E1 extends Exception, E2 extends Exception>
        extends EvaluableThrowing3<V, E1, E2, E2> {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     */
    @Override
    V eval() throws E1, E2;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> EvaluableThrowing2<R, E1, E2> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E2, E2, E2, E2, E2, E2>) after::eval).after(this)::eval;
    }


    /**
     * Return an operation that always returns the given constant value.
     *
     * @param <V> the type of the result
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     */
    static <V, E1 extends Exception, E2 extends Exception> EvaluableThrowing2<V, E1, E2> constant(V value) {
        return EvaluableThrowing8.<V, E1, E2, E2, E2, E2, E2, E2, E2>constant(value)::eval;
    }
}
