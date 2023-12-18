package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified 8 input arguments
 * and declares 4 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <X7> {@inheritDoc}
 * @param <X8> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable8Throwing4<X1, X2, X3, X4, X5, X6, X7, X8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception>
        extends Executable8Throwing5<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E4> {

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
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7, X8 x8) throws E1, E2, E3, E4;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable8Throwing4<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4> then(Executable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> after) {
        return ((Executable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E4, E4, E4, E4>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable8Throwing4<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4> after(Executable8Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? super X8, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> before) {
        return ((Executable8Throwing8<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E4, E4, E4, E4>) before::exec).then(this)::exec;
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
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, X3, X4, X5, X6, X7, X8, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> Executable8Throwing4<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4> idle() {
        return Executable8Throwing8.<X1, X2, X3, X4, X5, X6, X7, X8, E1, E2, E3, E4, E4, E4, E4, E4>idle()::exec;
    }
}
