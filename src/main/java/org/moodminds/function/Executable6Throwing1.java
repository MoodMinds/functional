package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified 6 input arguments
 * and declares possible exception to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Executable6Throwing1<X1, X2, X3, X4, X5, X6, E extends Exception>
        extends Executable6Throwing2<X1, X2, X3, X4, X5, X6, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @param x4 {@inheritDoc}
     * @param x5 {@inheritDoc}
     * @param x6 {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6) throws E;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable6Throwing1<X1, X2, X3, X4, X5, X6, E> then(Executable6Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((Executable6Throwing8<X1, X2, X3, X4, X5, X6, E, E, E, E, E, E, E, E>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable6Throwing1<X1, X2, X3, X4, X5, X6, E> after(Executable6Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Executable6Throwing8<X1, X2, X3, X4, X5, X6, E, E, E, E, E, E, E, E>) before::exec).then(this)::exec;
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
     * @param <E> the type of possible exception that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, X3, X4, X5, X6, E extends Exception> Executable6Throwing1<X1, X2, X3, X4, X5, X6, E> idle() {
        return Executable6Throwing8.<X1, X2, X3, X4, X5, X6, E, E, E, E, E, E, E, E>idle()::exec;
    }
}
