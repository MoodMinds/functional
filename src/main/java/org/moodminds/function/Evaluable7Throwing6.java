package org.moodminds.function;

/**
 * Represents an operation returning a result by the 7 input arguments
 * and declares 6 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <X7> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 * @param <E5> {@inheritDoc}
 * @param <E6> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable7Throwing6<X1, X2, X3, X4, X5, X6, X7, V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception>
        extends Evaluable7Throwing7<X1, X2, X3, X4, X5, X6, X7, V, E1, E2, E3, E4, E5, E6, E6> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @param x4 {@inheritDoc}
     * @param x5 {@inheritDoc}
     * @param x6 {@inheritDoc}
     * @param x7 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     * @throws E5 {@inheritDoc}
     * @throws E6 {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7) throws E1, E2, E3, E4, E5, E6;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable7Throwing6<X1, X2, X3, X4, X5, X6, X7, R, E1, E2, E3, E4, E5, E6> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E6, ? extends E6> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E4, E5, E6, E6, E6>) after::eval).after(this)::eval;
    }


    /**
     * Return an operation that always returns its input argument 1.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <V6> the type of input 6
     * @param <V7> the type of input 7
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, V3, V4, V5, V6, V7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception> Evaluable7Throwing6<V1, V2, V3, V4, V5, V6, V7, V1, E1, E2, E3, E4, E5, E6> identity1() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, E1, E2, E3, E4, E5, E6, E6, E6>identity1()::eval;
    }

    /**
     * Return an operation that always returns its input argument 2.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <V6> the type of input 6
     * @param <V7> the type of input 7
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, V3, V4, V5, V6, V7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception> Evaluable7Throwing6<V1, V2, V3, V4, V5, V6, V7, V2, E1, E2, E3, E4, E5, E6> identity2() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, E1, E2, E3, E4, E5, E6, E6, E6>identity2()::eval;
    }

    /**
     * Return an operation that always returns its input argument 3.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <V6> the type of input 6
     * @param <V7> the type of input 7
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @return an operation that always returns its input argument 3
     */
    static <V1, V2, V3, V4, V5, V6, V7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception> Evaluable7Throwing6<V1, V2, V3, V4, V5, V6, V7, V3, E1, E2, E3, E4, E5, E6> identity3() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, E1, E2, E3, E4, E5, E6, E6, E6>identity3()::eval;
    }

    /**
     * Return an operation that always returns its input argument 4.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <V6> the type of input 6
     * @param <V7> the type of input 7
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @return an operation that always returns its input argument 4
     */
    static <V1, V2, V3, V4, V5, V6, V7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception> Evaluable7Throwing6<V1, V2, V3, V4, V5, V6, V7, V4, E1, E2, E3, E4, E5, E6> identity4() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, E1, E2, E3, E4, E5, E6, E6, E6>identity4()::eval;
    }

    /**
     * Return an operation that always returns its input argument 5.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <V6> the type of input 6
     * @param <V7> the type of input 7
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @return an operation that always returns its input argument 5
     */
    static <V1, V2, V3, V4, V5, V6, V7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception> Evaluable7Throwing6<V1, V2, V3, V4, V5, V6, V7, V5, E1, E2, E3, E4, E5, E6> identity5() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, E1, E2, E3, E4, E5, E6, E6, E6>identity5()::eval;
    }

    /**
     * Return an operation that always returns its input argument 6.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <V6> the type of input 6
     * @param <V7> the type of input 7
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @return an operation that always returns its input argument 6
     */
    static <V1, V2, V3, V4, V5, V6, V7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception> Evaluable7Throwing6<V1, V2, V3, V4, V5, V6, V7, V6, E1, E2, E3, E4, E5, E6> identity6() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, E1, E2, E3, E4, E5, E6, E6, E6>identity6()::eval;
    }

    /**
     * Return an operation that always returns its input argument 7.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <V6> the type of input 6
     * @param <V7> the type of input 7
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @return an operation that always returns its input argument 7
     */
    static <V1, V2, V3, V4, V5, V6, V7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception> Evaluable7Throwing6<V1, V2, V3, V4, V5, V6, V7, V7, E1, E2, E3, E4, E5, E6> identity7() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, E1, E2, E3, E4, E5, E6, E6, E6>identity7()::eval;
    }
}
