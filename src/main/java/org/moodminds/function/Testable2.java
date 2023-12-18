package org.moodminds.function;

import java.util.function.BiPredicate;

/**
 * A {@link Testable2Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 */
@FunctionalInterface
public interface Testable2<X1, X2>
        extends Testable2Throwing1<X1, X2, RuntimeException>, BiPredicate<X1, X2> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    boolean test(X1 x1, X2 x2);

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable2<X1, X2> not() {
        return negate();
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2<X1, X2> or(Testable2Throwing8<? super X1, ? super X2, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> testable) {
        return or((BiPredicate<? super X1, ? super X2>) testable::test);
    }

    /**
     * Return a composed testable that represents a logical OR of this testable and the given one.
     *
     * @param testable a testable that will be logically OR -evaluated with this testable
     * @return a composed testable that represents a logical OR of this testable and the given one
     * @throws NullPointerException if the given testable is {@code null}
     */
    default Testable2<X1, X2> or(Testable2<? super X1, ? super X2> testable) {
        return or((BiPredicate<? super X1, ? super X2>) testable);
    }

    /**
     * {@inheritDoc}
     *
     * @param other {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2<X1, X2> or(BiPredicate<? super X1, ? super X2> other) {
        return BiPredicate.super.or(other)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2<X1, X2> and(Testable2Throwing8<? super X1, ? super X2, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> testable) {
        return and((BiPredicate<? super X1, ? super X2>) testable::test);
    }

    /**
     * Return a composed testable that represents a logical OR of this testable and the given one.
     *
     * @param testable a testable that will be logically OR -evaluated with this testable
     * @return a composed testable that represents a logical OR of this testable and the given one
     * @throws NullPointerException if the given testable is {@code null}
     */
    default Testable2<X1, X2> and(Testable2<? super X1, ? super X2> testable) {
        return and((BiPredicate<? super X1, ? super X2>) testable);
    }

    /**
     * {@inheritDoc}
     *
     * @param other {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2<X1, X2> and(BiPredicate<? super X1, ? super X2> other) {
        return BiPredicate.super.and(other)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @param testable {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Testable2<X1, X2> nor(Testable2Throwing8<? super X1, ? super X2, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> testable) {
        return ((Testable2Throwing8<X1, X2, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) this::test).nor(testable)::test;
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    default Testable2<X1, X2> negate() {
        return BiPredicate.super.negate()::test;
    }

    /**
     * Return a testable that is the negation of the supplied testable.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @param testable the given testable to negate
     *
     * @return a testable that is the negation of the supplied testable
     * @throws NullPointerException if the given testable is {@code null}
     */
    static <X1, X2> Testable2<X1, X2> not(Testable2Throwing8<? super X1, ? super X2, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> testable) {
        return Testable2Throwing8.not(testable)::test;
    }

    /**
     * Return a positive testable that always returns true.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @return a positive testable that always returns true
     */
    static <X1, X2> Testable2<X1, X2> anyway() {
        return Testable2Throwing8.<X1, X2, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>anyway()::test;
    }

    /**
     * Return a negative testable that always returns false.
     *
     * @param <X1> the type of input 1 of the testable
     * @param <X2> the type of input 2 of the testable
     * @return a negative testable that always returns false
     */
    static <X1, X2> Testable2<X1, X2> noways() {
        return Testable2Throwing8.<X1, X2, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>noways()::test;
    }
}
