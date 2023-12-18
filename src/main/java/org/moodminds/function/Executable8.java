package org.moodminds.function;

/**
 * An {@link Executable8Throwing1} that throws {@link RuntimeException}.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <X7> {@inheritDoc}
 * @param <X8> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable8<X1, X2, X3, X4, X5, X6, X7, X8>
        extends Executable8Throwing1<X1, X2, X3, X4, X5, X6, X7, X8, RuntimeException> {

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
     * @param x8 {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7, X8 x8);

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable8<X1, X2, X3, X4, X5, X6, X7, X8> then(Executable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> after) {
        return ((Executable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable8<X1, X2, X3, X4, X5, X6, X7, X8> after(Executable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException, ? extends RuntimeException> before) {
        return ((Executable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X1> the type of input 1 of the executable
     * @param <X2> the type of input 2 of the executable
     * @param <X3> the type of input 3 of the executable
     * @param <X4> the type of input 4 of the executable
     * @param <X5> the type of input 5 of the executable
     * @param <X6> the type of input 6 of the executable
     * @param <X7> the type of input 7 of the executable
     * @param <X8> the type of input 8 of the executable
     * @return an idle executable that does nothing
     */
    static <X1, X2, X3, X4, X5, X6, X7, X8> Executable8<X1, X2, X3, X4, X5, X6, X7, X8> idle() {
        return Executable8Throwing8.<X1, X2, X3, X4, X5, X6, X7, X8, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException, RuntimeException>idle()::exec;
    }
}
