package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic on the specified 4 input arguments
 * and declares 4 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 */
@FunctionalInterface
public interface Testable4Throwing4<X1, X2, X3, X4, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception>
        extends Testable4Throwing5<X1, X2, X3, X4, E1, E2, E3, E4, E4> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @param x4 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     */
    @Override
    boolean test(X1 x1, X2 x2, X3 x3, X4 x4) throws E1, E2, E3, E4;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable4Throwing4<X1, X2, X3, X4, E1, E2, E3, E4> not() {
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
    default Testable4Throwing4<X1, X2, X3, X4, E1, E2, E3, E4> or(Testable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> testable) {
        return ((Testable4Throwing8<X1, X2, X3, X4, E1, E2, E3, E4, E4, E4, E4, E4>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable4Throwing4<X1, X2, X3, X4, E1, E2, E3, E4> and(Testable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> testable) {
        return ((Testable4Throwing8<X1, X2, X3, X4, E1, E2, E3, E4, E4, E4, E4, E4>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable4Throwing4<X1, X2, X3, X4, E1, E2, E3, E4> nor(Testable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> testable) {
        return ((Testable4Throwing8<X1, X2, X3, X4, E1, E2, E3, E4, E4, E4, E4, E4>) this::test).nor(testable)::test;
    }

    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <X3> the type of input 3 of the testable
     * @param <X4> the type of input 4 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X1, X2, X3, X4, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> Testable4Throwing4<X1, X2, X3, X4, E1, E2, E3, E4> not(Testable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> testable) {
        return Testable4Throwing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <X3> the type of input 3 of the testable
     * @param <X4> the type of input 4 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @return a positive testable that always returns true
     */
    static <X1, X2, X3, X4, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> Testable4Throwing4<X1, X2, X3, X4, E1, E2, E3, E4> anyway() {
        return Testable4Throwing8.<X1, X2, X3, X4, E1, E2, E3, E4, E4, E4, E4, E4>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <X3> the type of input 3 of the testable
     * @param <X4> the type of input 4 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @return a negative testable that always returns false
     */
    static <X1, X2, X3, X4, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> Testable4Throwing4<X1, X2, X3, X4, E1, E2, E3, E4> noways() {
        return Testable4Throwing8.<X1, X2, X3, X4, E1, E2, E3, E4, E4, E4, E4, E4>noways()::test;
    }
}
