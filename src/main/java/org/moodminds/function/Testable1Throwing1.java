package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic on the specified input argument
 * and declares possible exception to be thrown.
 *
 * @param <X> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Testable1Throwing1<X, E extends Exception>
        extends Testable1Throwing2<X, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    boolean test(X x) throws E;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable1Throwing1<X, E> not() {
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
    default Testable1Throwing1<X, E> or(Testable1Throwing8<? super X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable1Throwing8<X, E, E, E, E, E, E, E, E>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable1Throwing1<X, E> and(Testable1Throwing8<? super X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable1Throwing8<X, E, E, E, E, E, E, E, E>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable1Throwing1<X, E> nor(Testable1Throwing8<? super X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((Testable1Throwing8<X, E, E, E, E, E, E, E, E>) this::test).nor(testable)::test;
    }


    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <X> the input type of the testable
     * @param <E> the type of possible exception that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X, E extends Exception> Testable1Throwing1<X, E> not(Testable1Throwing8<? super X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return Testable1Throwing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <X> the input type of the testable
     * @param <E> the type of possible exception that might be thrown
     * @return a positive testable that always returns true
     */
    static <X, E extends Exception> Testable1Throwing1<X, E> anyway() {
        return Testable1Throwing8.<X, E, E, E, E, E, E, E, E>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <X> the input type of the testable
     * @param <E> the type of possible exception that might be thrown
     * @return a negative testable that always returns false
     */
    static <X, E extends Exception> Testable1Throwing1<X, E> noways() {
        return Testable1Throwing8.<X, E, E, E, E, E, E, E, E>noways()::test;
    }
}
