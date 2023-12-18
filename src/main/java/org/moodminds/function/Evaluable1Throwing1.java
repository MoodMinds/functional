package org.moodminds.function;

/**
 * Represents an operation returning a result by the input argument
 * and declares possible exception to be thrown.
 *
 * @param <X> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Evaluable1Throwing1<X, V, E extends Exception>
        extends Evaluable1Throwing2<X, V, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    V eval(X x) throws E;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable1Throwing1<X, R, E> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((Evaluable1Throwing8<V, R, E, E, E, E, E, E, E, E>) after::eval).after(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default EvaluableThrowing1<V, E> after(EvaluableThrowing8<? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((EvaluableThrowing8<X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1> Evaluable1Throwing1<X1, V, E> after(Evaluable1Throwing8<? super X1, ? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Evaluable1Throwing8<X1, X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2> Evaluable2Throwing1<X1, X2, V, E> after(Evaluable2Throwing8<? super X1, ? super X2, ? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Evaluable2Throwing8<X1, X2, X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3> Evaluable3Throwing1<X1, X2, X3, V, E> after(Evaluable3Throwing8<? super X1, ? super X2, ? super X3, ? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Evaluable3Throwing8<X1, X2, X3, X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4> Evaluable4Throwing1<X1, X2, X3, X4, V, E> after(Evaluable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Evaluable4Throwing8<X1, X2, X3, X4, X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5> Evaluable5Throwing1<X1, X2, X3, X4, X5, V, E> after(Evaluable5Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Evaluable5Throwing8<X1, X2, X3, X4, X5, X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6> Evaluable6Throwing1<X1, X2, X3, X4, X5, X6, V, E> after(Evaluable6Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Evaluable6Throwing8<X1, X2, X3, X4, X5, X6, X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6, X7> Evaluable7Throwing1<X1, X2, X3, X4, X5, X6, X7, V, E> after(Evaluable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Evaluable7Throwing8<X1, X2, X3, X4, X5, X6, X7, X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6, X7, X8> Evaluable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, V, E> after(Evaluable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Evaluable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, X, E, E, E, E, E, E, E, E>) before::eval).then(this)::eval;
    }


    /**
     * Return an operation that always returns its input argument.
     *
     * @param <V> the type of the input and output
     * @param <E> the type of possible exception that might be thrown
     * @return an operation that always returns its input argument
     */
    static <V, E extends Exception> Evaluable1Throwing1<V, V, E> identity() {
        return Evaluable1Throwing8.<V, E, E, E, E, E, E, E, E>identity()::eval;
    }
}
