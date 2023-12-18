package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified 7 input arguments
 * and declares 7 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <X4> {@inheritDoc}
 * @param <X5> {@inheritDoc}
 * @param <X6> {@inheritDoc}
 * @param <X7> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 * @param <E3> {@inheritDoc}
 * @param <E4> {@inheritDoc}
 * @param <E5> {@inheritDoc}
 * @param <E6> {@inheritDoc}
 * @param <E7> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable7Throwing7<X1, X2, X3, X4, X5, X6, X7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception>
        extends Executable7Throwing8<X1, X2, X3, X4, X5, X6, X7, E1, E2, E3, E4, E5, E6, E7, E7> {

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
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     * @throws E5 {@inheritDoc}
     * @throws E6 {@inheritDoc}
     * @throws E7 {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2, X3 x3, X4 x4, X5 x5, X6 x6, X7 x7) throws E1, E2, E3, E4, E5, E6, E7;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable7Throwing7<X1, X2, X3, X4, X5, X6, X7, E1, E2, E3, E4, E5, E6, E7> then(Executable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> after) {
        return ((Executable7Throwing8<X1, X2, X3, X4, X5, X6, X7, E1, E2, E3, E4, E5, E6, E7, E7>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable7Throwing7<X1, X2, X3, X4, X5, X6, X7, E1, E2, E3, E4, E5, E6, E7> after(Executable7Throwing8<? super X1, ? super X2, ? super X3, ? super X4, ? super X5, ? super X6, ? super X7, ? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E7, ? extends E7> before) {
        return ((Executable7Throwing8<X1, X2, X3, X4, X5, X6, X7, E1, E2, E3, E4, E5, E6, E7, E7>) before::exec).then(this)::exec;
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
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @param <E7> the type of possible exception 7 that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, X3, X4, X5, X6, X7, E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception, E7 extends Exception> Executable7Throwing7<X1, X2, X3, X4, X5, X6, X7, E1, E2, E3, E4, E5, E6, E7> idle() {
        return Executable7Throwing8.<X1, X2, X3, X4, X5, X6, X7, E1, E2, E3, E4, E5, E6, E7, E7>idle()::exec;
    }
}
