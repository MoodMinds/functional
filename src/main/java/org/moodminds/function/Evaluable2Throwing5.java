package org.moodminds.function;

/**
 * Represents an operation returning a result by the 2 input arguments
 * and declares 5 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 * @param <E5> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable2Throwing5<X1, X2, V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception>
        extends Evaluable2Throwing6<X1, X2, V, E1, E2, E3, E4, E5, E5> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     * @throws E5 {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2) throws E1, E2, E3, E4, E5;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable2Throwing5<X1, X2, R, E1, E2, E3, E4, E5> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E5, ? extends E5, ? extends E5> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E4, E5, E5, E5, E5>) after::eval).after(this)::eval;
    }


    /**
     * Return an operation that always returns its input argument 1.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable2Throwing5<V1, V2, V1, E1, E2, E3, E4, E5> identity1() {
        return Evaluable2Throwing8.<V1, V2, E1, E2, E3, E4, E5, E5, E5, E5>identity1()::eval;
    }

    /**
     * Return an operation that always returns its input argument 2.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable2Throwing5<V1, V2, V2, E1, E2, E3, E4, E5> identity2() {
        return Evaluable2Throwing8.<V1, V2, E1, E2, E3, E4, E5, E5, E5, E5>identity2()::eval;
    }
}
