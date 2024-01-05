package org.moodminds.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * An {@link Evaluable2Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <V> {@inheritDoc}
 */
@FunctionalInterface
public interface Evaluable2<X1, X2, V>
        extends Evaluable2Throwing1<X1, X2, V, RuntimeException>, BiFunction<X1, X2, V> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    default V eval(X1 x1, X2 x2) {
        return apply(x1, x2);
    }

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable2<X1, X2, R> then(Evaluable1Throwing8<? super V, ? extends R, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
        return andThen(after::eval);
    }

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default <R> Evaluable2<X1, X2, R> andThen(Function<? super V, ? extends R> after) {
        return BiFunction.super.andThen(after)::apply;
    }


    /**
     * Return an operation that always returns its input argument 1.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @return an operation that always returns its input argument 1
     */
    static <V1, V2> Evaluable2<V1, V2, V1> identity1() {
        return Evaluable2Throwing8.<V1, V2, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity1()::eval;
    }

    /**
     * Return an operation that always returns its input argument 2.
     *
     * @param <V1> the type of input 1
     * @param <V2> the type of input 2
     * @return an operation that always returns its input argument 2
     */
    static <V1, V2> Evaluable2<V1, V2, V2> identity2() {
        return Evaluable2Throwing8.<V1, V2, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>identity2()::eval;
    }
}
