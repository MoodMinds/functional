package org.moodminds.function;

/**
 * Represents an operation returning a result by the input argument
 * and declares 4 possible exceptions to be thrown.
 *
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 */
@FunctionalInterface
public interface EvaluableThrowing4<V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception>
        extends EvaluableThrowing5<V, E1, E2, E3, E4, E4> {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     */
    @Override
    V eval() throws E1, E2, E3, E4;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> EvaluableThrowing4<R, E1, E2, E3, E4> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E4, E4, E4, E4, E4>) after::eval).after(this)::eval;
    }


    /**
     * Return an operation that always returns the given constant value.
     *
     * @param <V> the type of the result
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     */
    static <V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> EvaluableThrowing4<V, E1, E2, E3, E4> constant(V value) {
        return EvaluableThrowing8.<V, E1, E2, E3, E4, E4, E4, E4, E4>constant(value)::eval;
    }
}
