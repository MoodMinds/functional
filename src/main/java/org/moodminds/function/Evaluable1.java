package org.moodminds.function;

import java.util.function.Function;

/**
 * An {@link Evaluable1Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X> {@inheritDoc}
 * @param <V> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable1<X, V>
        extends Evaluable1Throwing1<X, V, RuntimeException>, Function<X, V> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    default V eval(X x) {
        return apply(x);
    }

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable1<X, R> then(Evaluable1Throwing8<? super V, ? extends R, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
        return andThen(after::eval);
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Evaluable<V> after(EvaluableThrowing8<? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((EvaluableThrowing8<X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1> Evaluable1<X1, V> after(Evaluable1Throwing8<? super X1, ? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return compose(before::eval);
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2> Evaluable2<X1, X2, V> after(Evaluable2Throwing8<? super X1, ? super X2, ? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Evaluable2Throwing8<X1, X2, X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3> Evaluable3<X1, X2, X3, V> after(Evaluable3Throwing8<? super X1, ? super X2, ? super X3, ? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Evaluable3Throwing8<X1, X2, X3, X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4> Evaluable4<X1, X2, X3, X4, V> after(Evaluable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Evaluable4Throwing8<X1, X2, X3, X4, X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5> Evaluable5<X1, X2, X3, X4, X5, V> after(Evaluable5Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Evaluable5Throwing8<X1, X2, X3, X4, X5, X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6> Evaluable6<X1, X2, X3, X4, X5, X6, V> after(Evaluable6Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Evaluable6Throwing8<X1, X2, X3, X4, X5, X6, X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6, X7> Evaluable7<X1, X2, X3, X4, X5, X6, X7, V> after(Evaluable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Evaluable7Throwing8<X1, X2, X3, X4, X5, X6, X7, X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6, X7, X8> Evaluable8<X1, X2, X3, X4, X5, X6, X7, X8, V> after(Evaluable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Evaluable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable1<X, R> andThen(Function<? super V, ? extends R> after) {
        return Function.super.andThen(after)::apply;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <I> Evaluable1<I, V> compose(Function<? super I, ? extends X> before) {
        return Function.super.compose(before)::apply;
    }


    /**
     * Return an operation that always returns its input argument.
     *
     * @param <V> the type of the input and output
     * @return an operation that always returns its input argument
     */
    static <V> Evaluable1<V, V> identity() {
        return Function.<V>identity()::apply;
    }
}
