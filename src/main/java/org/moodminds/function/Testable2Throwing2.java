package org.moodminds.function;

/**
 * Represents an operation that executes some testing logic on the specified 2 input arguments
 * and declares 2 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 */
@FunctionalInterface
public interface Testable2Throwing2<X1, X2, E1 extends Exception, E2 extends Exception>
        extends Testable2Throwing3<X1, X2, E1, E2, E2> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @return {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     */
    @Override
    boolean test(X1 x1, X2 x2) throws E1, E2;

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable2Throwing2<X1, X2, E1, E2> not() {
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
    default Testable2Throwing2<X1, X2, E1, E2> or(Testable2Throwing8<? super X1, ? super X2, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> testable) {
        return ((Testable2Throwing8<X1, X2, E1, E2, E2, E2, E2, E2, E2, E2>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2Throwing2<X1, X2, E1, E2> and(Testable2Throwing8<? super X1, ? super X2, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> testable) {
        return ((Testable2Throwing8<X1, X2, E1, E2, E2, E2, E2, E2, E2, E2>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2Throwing2<X1, X2, E1, E2> nor(Testable2Throwing8<? super X1, ? super X2, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> testable) {
        return ((Testable2Throwing8<X1, X2, E1, E2, E2, E2, E2, E2, E2, E2>) this::test).nor(testable)::test;
    }

    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X1, X2, E1 extends Exception, E2 extends Exception> Testable2Throwing2<X1, X2, E1, E2> not(Testable2Throwing8<? super X1, ? super X2, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> testable) {
        return Testable2Throwing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @return a positive testable that always returns true
     */
    static <X1, X2, E1 extends Exception, E2 extends Exception> Testable2Throwing2<X1, X2, E1, E2> anyway() {
        return Testable2Throwing8.<X1, X2, E1, E2, E2, E2, E2, E2, E2, E2>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @return a negative testable that always returns false
     */
    static <X1, X2, E1 extends Exception, E2 extends Exception> Testable2Throwing2<X1, X2, E1, E2> noways() {
        return Testable2Throwing8.<X1, X2, E1, E2, E2, E2, E2, E2, E2, E2>noways()::test;
    }
}
