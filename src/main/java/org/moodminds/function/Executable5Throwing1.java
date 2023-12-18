package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified 5 input arguments
 * and declares possible exception to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Executable5Throwing1<X1, X2, X3, X4, X5, E extends Exception>
        extends Executable5Throwing2<X1, X2, X3, X4, X5, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @param x4 {@inheritDoc}
     * @param x5 {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5) throws E;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable5Throwing1<X1, X2, X3, X4, X5, E> then(Executable5Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((Executable5Throwing8<X1, X2, X3, X4, X5, E, E, E, E, E, E, E, E>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable5Throwing1<X1, X2, X3, X4, X5, E> after(Executable5Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Executable5Throwing8<X1, X2, X3, X4, X5, E, E, E, E, E, E, E, E>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X1> the type of input 1 of the executable
     * @param <X2> the type of input 2 of the executable
     * @param <X3> the type of input 3 of the executable
     * @param <X4> the type of input 4 of the executable
     * @param <X5> the type of input 5 of the executable
     * @param <E> the type of possible exception that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, X3, X4, X5, E extends Exception> Executable5Throwing1<X1, X2, X3, X4, X5, E> idle() {
        return Executable5Throwing8.<X1, X2, X3, X4, X5, E, E, E, E, E, E, E, E>idle()::exec;
    }
}
