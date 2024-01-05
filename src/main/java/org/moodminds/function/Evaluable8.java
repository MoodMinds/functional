package org.moodminds.function;

/**
 * An {@link Evaluable8} that throws {@link RuntimeException}.
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
 */
@FunctionalInterface
public interface Evaluable8<X1, X2, X3, X4, X5, X6, X7, X8, V>
        extends Evaluable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, V, RuntimeException> {

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
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7, X8 x8);

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable8<X1, X2, X3, X4, X5, X6, X7, X8, R> then(Evaluable1Throwing8<? super V, ? extends R, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
        return ((Evaluable1Throwing8<V, R, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) after::eval).after(this)::eval;
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
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8> Evaluable8<V1, V2, V3, V4, V5, V6, V7, V8, V1> identity1() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity1()::eval;
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
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8> Evaluable8<V1, V2, V3, V4, V5, V6, V7, V8, V2> identity2() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity2()::eval;
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
     * @return an operation that always returns its input argument 3
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8> Evaluable8<V1, V2, V3, V4, V5, V6, V7, V8, V3> identity3() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity3()::eval;
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
     * @return an operation that always returns its input argument 4
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8> Evaluable8<V1, V2, V3, V4, V5, V6, V7, V8, V4> identity4() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity4()::eval;
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
     * @return an operation that always returns its input argument 5
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8> Evaluable8<V1, V2, V3, V4, V5, V6, V7, V8, V5> identity5() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity5()::eval;
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
     * @return an operation that always returns its input argument 6
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8> Evaluable8<V1, V2, V3, V4, V5, V6, V7, V8, V6> identity6() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity6()::eval;
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
     * @return an operation that always returns its input argument 7
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8> Evaluable8<V1, V2, V3, V4, V5, V6, V7, V8, V7> identity7() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity7()::eval;
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
     * @return an operation that always returns its input argument 8
     */
    static <V1, V2, V3, V4, V5, V6, V7, V8> Evaluable8<V1, V2, V3, V4, V5, V6, V7, V8, V8> identity8() {
        return Evaluable8Throwing8.<V1, V2, V3, V4, V5, V6, V7, V8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity8()::eval;
    }
}
