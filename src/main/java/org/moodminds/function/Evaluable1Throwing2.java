package org.moodminds.function;

/**
 * Represents an operation returning a result by the input argument
 * and declares 2 possible exceptions to be thrown.
 *
 * @param <X> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable1Throwing2<X, V, E1 extends Exception, E2 extends Exception>
        extends Evaluable1Throwing3<X, V, E1, E2, E2> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     */
    @Override
    V eval(X x) throws E1, E2;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable1Throwing2<X, R, E1, E2> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E2, E2, E2, E2, E2, E2>) after::eval).after(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default EvaluableThrowing2<V, E1, E2> after(EvaluableThrowing8<? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((EvaluableThrowing8<X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1> Evaluable1Throwing2<X1, V, E1, E2> after(Evaluable1Throwing8<? super X1, ? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Evaluable1Throwing8<X1, X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2> Evaluable2Throwing2<X1, X2, V, E1, E2> after(Evaluable2Throwing8<? super X1, ? super X2, ? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Evaluable2Throwing8<X1, X2, X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3> Evaluable3Throwing2<X1, X2, X3, V, E1, E2> after(Evaluable3Throwing8<? super X1, ? super X2, ? super X3, ? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Evaluable3Throwing8<X1, X2, X3, X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4> Evaluable4Throwing2<X1, X2, X3, X4, V, E1, E2> after(Evaluable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Evaluable4Throwing8<X1, X2, X3, X4, X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5> Evaluable5Throwing2<X1, X2, X3, X4, X5, V, E1, E2> after(Evaluable5Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Evaluable5Throwing8<X1, X2, X3, X4, X5, X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6> Evaluable6Throwing2<X1, X2, X3, X4, X5, X6, V, E1, E2> after(Evaluable6Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Evaluable6Throwing8<X1, X2, X3, X4, X5, X6, X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6, X7> Evaluable7Throwing2<X1, X2, X3, X4, X5, X6, X7, V, E1, E2> after(Evaluable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Evaluable7Throwing8<X1, X2, X3, X4, X5, X6, X7, X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6, X7, X8> Evaluable8Throwing2<X1, X2, X3, X4, X5, X6, X7, X8, V, E1, E2> after(Evaluable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Evaluable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, X, E1, E2, E2, E2, E2, E2, E2, E2>) before::eval).then(this)::eval;
    }


    /**
     * Return an operation that always returns its input argument.
     *
     * @param <V> the type of the input and output
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @return an operation that always returns its input argument
     */
    static <V, E1 extends Exception, E2 extends Exception> Evaluable1Throwing2<V, V, E1, E2> identity() {
        return Evaluable1Throwing8.<V, E1, E2, E2, E2, E2, E2, E2, E2>identity()::eval;
    }
}
