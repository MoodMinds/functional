package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified 4 input arguments
 * and declares possible exception to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Executable4Throwing1<X1, X2, X3, X4, E extends Exception>
        extends Executable4Throwing2<X1, X2, X3, X4, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @param x4 {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2, X3 x3, X4 x4) throws E;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable4Throwing1<X1, X2, X3, X4, E> then(Executable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((Executable4Throwing8<X1, X2, X3, X4, E, E, E, E, E, E, E, E>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable4Throwing1<X1, X2, X3, X4, E> after(Executable4Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Executable4Throwing8<X1, X2, X3, X4, E, E, E, E, E, E, E, E>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X1> the type of input 1 of the executable
     * @param <X2> the type of input 2 of the executable
     * @param <X3> the type of input 3 of the executable
     * @param <X4> the type of input 4 of the executable
     * @param <E> the type of possible exception that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, X3, X4, E extends Exception> Executable4Throwing1<X1, X2, X3, X4, E> idle() {
        return Executable4Throwing8.<X1, X2, X3, X4, E, E, E, E, E, E, E, E>idle()::exec;
    }
}
