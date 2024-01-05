package org.moodminds.function;

/**
 * Represents an operation returning a result by the 3 input arguments
 * and declares possible exception to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Evaluable3Throwing1<X1, X2, X3, V, E extends Exception>
        extends Evaluable3Throwing2<X1, X2, X3, V, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3) throws E;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable3Throwing1<X1, X2, X3, R, E> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((Evaluable1Throwing8<V, R, E, E, E, E, E, E, E, E>) after::eval).after(this)::eval;
    }


    /**
     * Return an operation that always returns its input argument 1.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, V3, E extends Exception> Evaluable3Throwing1<V1, V2, V3, V1, E> identity1() {
        return Evaluable3Throwing8.<V1, V2, V3, E, E, E, E, E, E, E, E>identity1()::eval;
    }

    /**
     * Return an operation that always returns its input argument 2.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, V3, E extends Exception> Evaluable3Throwing1<V1, V2, V3, V2, E> identity2() {
        return Evaluable3Throwing8.<V1, V2, V3, E, E, E, E, E, E, E, E>identity2()::eval;
    }

    /**
     * Return an operation that always returns its input argument 3.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument 3
     */
    static <V1, V2, V3, E extends Exception> Evaluable3Throwing1<V1, V2, V3, V3, E> identity3() {
        return Evaluable3Throwing8.<V1, V2, V3, E, E, E, E, E, E, E, E>identity3()::eval;
    }
}
