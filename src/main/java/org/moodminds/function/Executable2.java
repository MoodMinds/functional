package org.moodminds.function;

import java.util.function.BiConsumer;

/**
 * An {@link Executable2Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable2<X1, X2>
        extends Executable2Throwing1<X1, X2, RuntimeException>, BiConsumer<X1, X2> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     */
    @Override
    default void exec(X1 x1, X2 x2) {
        accept(x1, x2);
    }

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable2<X1, X2> then(Executable2Throwing8<? super X1, ? super X2, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
        return andThen(after::exec);
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable2<X1, X2> after(Executable2Throwing8<? super X1, ? super X2, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Executable2<X1, X2>) before::exec).then(this);
    }

    /**
     * Returns a composed {@code Executable2} that performs, in sequence, this
     * operation followed by the {@code after} operation.
     *
     * @param after {@inheritDoc}
     * @return a composed {@code Executable2} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable2<X1, X2> andThen(BiConsumer<? super X1, ? super X2> after) {
        return BiConsumer.super.andThen(after)::accept;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X1> the type of input 1 of the executable
     * @param <X2> the type of input 2 of the executable
     * @return an idle executable that does nothing
     */
    static <X1, X2> Executable2<X1, X2> idle() {
        return Executable2Throwing8.<X1, X2, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>idle()::exec;
    }
}
