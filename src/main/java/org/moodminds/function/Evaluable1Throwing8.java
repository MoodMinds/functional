package org.moodminds.function;

import static java.util.Objects.requireNonNull;

/**
 * Represents an operation returning a result by the input argument
 * and declares 8 possible exceptions to be thrown.
 *
 * @param <X> the type of the input
 * @param <V> the type of the result
 * @param <E1> the type of possible exception 1 that might be thrown
 * @param <E2> the type of possible exception 2 that might be thrown
 * @param <E3> the type of possible exception 3 that might be thrown
 * @param <E4> the type of possible exception 4 that might be thrown
 * @param <E5> the type of possible exception 5 that might be thrown
 * @param <E6> the type of possible exception 6 that might be thrown
 * @param <E7> the type of possible exception 7 that might be thrown
 * @param <E8> the type of possible exception 8 that might be thrown
 */
@FunctionalInterface
public interface Evaluable1Throwing8<X, V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> {

    /**
     * Perform the operation by the specified input argument and return the result.
     *
     * @param x the specified input argument
     * @return the operation result
     * @throws E1 an exception 1 in some exceptional case
     * @throws E2 an exception 2 in some exceptional case
     * @throws E3 an exception 3 in some exceptional case
     * @throws E4 an exception 4 in some exceptional case
     * @throws E5 an exception 5 in some exceptional case
     * @throws E6 an exception 6 in some exceptional case
     * @throws E7 an exception 7 in some exceptional case
     * @throws E8 an exception 8 in some exceptional case
     */
    V eval(X x) throws E1, E2, E3, E4, E5, E6, E7, E8;

    /**
     * Return a composed operation that first evaluates this operation by the given input,
     * and then evaluates the {@code after} operation by the result.
     *
     * @param <R> the type of output of the {@code after} operation, and of the composed operation
     * @param after the operation to apply after this operation is applied
     * @return a composed operation that first applies this operation and then applies the {@code after} operation
     * @throws NullPointerException if the given after is {@code null}
     */
    default <R> Evaluable1Throwing8<X, R, E1, E2, E3, E4, E5, E6, E7, E8> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E4, E5, E6, E7, E8>) after::eval).after(this);
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @throws NullPointerException if the given before is {@code null}
     */
    default EvaluableThrowing8<V, E1, E2, E3, E4, E5, E6, E7, E8> after(EvaluableThrowing8<? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return () -> eval(before.eval());
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation by the given input,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @param <X1> the type of input 1 value
     * @throws NullPointerException if the given before is {@code null}
     */
    default <X1> Evaluable1Throwing8<X1, V, E1, E2, E3, E4, E5, E6, E7, E8> after(Evaluable1Throwing8<? super X1, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x) -> eval(before.eval(x));
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation by the given input,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @param <X1> the type of input 1 value
     * @param <X2> the type of input 2 value
     * @throws NullPointerException if the given before is {@code null}
     */
    default <X1, X2> Evaluable2Throwing8<X1, X2, V, E1, E2, E3, E4, E5, E6, E7, E8> after(Evaluable2Throwing8<? super X1, ? super X2, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x1, x2) -> eval(before.eval(x1, x2));
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation by the given input,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @param <X1> the type of input 1 value
     * @param <X2> the type of input 2 value
     * @param <X3> the type of input 3 value
     * @throws NullPointerException if the given before is {@code null}
     */
    default <X1, X2, X3> Evaluable3Throwing8<X1, X2, X3, V, E1, E2, E3, E4, E5, E6, E7, E8> after(Evaluable3Throwing8<? super X1, ? super X2, ? super X3, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x1, x2, x3) -> eval(before.eval(x1, x2, x3));
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation by the given input,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @param <X1> the type of input 1 value
     * @param <X2> the type of input 2 value
     * @param <X3> the type of input 3 value
     * @param <X4> the type of input 4 value
     * @throws NullPointerException if the given before is {@code null}
     */
    default <X1, X2, X3, X4> Evaluable4Throwing8<X1, X2, X3, X4, V, E1, E2, E3, E4, E5, E6, E7, E8> after(Evaluable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x1, x2, x3, x4) -> eval(before.eval(x1, x2, x3, x4));
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation by the given input,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @param <X1> the type of input 1 value
     * @param <X2> the type of input 2 value
     * @param <X3> the type of input 3 value
     * @param <X4> the type of input 4 value
     * @param <X5> the type of input 5 value
     * @throws NullPointerException if the given before is {@code null}
     */
    default <X1, X2, X3, X4, X5> Evaluable5Throwing8<X1, X2, X3, X4, X5, V, E1, E2, E3, E4, E5, E6, E7, E8> after(Evaluable5Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x1, x2, x3, x4, x5) -> eval(before.eval(x1, x2, x3, x4, x5));
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation by the given input,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @param <X1> the type of input 1 value
     * @param <X2> the type of input 2 value
     * @param <X3> the type of input 3 value
     * @param <X4> the type of input 4 value
     * @param <X5> the type of input 5 value
     * @param <X6> the type of input 6 value
     * @throws NullPointerException if the given before is {@code null}
     */
    default <X1, X2, X3, X4, X5, X6> Evaluable6Throwing8<X1, X2, X3, X4, X5, X6, V, E1, E2, E3, E4, E5, E6, E7, E8> after(Evaluable6Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x1, x2, x3, x4, x5, x6) -> eval(before.eval(x1, x2, x3, x4, x5, x6));
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation by the given input,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @param <X1> the type of input 1 value
     * @param <X2> the type of input 2 value
     * @param <X3> the type of input 3 value
     * @param <X4> the type of input 4 value
     * @param <X5> the type of input 5 value
     * @param <X6> the type of input 6 value
     * @param <X7> the type of input 7 value
     * @throws NullPointerException if the given before is {@code null}
     */
    default <X1, X2, X3, X4, X5, X6, X7> Evaluable7Throwing8<X1, X2, X3, X4, X5, X6, X7, V, E1, E2, E3, E4, E5, E6, E7, E8> after(Evaluable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x1, x2, x3, x4, x5, x6, x7) -> eval(before.eval(x1, x2, x3, x4, x5, x6, x7));
    }

    /**
     * Return a composed operation that first evaluates the {@code before} operation by the given input,
     * and then evaluates this operation by the result.
     *
     * @param before the operation to apply before this operation is applied
     * @return a composed operation that first applies the {@code before} operation, and then applies this operation
     * @param <X1> the type of input 1 value
     * @param <X2> the type of input 2 value
     * @param <X3> the type of input 3 value
     * @param <X4> the type of input 4 value
     * @param <X5> the type of input 5 value
     * @param <X6> the type of input 6 value
     * @param <X7> the type of input 7 value
     * @param <X8> the type of input 8 value
     * @throws NullPointerException if the given before is {@code null}
     */
    default <X1, X2, X3, X4, X5, X6, X7, X8> Evaluable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, V, E1, E2, E3, E4, E5, E6, E7, E8> after(Evaluable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x1, x2, x3, x4, x5, x6, x7, x8) -> eval(before.eval(x1, x2, x3, x4, x5, x6, x7, x8));
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
     * @param <E8> the type of possible exception 8 that might be thrown
     * @return an operation that always returns its input argument
     */
    static <V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> Evaluable1Throwing8<V, V, E1, E2, E3, E4, E5, E6, E7, E8> identity() {
        return v -> v;
    }
}
