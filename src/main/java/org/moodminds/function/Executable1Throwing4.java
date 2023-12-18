package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified input argument
 * and declares 4 possible exceptions to be thrown.
 *
 * @param <X> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable1Throwing4<X, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception>
        extends Executable1Throwing5<X, E1, E2, E3, E4, E4> {

    /**
     * {@inheritDoc}
     *
     * @param x {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     */
    @Override
    void exec(X x) throws E1, E2, E3, E4;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable1Throwing4<X, E1, E2, E3, E4> then(Executable1Throwing8<? super X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> after) {
        return ((Executable1Throwing8<X, E1, E2, E3, E4, E4, E4, E4, E4>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable1Throwing4<X, E1, E2, E3, E4> after(Executable1Throwing8<? super X, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> before) {
        return ((Executable1Throwing8<X, E1, E2, E3, E4, E4, E4, E4, E4>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X> the type of the input of the executable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @return an idle executable that does nothing
     */
    static <X, X2, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> Executable1Throwing4<X, E1, E2, E3, E4> idle() {
        return Executable1Throwing8.<X, E1, E2, E3, E4, E4, E4, E4, E4>idle()::exec;
    }
}
