package org.moodminds.function;

/**
 * An {@link Evaluable7Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <X7> {@inheritDoc}
 * @param <V> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable7<X1, X2, X3, X4, X5, X6, X7, V>
        extends Evaluable7Throwing1<X1, X2, X3, X4, X5, X6, X7, V, RuntimeException> {

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
     */
    @Override
    V eval(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7);

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable7<X1, X2, X3, X4, X5, X6, X7, R> then(Evaluable1Throwing8<? super V, ? extends R, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
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
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2, V3, V4, V5, V6, V7> Evaluable7<V1, V2, V3, V4, V5, V6, V7, V1> identity1() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity1()::eval;
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
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2, V3, V4, V5, V6, V7> Evaluable7<V1, V2, V3, V4, V5, V6, V7, V2> identity2() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity2()::eval;
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
     * @return an operation that always returns its input argument 3
     */
    static <V1, V2, V3, V4, V5, V6, V7> Evaluable7<V1, V2, V3, V4, V5, V6, V7, V3> identity3() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity3()::eval;
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
     * @return an operation that always returns its input argument 4
     */
    static <V1, V2, V3, V4, V5, V6, V7> Evaluable7<V1, V2, V3, V4, V5, V6, V7, V4> identity4() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity4()::eval;
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
     * @return an operation that always returns its input argument 5
     */
    static <V1, V2, V3, V4, V5, V6, V7> Evaluable7<V1, V2, V3, V4, V5, V6, V7, V5> identity5() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity5()::eval;
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
     * @return an operation that always returns its input argument 6
     */
    static <V1, V2, V3, V4, V5, V6, V7> Evaluable7<V1, V2, V3, V4, V5, V6, V7, V6> identity6() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity6()::eval;
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
     * @return an operation that always returns its input argument 7
     */
    static <V1, V2, V3, V4, V5, V6, V7> Evaluable7<V1, V2, V3, V4, V5, V6, V7, V7> identity7() {
        return Evaluable7Throwing8.<V1, V2, V3, V4, V5, V6, V7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity7()::eval;
    }
}
