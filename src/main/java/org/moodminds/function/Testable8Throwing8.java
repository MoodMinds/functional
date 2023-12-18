package org.moodminds.function;

import static java.util.Objects.requireNonNull;

/**
 * Represents an operation that executes some testing logic on the specified 8 input arguments
 * and declares 8 possible exceptions to be thrown.
 *
 * @param <X1> the type of input 1
 * @param <X2> the type of input 2
 * @param <X3> the type of input 3
 * @param <X4> the type of input 4
 * @param <X5> the type of input 5
 * @param <X6> the type of input 6
 * @param <X7> the type of input 7
 * @param <X8> the type of input 8
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
public interface Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> {

    /**
     * Evaluate this testable on the specified arguments.
     *
     * @param x1 the specified input argument 1
     * @param x2 the specified input argument 2
     * @param x3 the specified input argument 3
     * @param x4 the specified input argument 4
     * @param x5 the specified input argument 5
     * @param x6 the specified input argument 6
     * @param x7 the specified input argument 7
     * @param x8 the specified input argument 8
     * @return true if the input arguments match this testable, or false otherwise
     * @throws E1 an exception 1 in some exceptional case
     * @throws E2 an exception 2 in some exceptional case
     * @throws E3 an exception 3 in some exceptional case
     * @throws E4 an exception 4 in some exceptional case
     * @throws E5 an exception 5 in some exceptional case
     * @throws E6 an exception 6 in some exceptional case
     * @throws E7 an exception 7 in some exceptional case
     * @throws E8 an exception 8 in some exceptional case
     */
    boolean test(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7, X8 x8) throws E1, E2, E3, E4, E5, E6, E7, E8;

    /**
     * Return a testable that represents the logical negation of this testable.
     *
     * @return a testable that represents the logical negation of this testable
     */
    default Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E5, E6, E7, E8> not() {
        return not(this);
    }

    /**
     * Return a composed testable that represents a logical OR of this testable and the given one.
     *
     * @param testable a testable that will be logically OR -evaluated with this testable
     * @return a composed testable that represents a logical OR of this testable and the given one
     * @throws NullPointerException if the given testable is {@code null}
     */
    default Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E5, E6, E7, E8> or(Testable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> testable) {
        requireNonNull(testable);
        return (x1, x2, x3, x4, x5, x6, x7, x8) -> test(x1, x2, x3, x4, x5, x6, x7, x8) || testable.test(x1, x2, x3, x4, x5, x6, x7, x8);
    }

    /**
     * Return a composed testable that represents a logical AND of this testable and the given one.
     *
     * @param testable a testable that will be logically AND -evaluated with this testable
     * @return a composed testable that represents a logical AND of this testable and the given one
     * @throws NullPointerException if the given testable is {@code null}
     */
    default Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E5, E6, E7, E8> and(Testable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> testable) {
        requireNonNull(testable);
        return (x1, x2, x3, x4, x5, x6, x7, x8) -> test(x1, x2, x3, x4, x5, x6, x7, x8) && testable.test(x1, x2, x3, x4, x5, x6, x7, x8);
    }

    /**
     * Return a composed testable that represents a logical negation of this testable and the given one.
     *
     * @param testable a testable that will be logically negated with this testable
     * @return a composed testable that represents a logical negation of this testable and the given one
     * @throws NullPointerException if the given testable is {@code null}
     */
    default Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E5, E6, E7, E8> nor(Testable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> testable) {
        return or(testable).not();
    }


    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <X3> the type of input 3 of the testable
     * @param <X4> the type of input 4 of the testable
     * @param <X5> the type of input 5 of the testable
     * @param <X6> the type of input 6 of the testable
     * @param <X7> the type of input 7 of the testable
     * @param <X8> the type of input 8 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @param <E7> the type of possible exception 7 that might be thrown
     * @param <E8> the type of possible exception 8 that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X1, X2, X3, X4, X5, X6, X7, X8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E5, E6, E7, E8> not(Testable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E8> testable) {
        requireNonNull(testable);
        return (x1, x2, x3, x4, x5, x6, x7, x8) -> !testable.test(x1, x2, x3, x4, x5, x6, x7, x8);
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <X3> the type of input 3 of the testable
     * @param <X4> the type of input 4 of the testable
     * @param <X5> the type of input 5 of the testable
     * @param <X6> the type of input 6 of the testable
     * @param <X7> the type of input 7 of the testable
     * @param <X8> the type of input 8 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @param <E7> the type of possible exception 7 that might be thrown
     * @param <E8> the type of possible exception 8 that might be thrown
     * @return a positive testable that always returns true
     */
    static <X1, X2, X3, X4, X5, X6, X7, X8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E5, E6, E7, E8> anyway() {
        return (x1, x2, x3, x4, x5, x6, x7, x8) -> true;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <X3> the type of input 3 of the testable
     * @param <X4> the type of input 4 of the testable
     * @param <X5> the type of input 5 of the testable
     * @param <X6> the type of input 6 of the testable
     * @param <X7> the type of input 7 of the testable
     * @param <X8> the type of input 8 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @param <E7> the type of possible exception 7 that might be thrown
     * @param <E8> the type of possible exception 8 that might be thrown
     * @return a negative testable that always returns false
     */
    static <X1, X2, X3, X4, X5, X6, X7, X8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception, E8 extends Exception> Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E5, E6, E7, E8> noways() {
        return (x1, x2, x3, x4, x5, x6, x7, x8) -> false;
    }
}
