package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic
 * and declares 2 possible exceptions to be thrown.
 *
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 */
@FunctionalInterface
public interface TestableThrowing2<E1 extends Exception, E2 extends Exception>
        extends TestableThrowing3<E1, E2, E2> {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     */
    @Override
    boolean test() throws E1, E2;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default TestableThrowing2<E1, E2> not() {
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
    default TestableThrowing2<E1, E2> or(TestableThrowing8<? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> testable) {
        return ((TestableThrowing8<E1, E2, E2, E2, E2, E2, E2, E2>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default TestableThrowing2<E1, E2> and(TestableThrowing8<? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> testable) {
        return ((TestableThrowing8<E1, E2, E2, E2, E2, E2, E2, E2>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default TestableThrowing2<E1, E2> nor(TestableThrowing8<? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> testable) {
        return ((TestableThrowing8<E1, E2, E2, E2, E2, E2, E2, E2>) this::test).nor(testable)::test;
    }

    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <E1 extends Exception, E2 extends Exception> TestableThrowing2<E1, E2> not(TestableThrowing8<? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> testable) {
        return TestableThrowing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @return a positive testable that always returns true
     */
    static <E1 extends Exception, E2 extends Exception> TestableThrowing2<E1, E2> anyway() {
        return TestableThrowing8.<E1, E2, E2, E2, E2, E2, E2, E2>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @return a negative testable that always returns false
     */
    static <E1 extends Exception, E2 extends Exception> TestableThrowing2<E1, E2> noways() {
        return TestableThrowing8.<E1, E2, E2, E2, E2, E2, E2, E2>noways()::test;
    }
}
