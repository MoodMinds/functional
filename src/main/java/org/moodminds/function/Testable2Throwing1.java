package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic on the specified 2 input arguments
 * and declares possible exception to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Testable2Throwing1<X1, X2, E extends Exception>
        extends Testable2Throwing2<X1, X2, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    boolean test(X1 x1, X2 x2) throws E;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable2Throwing1<X1, X2, E> not() {
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
    default Testable2Throwing1<X1, X2, E> or(Testable2Throwing8<? super X1, ? super X2, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable2Throwing8<X1, X2, E, E, E, E, E, E, E, E>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2Throwing1<X1, X2, E> and(Testable2Throwing8<? super X1, ? super X2, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable2Throwing8<X1, X2, E, E, E, E, E, E, E, E>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2Throwing1<X1, X2, E> nor(Testable2Throwing8<? super X1, ? super X2, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable2Throwing8<X1, X2, E, E, E, E, E, E, E, E>) this::test).nor(testable)::test;
    }

    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <E> the type of possible exception that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X1, X2, E extends Exception> Testable2Throwing1<X1, X2, E> not(Testable2Throwing8<? super X1, ? super X2, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return Testable2Throwing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <E> the type of possible exception that might be thrown
     * @return a positive testable that always returns true
     */
    static <X1, X2, E extends Exception> Testable2Throwing1<X1, X2, E> anyway() {
        return Testable2Throwing8.<X1, X2, E, E, E, E, E, E, E, E>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <E> the type of possible exception that might be thrown
     * @return a negative testable that always returns false
     */
    static <X1, X2, E extends Exception> Testable2Throwing1<X1, X2, E> noways() {
        return Testable2Throwing8.<X1, X2, E, E, E, E, E, E, E, E>noways()::test;
    }
}
