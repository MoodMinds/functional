package org.moodminds.function;

/**
 * Represents an operation returning a result by the 3 input arguments
 * and declares 6 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 * @param <E5> {@inheritDoc}
 * @param <E6> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable3Throwing6<X1, X2, X3, V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception>
        extends Evaluable3Throwing7<X1, X2, X3, V, E1, E2, E3, E4, E5, E6, E6> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     * @throws E5 {@inheritDoc}
     * @throws E6 {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3) throws E1, E2, E3, E4, E5, E6;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable3Throwing6<X1, X2, X3, R, E1, E2, E3, E4, E5, E6> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E6, ? extends E6> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E4, E5, E6, E6, E6>) after::eval).after(this)::eval;
    }
}