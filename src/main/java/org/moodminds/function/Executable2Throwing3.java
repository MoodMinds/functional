package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified 2 input arguments
 * and declares 3 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable2Throwing3<X1, X2, E1 extends Exception, E2 extends Exception, E3 extends Exception>
        extends Executable2Throwing4<X1, X2, E1, E2, E3, E3> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2) throws E1, E2, E3;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable2Throwing3<X1, X2, E1, E2, E3> then(Executable2Throwing8<? super X1, ? super X2, ? extends E1, ? extends E2, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3> after) {
        return ((Executable2Throwing8<X1, X2, E1, E2, E3, E3, E3, E3, E3, E3>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable2Throwing3<X1, X2, E1, E2, E3> after(Executable2Throwing8<? super X1, ? super X2, ? extends E1, ? extends E2, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3, ? extends E3> before) {
        return ((Executable2Throwing8<X1, X2, E1, E2, E3, E3, E3, E3, E3, E3>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X1> the type of input 1 of the executable
     * @param <X2> the type of input 2 of the executable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, E1 extends Exception, E2 extends Exception, E3 extends Exception> Executable2Throwing3<X1, X2, E1, E2, E3> idle() {
        return Executable2Throwing8.<X1, X2, E1, E2, E3, E3, E3, E3, E3, E3>idle()::exec;
    }
}
