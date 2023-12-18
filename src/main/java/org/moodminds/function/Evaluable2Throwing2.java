package org.moodminds.function;

/**
 * Represents an operation returning a result by the 2 input arguments
 * and declares 2 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable2Throwing2<X1, X2, V, E1 extends Exception, E2 extends Exception>
        extends Evaluable2Throwing3<X1, X2, V, E1, E2, E2> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2) throws E1, E2;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable2Throwing2<X1, X2, R, E1, E2> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E2, E2, E2, E2, E2, E2>) after::eval).after(this)::eval;
    }
}
