package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic on the specified 8 input arguments
 * and declares possible exception to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <X7> {@inheritDoc}
 * @param <X8> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Testable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, E extends Exception>
        extends Testable8Throwing2<X1, X2, X3, X4, X5, X6, X7, X8, E, E> {

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
     * @throws E {@inheritDoc}
     */
    @Override
    boolean test(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7, X8 x8) throws E;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, E> not() {
        return not(this);
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, E> or(Testable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E, E, E, E, E, E, E, E>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, E> and(Testable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E, E, E, E, E, E, E, E>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, E> nor(Testable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E, E, E, E, E, E, E, E>) this::test).nor(testable)::test;
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
     * @param <E> the type of possible exception that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X1, X2, X3, X4, X5, X6, X7, X8, E extends Exception> Testable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, E> not(Testable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return Testable8Throwing8.not(testable)::test;
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
     * @param <E> the type of possible exception that might be thrown
     * @return a positive testable that always returns true
     */
    static <X1, X2, X3, X4, X5, X6, X7, X8, E extends Exception> Testable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, E> anyway() {
        return Testable8Throwing8.<X1, X2, X3, X4, X5, X6, X7, X8, E, E, E, E, E, E, E, E>anyway()::test;
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
     * @param <E> the type of possible exception that might be thrown
     * @return a negative testable that always returns false
     */
    static <X1, X2, X3, X4, X5, X6, X7, X8, E extends Exception> Testable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, E> noways() {
        return Testable8Throwing8.<X1, X2, X3, X4, X5, X6, X7, X8, E, E, E, E, E, E, E, E>noways()::test;
    }
}
