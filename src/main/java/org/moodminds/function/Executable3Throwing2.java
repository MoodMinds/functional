package org.moodminds.function;

/**
 * Represents an operation that executes some action logic on the specified 3 input arguments
 * and declares 2 possible exceptions to be thrown.
 *
 * @param <X1> {@inheritDoc}
 * @param <X2> {@inheritDoc}
 * @param <X3> {@inheritDoc}
 * @param <E1> {@inheritDoc}
 * @param <E2> {@inheritDoc}
 */
@FunctionalInterface
public interface Executable3Throwing2<X1, X2, X3, E1 extends Exception, E2 extends Exception>
        extends Executable3Throwing3<X1, X2, X3, E1, E2, E2> {

    /**
     * {@inheritDoc}
     *
     * @param x1 {@inheritDoc}
     * @param x2 {@inheritDoc}
     * @param x3 {@inheritDoc}
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     */
    @Override
    void exec(X1 x1, X2 x2, X3 x3) throws E1, E2;

    /**
     * {@inheritDoc}
     *
     * @param after {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable3Throwing2<X1, X2, X3, E1, E2> then(Executable3Throwing8<? super X1, ? super X2, ? super X3, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> after) {
        return ((Executable3Throwing8<X1, X2, X3, E1, E2, E2, E2, E2, E2, E2, E2>) after::exec).after(this)::exec;
    }

    /**
     * {@inheritDoc}
     *
     * @param before {@inheritDoc}
     * @return {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    default Executable3Throwing2<X1, X2, X3, E1, E2> after(Executable3Throwing8<? super X1, ? super X2, ? super X3, ? extends E1, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2, ? extends E2> before) {
        return ((Executable3Throwing8<X1, X2, X3, E1, E2, E2, E2, E2, E2, E2, E2>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <X1> the type of input 1 of the executable
     * @param <X2> the type of input 2 of the executable
     * @param <X3> the type of input 3 of the executable
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @return an idle executable that does nothing
     */
    static <X1, X2, X3, E1 extends Exception, E2 extends Exception> Executable3Throwing2<X1, X2, X3, E1, E2> idle() {
        return Executable3Throwing8.<X1, X2, X3, E1, E2, E2, E2, E2, E2, E2, E2>idle()::exec;
    }
}
