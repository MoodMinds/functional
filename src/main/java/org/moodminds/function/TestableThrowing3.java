package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic
 * and declares 3 possible exceptions to be thrown.
 *
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 */
@FunctionalInterface
public interface TestableThrowing3<E1 extends Exception, E2 extends Exception, E3 extends Exception>
        extends TestableThrowing4<E1, E2, E3, E3> {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     */
    @Override
    boolean test() throws E1, E2, E3;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default TestableThrowing3<E1, E2, E3> not() {
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
    default TestableThrowing3<E1, E2, E3> or(TestableThrowing8<? extends E1, ? extends E2, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3> testable) {
        return ((TestableThrowing8<E1, E2, E3, E3, E3, E3, E3, E3>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default TestableThrowing3<E1, E2, E3> and(TestableThrowing8<? extends E1, ? extends E2, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3> testable) {
        return ((TestableThrowing8<E1, E2, E3, E3, E3, E3, E3, E3>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default TestableThrowing3<E1, E2, E3> nor(TestableThrowing8<? extends E1, ? extends E2, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3> testable) {
        return ((TestableThrowing8<E1, E2, E3, E3, E3, E3, E3, E3>) this::test).nor(testable)::test;
    }

    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <E1 extends Exception, E2 extends Exception, E3 extends Exception> TestableThrowing3<E1, E2, E3> not(TestableThrowing8<? extends E1, ? extends E2, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3> testable) {
        return TestableThrowing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @return a positive testable that always returns true
     */
    static <E1 extends Exception, E2 extends Exception, E3 extends Exception> TestableThrowing3<E1, E2, E3> anyway() {
        return TestableThrowing8.<E1, E2, E3, E3, E3, E3, E3, E3>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @return a negative testable that always returns false
     */
    static <E1 extends Exception, E2 extends Exception, E3 extends Exception> TestableThrowing3<E1, E2, E3> noways() {
        return TestableThrowing8.<E1, E2, E3, E3, E3, E3, E3, E3>noways()::test;
    }
}
