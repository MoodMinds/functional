package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic on the specified input argument
 * and declares 4 possible exceptions to be thrown.
 *
 * @param <X> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 */
@FunctionalInterface
public interface Testable1Throwing4<X, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception>
        extends Testable1Throwing5<X, E1, E2, E3, E4, E4> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     */
    @Override
    boolean test(X x) throws E1, E2, E3, E4;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable1Throwing4<X, E1, E2, E3, E4> not() {
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
    default Testable1Throwing4<X, E1, E2, E3, E4> or(Testable1Throwing8<? super X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> testable) {
        return ((Testable1Throwing8<X, E1, E2, E3, E4, E4, E4, E4, E4>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable1Throwing4<X, E1, E2, E3, E4> and(Testable1Throwing8<? super X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> testable) {
        return ((Testable1Throwing8<X, E1, E2, E3, E4, E4, E4, E4, E4>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable1Throwing4<X, E1, E2, E3, E4> nor(Testable1Throwing8<? super X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> testable) {
        return ((Testable1Throwing8<X, E1, E2, E3, E4, E4, E4, E4, E4>) this::test).nor(testable)::test;
    }


    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <X> the input type of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> Testable1Throwing4<X, E1, E2, E3, E4> not(Testable1Throwing8<? super X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> testable) {
        return Testable1Throwing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <X> the input type of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @return a positive testable that always returns true
     */
    static <X, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> Testable1Throwing4<X, E1, E2, E3, E4> anyway() {
        return Testable1Throwing8.<X, E1, E2, E3, E4, E4, E4, E4, E4>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <X> the input type of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @return a negative testable that always returns false
     */
    static <X, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> Testable1Throwing4<X, E1, E2, E3, E4> noways() {
        return Testable1Throwing8.<X, E1, E2, E3, E4, E4, E4, E4, E4>noways()::test;
    }
}
