package org.moodminds.function;

/**
 * A {@link Testable7Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <X7> {@inheritDoc}
 */
@FunctionalInterface
public interface Testable7<X1, X2, X3, X4, X5, X6, X7>
        extends Testable7Throwing1<X1, X2, X3, X4, X5, X6, X7, RuntimeException> {

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
     * @return {@inheritDoc}
     */
    @Override
    boolean test(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7);

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable7<X1, X2, X3, X4, X5, X6, X7> not() {
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
    default Testable7<X1, X2, X3, X4, X5, X6, X7> or(Testable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> testable) {
        return ((Testable7Throwing8<X1, X2, X3, X4, X5, X6, X7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) this::test).or(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable7<X1, X2, X3, X4, X5, X6, X7> and(Testable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> testable) {
        return ((Testable7Throwing8<X1, X2, X3, X4, X5, X6, X7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) this::test).and(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable7<X1, X2, X3, X4, X5, X6, X7> nor(Testable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> testable) {
        return ((Testable7Throwing8<X1, X2, X3, X4, X5, X6, X7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) this::test).nor(testable)::test;
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
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X1, X2, X3, X4, X5, X6, X7> Testable7<X1, X2, X3, X4, X5, X6, X7> not(Testable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> testable) {
        return Testable7Throwing8.not(testable)::test;
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
     * @return a positive testable that always returns true
     */
    static <X1, X2, X3, X4, X5, X6, X7> Testable7<X1, X2, X3, X4, X5, X6, X7> anyway() {
        return Testable7Throwing8.<X1, X2, X3, X4, X5, X6, X7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>anyway()::test;
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
     * @return a negative testable that always returns false
     */
    static <X1, X2, X3, X4, X5, X6, X7> Testable7<X1, X2, X3, X4, X5, X6, X7> noways() {
        return Testable7Throwing8.<X1, X2, X3, X4, X5, X6, X7, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>noways()::test;
    }
}
