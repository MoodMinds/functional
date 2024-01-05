package org.moodminds.function;

/**
 * Represents an operation returning a result by the 5 input arguments
 * and declares 3 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable5Throwing3<X1, X2, X3, X4, X5, V, E1 extends Exception, E2 extends Exception, E3 extends Exception>
        extends Evaluable5Throwing4<X1, X2, X3, X4, X5, V, E1, E2, E3, E3> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @param x4 {@inheritDoc}
     * @param x5 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5) throws E1, E2, E3;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable5Throwing3<X1, X2, X3, X4, X5, R, E1, E2, E3> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E3, E3, E3, E3, E3>) after::eval).after(this)::eval;
    }


    /**
     * Return an operation that always returns its input argument 1.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, V3, V4, V5, E1 extends Exception, E2 extends Exception, E3 extends Exception> Evaluable5Throwing3<V1, V2, V3, V4, V5, V1, E1, E2, E3> identity1() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E1, E2, E3, E3, E3, E3, E3, E3>identity1()::eval;
    }

    /**
     * Return an operation that always returns its input argument 2.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, V3, V4, V5, E1 extends Exception, E2 extends Exception, E3 extends Exception> Evaluable5Throwing3<V1, V2, V3, V4, V5, V2, E1, E2, E3> identity2() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E1, E2, E3, E3, E3, E3, E3, E3>identity2()::eval;
    }

    /**
     * Return an operation that always returns its input argument 3.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @return an operation that always returns its input argument 3
     */
    static <V1, V2, V3, V4, V5, E1 extends Exception, E2 extends Exception, E3 extends Exception> Evaluable5Throwing3<V1, V2, V3, V4, V5, V3, E1, E2, E3> identity3() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E1, E2, E3, E3, E3, E3, E3, E3>identity3()::eval;
    }

    /**
     * Return an operation that always returns its input argument 4.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @return an operation that always returns its input argument 4
     */
    static <V1, V2, V3, V4, V5, E1 extends Exception, E2 extends Exception, E3 extends Exception> Evaluable5Throwing3<V1, V2, V3, V4, V5, V4, E1, E2, E3> identity4() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E1, E2, E3, E3, E3, E3, E3, E3>identity4()::eval;
    }

    /**
     * Return an operation that always returns its input argument 5.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @return an operation that always returns its input argument 5
     */
    static <V1, V2, V3, V4, V5, E1 extends Exception, E2 extends Exception, E3 extends Exception> Evaluable5Throwing3<V1, V2, V3, V4, V5, V5, E1, E2, E3> identity5() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E1, E2, E3, E3, E3, E3, E3, E3>identity5()::eval;
    }
}
