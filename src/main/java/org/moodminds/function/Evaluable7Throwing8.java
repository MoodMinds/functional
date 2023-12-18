package org.moodminds.function;

/**
 * Represents an operation returning a result by the 7 input arguments
 * and declares 8 possible exceptions to be thrown.
 *
 * @param <X1> the type of input 1
 * @param <X2> the type of input 2
 * @param <X3> the type of input 3
 * @param <X4> the type of input 4
 * @param <X5> the type of input 5
 * @param <X6> the type of input 6
 * @param <X7> the type of input 7
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
public interface Evaluable7Throwing8<X1, X2, X3, X4, X5, X6, X7, V, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> {

    /**
     * Perform the operation by the specified 7 input arguments and return the result.
     *
     * @param x1 the specified input argument 1
     * @param x2 the specified input argument 2
     * @param x3 the specified input argument 3
     * @param x4 the specified input argument 4
     * @param x5 the specified input argument 5
     * @param x6 the specified input argument 6
     * @param x7 the specified input argument 7
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
    V eval(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7) throws E1, E2, E3, E4, E5, E6, E7, E8;

    /**
     * Return a composed operation that first evaluates this operation by the given input,
     * and then evaluates the {@code after} operation by the result.
     *
     * @param <R> the type of output of the {@code after} operation, and of the composed operation
     * @param after the operation to apply after this operation is applied
     * @return a composed operation that first applies this operation and then applies the {@code after} operation
     * @throws NullPointerException if the given after is {@code null}
     */
    default <R> Evaluable7Throwing8<X1, X2, X3, X4, X5, X6, X7, R, E1, E2, E3, E4, E5, E6, E7, E8> then(Evaluable1Throwing8<? super V, ? extends R, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> after) {
        return ((Evaluable1Throwing8<V, R, E1, E2, E3, E4, E5, E6, E7, E8>) after::eval).after(this);
    }
}
