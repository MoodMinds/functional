package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified input argument
 * and declares 2 possible exceptions to be thrown.
 *
 * @param <X> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable1Throwing2<X, E1 extends Exception, E2 extends Exception>
        extends Executable1Throwing3<X, E1, E2, E2> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     */
    @Override
    void exec(X x) throws E1, E2;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable1Throwing2<X, E1, E2> then(Executable1Throwing8<? super X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> after) {
        return ((Executable1Throwing8<X, E1, E2, E2, E2, E2, E2, E2, E2>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable1Throwing2<X, E1, E2> after(Executable1Throwing8<? super X, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Executable1Throwing8<X, E1, E2, E2, E2, E2, E2, E2, E2>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X> the type of the input of the executable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @return an idle executable that does nothing
     */
    static <X, E1 extends Exception, E2 extends Exception> Executable1Throwing2<X, E1, E2> idle() {
        return Executable1Throwing8.<X, E1, E2, E2, E2, E2, E2, E2, E2>idle()::exec;
    }
}
