package org.moodminds.function;

/**
 * Represents an operation returning a result by the 5 input arguments
 * and declares possible exception to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Evaluable5Throwing1<X1, X2, X3, X4, X5, V, E extends Exception>
        extends Evaluable5Throwing2<X1, X2, X3, X4, X5, V, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @param x4 {@inheritDoc}
     * @param x5 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5) throws E;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable5Throwing1<X1, X2, X3, X4, X5, R, E> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((Evaluable1Throwing8<V, R, E, E, E, E, E, E, E, E>) after::eval).after(this)::eval;
    }


    /**
     * Return an operation that always returns its input argument 1.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, V3, V4, V5, E extends Exception> Evaluable5Throwing1<V1, V2, V3, V4, V5, V1, E> identity1() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E, E, E, E, E, E, E, E>identity1()::eval;
    }

    /**
     * Return an operation that always returns its input argument 2.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, V3, V4, V5, E extends Exception> Evaluable5Throwing1<V1, V2, V3, V4, V5, V2, E> identity2() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E, E, E, E, E, E, E, E>identity2()::eval;
    }

    /**
     * Return an operation that always returns its input argument 3.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument 3
     */
    static <V1, V2, V3, V4, V5, E extends Exception> Evaluable5Throwing1<V1, V2, V3, V4, V5, V3, E> identity3() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E, E, E, E, E, E, E, E>identity3()::eval;
    }

    /**
     * Return an operation that always returns its input argument 4.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument 4
     */
    static <V1, V2, V3, V4, V5, E extends Exception> Evaluable5Throwing1<V1, V2, V3, V4, V5, V4, E> identity4() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E, E, E, E, E, E, E, E>identity4()::eval;
    }

    /**
     * Return an operation that always returns its input argument 5.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @param <V5> the type of input 5
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument 5
     */
    static <V1, V2, V3, V4, V5, E extends Exception> Evaluable5Throwing1<V1, V2, V3, V4, V5, V5, E> identity5() {
        return Evaluable5Throwing8.<V1, V2, V3, V4, V5, E, E, E, E, E, E, E, E>identity5()::eval;
    }
}
