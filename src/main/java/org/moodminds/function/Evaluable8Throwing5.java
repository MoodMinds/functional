package org.moodminds.function;

/**
 * Represents an operation returning a result by the 8 input arguments
 * and declares 5 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <X7> {@inheritDoc}
 * @param <X8> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 * @param <E5> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable8Throwing5<X1, X2, X3, X4, X5, X6, X7, X8, V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception>
        extends Evaluable8Throwing6<X1, X2, X3, X4, X5, X6, X7, X8, V, E1, E2, E3, E4, E5, E5> {

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
     * @param x8 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     * @throws E5 {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7, X8 x8) throws E1, E2, E3, E4, E5;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable8Throwing5<X1, X2, X3, X4, X5, X6, X7, X8, R, E1, E2, E3, E4, E5> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E5, ? extends E5, ? extends E5> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E4, E5, E5, E5, E5>) after::eval).after(this)::eval;
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
     * @param <V8> the type of input 8
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable8Throwing5<V1, V2, V3, V4, V5, V6, V7, V8, V1, E1, E2, E3, E4, E5> identity1() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, E1, E2, E3, E4, E5, E5, E5, E5>identity1()::eval;
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
     * @param <V8> the type of input 8
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable8Throwing5<V1, V2, V3, V4, V5, V6, V7, V8, V2, E1, E2, E3, E4, E5> identity2() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, E1, E2, E3, E4, E5, E5, E5, E5>identity2()::eval;
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
     * @param <V8> the type of input 8
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 3
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable8Throwing5<V1, V2, V3, V4, V5, V6, V7, V8, V3, E1, E2, E3, E4, E5> identity3() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, E1, E2, E3, E4, E5, E5, E5, E5>identity3()::eval;
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
     * @param <V8> the type of input 8
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 4
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable8Throwing5<V1, V2, V3, V4, V5, V6, V7, V8, V4, E1, E2, E3, E4, E5> identity4() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, E1, E2, E3, E4, E5, E5, E5, E5>identity4()::eval;
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
     * @param <V8> the type of input 8
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 5
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable8Throwing5<V1, V2, V3, V4, V5, V6, V7, V8, V5, E1, E2, E3, E4, E5> identity5() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, E1, E2, E3, E4, E5, E5, E5, E5>identity5()::eval;
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
     * @param <V8> the type of input 8
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 6
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable8Throwing5<V1, V2, V3, V4, V5, V6, V7, V8, V6, E1, E2, E3, E4, E5> identity6() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, E1, E2, E3, E4, E5, E5, E5, E5>identity6()::eval;
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
     * @param <V8> the type of input 8
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 7
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable8Throwing5<V1, V2, V3, V4, V5, V6, V7, V8, V7, E1, E2, E3, E4, E5> identity7() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, E1, E2, E3, E4, E5, E5, E5, E5>identity7()::eval;
    }

    /**
     * Return an operation that always returns its input argument 8.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <V6> the type of input 6
     * @param <V7> the type of input 7
     * @param <V8> the type of input 8
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an operation that always returns its input argument 8
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Evaluable8Throwing5<V1, V2, V3, V4, V5, V6, V7, V8, V8, E1, E2, E3, E4, E5> identity8() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, E1, E2, E3, E4, E5, E5, E5, E5>identity8()::eval;
    }
}
