package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified input argument
 * and declares possible exception to be thrown.
 *
 * @param <X> {@inheritDoc}
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface Executable1Throwing1<X, E extends Exception>
        extends Executable1Throwing2<X, E, E> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @throws E {@inheritDoc}
     */
    @Override
    void exec(X x) throws E;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable1Throwing1<X, E> then(Executable1Throwing8<? super X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((Executable1Throwing8<X, E, E, E, E, E, E, E, E>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable1Throwing1<X, E> after(Executable1Throwing8<? super X, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((Executable1Throwing8<X, E, E, E, E, E, E, E, E>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X> the type of the input of the executable
     * @param <E> the type of possible exception that might be thrown
     * @return an idle executable that does nothing
     */
    static <X, E extends Exception> Executable1Throwing1<X, E> idle() {
        return Executable1Throwing8.<X, E, E, E, E, E, E, E, E>idle()::exec;
    }
}
