package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic
 * and declares possible exception to be thrown.
 *
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface TestableThrowing1<E extends Exception>
        extends TestableThrowing2<E, E> {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    boolean test() throws E;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default TestableThrowing1<E> not() {
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
    default TestableThrowing1<E> or(TestableThrowing8<? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((TestableThrowing8<E, E, E, E, E, E, E, E>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default TestableThrowing1<E> and(TestableThrowing8<? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((TestableThrowing8<E, E, E, E, E, E, E, E>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default TestableThrowing1<E> nor(TestableThrowing8<? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return ((TestableThrowing8<E, E, E, E, E, E, E, E>) this::test).nor(testable)::test;
    }

    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <E> the type of possible exception that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <E extends Exception> TestableThrowing1<E> not(TestableThrowing8<? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> testable) {
        return TestableThrowing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <E> the type of possible exception that might be thrown
     * @return a positive testable that always returns true
     */
    static <E extends Exception> TestableThrowing1<E> anyway() {
        return TestableThrowing8.<E, E, E, E, E, E, E, E>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <E> the type of possible exception that might be thrown
     * @return a negative testable that always returns false
     */
    static <E extends Exception> TestableThrowing1<E> noways() {
        return TestableThrowing8.<E, E, E, E, E, E, E, E>noways()::test;
    }
}
