package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified 2 input arguments
 * and declares 5 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 * @param <E5> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable2Throwing5<X1, X2, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception>
        extends Executable2Throwing6<X1, X2, E1, E2, E3, E4, E5, E5> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     * @throws E5 {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2) throws E1, E2, E3, E4, E5;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable2Throwing5<X1, X2, E1, E2, E3, E4, E5> then(Executable2Throwing8<? super X1, ? super X2, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E5, ? extends E5, ? extends E5> after) {
        return ((Executable2Throwing8<X1, X2, E1, E2, E3, E4, E5, E5, E5, E5>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable2Throwing5<X1, X2, E1, E2, E3, E4, E5> after(Executable2Throwing8<? super X1, ? super X2, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E5, ? extends E5, ? extends E5> before) {
        return ((Executable2Throwing8<X1, X2, E1, E2, E3, E4, E5, E5, E5, E5>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X1> the type of input 1 of the executable
     * @param <X2> the type of input 2 of the executable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception> Executable2Throwing5<X1, X2, E1, E2, E3, E4, E5> idle() {
        return Executable2Throwing8.<X1, X2, E1, E2, E3, E4, E5, E5, E5, E5>idle()::exec;
    }
}
