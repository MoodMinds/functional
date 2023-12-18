package org.moodminds.function;

import static java.util.Objects.requireNonNull;

/**
 * Represents an operation that executes some action logic on the specified 4 input arguments
 * and declares 8 possible exceptions to be thrown.
 *
 * @param <X1> the type of input 1
 * @param <X2> the type of input 2
 * @param <X3> the type of input 3
 * @param <X4> the type of input 4
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
public interface Executable4Throwing8<X1, X2, X3, X4, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> {

    /**
     * Execute the action logic by the specified 4 input arguments.
     *
     * @param x1 the specified input argument 1
     * @param x2 the specified input argument 2
     * @param x3 the specified input argument 3
     * @param x4 the specified input argument 4
     * @throws E1 an exception 1 in some exceptional case
     * @throws E2 an exception 2 in some exceptional case
     * @throws E3 an exception 3 in some exceptional case
     * @throws E4 an exception 4 in some exceptional case
     * @throws E5 an exception 5 in some exceptional case
     * @throws E6 an exception 6 in some exceptional case
     * @throws E7 an exception 7 in some exceptional case
     * @throws E8 an exception 8 in some exceptional case
     */
    void exec(X1 x1, X2 x2, X3 x3, X4 x4) throws E1, E2, E3, E4, E5, E6, E7, E8;

    /**
     * Return a composed operation that first executes this action logic by the given input,
     * and then executes the action logic of the {@code after} operation.
     *
     * @param after the operation to execute after this operation is executed
     * @return a composed operation that first executes this action logic by the given input,
     * and then executes the action logic of the {@code after} operation
     * @throws NullPointerException if the given after is {@code null}
     */
    default Executable4Throwing8<X1, X2, X3, X4, E1, E2, E3, E4, E5, E6, E7, E8> then(Executable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> after) {
        return ((Executable4Throwing8<X1, X2, X3, X4, E1, E2, E3, E4, E5, E6, E7, E8>) after::exec).after(this);
    }

    /**
     * Return a composed operation that first executes the {@code before} action logic by the given input,
     * and then executes the action logic of this operation.
     *
     * @param before the operation to execute before this operation is executed
     * @return a composed operation that first executes the {@code before} action logic by the given input,
     * and then executes the action logic of this operation
     * @throws NullPointerException if the given before is {@code null}
     */
    default Executable4Throwing8<X1, X2, X3, X4, E1, E2, E3, E4, E5, E6, E7, E8> after(Executable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> before) {
        requireNonNull(before);
        return (x1, x2, x3, x4) -> { before.exec(x1, x2, x3, x4); exec(x1, x2, x3, x4); };
    }

    /**
     * Return an idle executable that does nothing.
     *
     * @param <X1> the type of input 1 of the executable
     * @param <X2> the type of input 2 of the executable
     * @param <X3> the type of input 3 of the executable
     * @param <X4> the type of input 4 of the executable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @param <E7> the type of possible exception 7 that might be thrown
     * @param <E8> the type of possible exception 8 that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, X3, X4, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> Executable4Throwing8<X1, X2, X3, X4, E1, E2, E3, E4, E5, E6, E7, E8> idle() {
        return (x1, x2, x3, x4) -> {};
    }
}
