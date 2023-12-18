package org.moodminds.function;

/**
 * Represents an operation that executes some action logic and declares 6 possible exceptions to be thrown.
 *
 * @param <E1> the type of possible exception 1 that might be thrown
 * @param <E2> the type of possible exception 2 that might be thrown
 * @param <E3> the type of possible exception 3 that might be thrown
 * @param <E4> the type of possible exception 4 that might be thrown
 * @param <E5> the type of possible exception 5 that might be thrown
 * @param <E6> the type of possible exception 6 that might be thrown
 */
@FunctionalInterface
public interface ExecutableThrowing6<E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception>
        extends ExecutableThrowing7<E1, E2, E3, E4, E5, E6, E6> {

    /**
     * {@inheritDoc}
     *
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     * @throws E5 {@inheritDoc}
     * @throws E6 {@inheritDoc}
     */
    @Override
    void exec() throws E1, E2, E3, E4, E5, E6;

    /**
     * Return a composed operation that first executes this action logic,
     * and then executes the action logic of the {@code after} operation.
     *
     * @param after the operation to execute after this operation is executed
     * @return a composed operation that first executes this action logic,
     * and then executes the action logic of the {@code after} operation
     * @throws NullPointerException if the given after is {@code null}
     */
    @Override
    default ExecutableThrowing6<E1, E2, E3, E4, E5, E6> then(ExecutableThrowing8<? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E6, ? extends E6> after) {
        return ((ExecutableThrowing8<E1, E2, E3, E4, E5, E6, E6, E6>) after::exec).after(this)::exec;
    }

    /**
     * Return a composed operation that first executes the {@code before} action logic,
     * and then executes the action logic of this operation.
     *
     * @param before the operation to execute before this operation is executed
     * @return a composed operation that first executes the {@code before} action logic,
     * and then executes the action logic of this operation
     * @throws NullPointerException if the given before is {@code null}
     */
    @Override
    default ExecutableThrowing6<E1, E2, E3, E4, E5, E6> after(ExecutableThrowing8<? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E5, ? extends E6, ? extends E6, ? extends E6> before) {
        return ((ExecutableThrowing8<E1, E2, E3, E4, E5, E6, E6, E6>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @param <E5> the type of possible exception 5 that might be thrown
     * @param <E6> the type of possible exception 6 that might be thrown
     * @return an idle executable that does nothing
     */
    static <E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception, E5 extends Exception, E6 extends Exception> ExecutableThrowing6<E1, E2, E3, E4, E5, E6> idle() {
        return ExecutableThrowing8.<E1, E2, E3, E4, E5, E6, E6, E6>idle()::exec;
    }
}
