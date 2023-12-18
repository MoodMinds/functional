package org.moodminds.function;

/**
 * Represents an operation returning a result by the input argument
 * and declares 7 possible exceptions to be thrown.
 *
 * @param <X> {@inheritDoc}
 * @param <V> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 * @param <E5> {@inheritDoc}
 * @param <E6> {@inheritDoc}
 * @param <E7> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable1Throwing7<X, V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception>
        extends Evaluable1Throwing8<X, V, E1, E2, E3, E4, E5, E6, E7, E7> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     * @throws E5 {@inheritDoc}
     * @throws E6 {@inheritDoc}
     * @throws E7 {@inheritDoc}
     */
    @Override
    V eval(X x) throws E1, E2, E3, E4, E5, E6, E7;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable1Throwing7<X, R, E1, E2, E3, E4, E5, E6, E7> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E4, E5, E6, E7, E7>) after::eval).after(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default EvaluableThrowing7<V, E1, E2, E3, E4, E5, E6, E7> after(EvaluableThrowing8<? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((EvaluableThrowing8<X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1> Evaluable1Throwing7<X1, V, E1, E2, E3, E4, E5, E6, E7> after(Evaluable1Throwing8<? super X1, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Evaluable1Throwing8<X1, X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2> Evaluable2Throwing7<X1, X2, V, E1, E2, E3, E4, E5, E6, E7> after(Evaluable2Throwing8<? super X1, ? super X2, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Evaluable2Throwing8<X1, X2, X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3> Evaluable3Throwing7<X1, X2, X3, V, E1, E2, E3, E4, E5, E6, E7> after(Evaluable3Throwing8<? super X1, ? super X2, ? super X3, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Evaluable3Throwing8<X1, X2, X3, X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4> Evaluable4Throwing7<X1, X2, X3, X4, V, E1, E2, E3, E4, E5, E6, E7> after(Evaluable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Evaluable4Throwing8<X1, X2, X3, X4, X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5> Evaluable5Throwing7<X1, X2, X3, X4, X5, V, E1, E2, E3, E4, E5, E6, E7> after(Evaluable5Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Evaluable5Throwing8<X1, X2, X3, X4, X5, X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6> Evaluable6Throwing7<X1, X2, X3, X4, X5, X6, V, E1, E2, E3, E4, E5, E6, E7> after(Evaluable6Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Evaluable6Throwing8<X1, X2, X3, X4, X5, X6, X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6, X7> Evaluable7Throwing7<X1, X2, X3, X4, X5, X6, X7, V, E1, E2, E3, E4, E5, E6, E7> after(Evaluable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Evaluable7Throwing8<X1, X2, X3, X4, X5, X6, X7, X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <X1, X2, X3, X4, X5, X6, X7, X8> Evaluable8Throwing7<X1, X2, X3, X4, X5, X6, X7, X8, V, E1, E2, E3, E4, E5, E6, E7> after(Evaluable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Evaluable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, X, E1, E2, E3, E4, E5, E6, E7, E7>) before::eval).then(this)::eval;
    }

    /**
     * Return an operation that always returns its input argument.
     *
     * @param <V> the type of the input and output
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @param <E7> the type of possible exception 7 that might be thrown
     * @return an operation that always returns its input argument
     */
    static <V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception> Evaluable1Throwing7<V, V, E1, E2, E3, E4, E5, E6, E7> identity() {
        return Evaluable1Throwing8.<V, E1, E2, E3, E4, E5, E6, E7, E7>identity()::eval;
    }
}
