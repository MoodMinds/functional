package org.moodminds.function;

/**
 * An {@link Evaluable4Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <V> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable4<X1, X2, X3, X4, V>
        extends Evaluable4Throwing1<X1, X2, X3, X4, V, RuntimeException> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @param x4 {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3, X4 x4);

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable4<X1, X2, X3, X4, R> then(Evaluable1Throwing8<? super V, ? extends R, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
        return ((Evaluable1Throwing8<V, R, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) after::eval).after(this)::eval;
    }


    /**
     * Return an operation that always returns its input argument 1.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, V3, V4> Evaluable4<V1, V2, V3, V4, V1> identity1() {
        return Evaluable4Throwing8.<V1, V2, V3, V4, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity1()::eval;
    }

    /**
     * Return an operation that always returns its input argument 2.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, V3, V4> Evaluable4<V1, V2, V3, V4, V2> identity2() {
        return Evaluable4Throwing8.<V1, V2, V3, V4, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity2()::eval;
    }

    /**
     * Return an operation that always returns its input argument 3.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @return an operation that always returns its input argument 3
     */
    static <V1, V2, V3, V4> Evaluable4<V1, V2, V3, V4, V3> identity3() {
        return Evaluable4Throwing8.<V1, V2, V3, V4, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity3()::eval;
    }

    /**
     * Return an operation that always returns its input argument 4.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @param <V3> the type of input 3
     * @param <V4> the type of input 4
     * @return an operation that always returns its input argument 4
     */
    static <V1, V2, V3, V4> Evaluable4<V1, V2, V3, V4, V4> identity4() {
        return Evaluable4Throwing8.<V1, V2, V3, V4, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity4()::eval;
    }
}
