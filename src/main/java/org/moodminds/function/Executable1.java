package org.moodminds.function;

import java.util.function.Consumer;

/**
 * An {@link Executable1Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable1<X>
        extends Executable1Throwing1<X, RuntimeException>, Consumer<X> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     */
    @Override
    default void exec(X x) {
        accept(x);
    }

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable1<X> then(Executable1Throwing8<? super X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
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
    default Executable1<X> after(Executable1Throwing8<? super X, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Executable1<X>) before::exec).then(this);
    }

    /**
     * Returns a composed {@code Executable1} that performs, in sequence, this
     * operation followed by the {@code after} operation.
     *
     * @param after {@inheritDoc}
     * @return a composed {@code Executable1} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable1<X> andThen(Consumer<? super X> after) {
        return Consumer.super.andThen(after)::accept;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X> the type of the input of the executable
     * @return an idle executable that does nothing
     */
    static <X> Executable1<X> idle() {
        return Executable1Throwing8.<X, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>idle()::exec;
    }
}
