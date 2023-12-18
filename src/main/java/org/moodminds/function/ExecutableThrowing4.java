package org.moodminds.function;

/**
 * Represents an operation that executes some action logic and declares 4 possible exceptions to be thrown.
 *
 * @param <E1> the type of possible exception 1 that might be thrown
 * @param <E2> the type of possible exception 2 that might be thrown
 * @param <E3> the type of possible exception 3 that might be thrown
 * @param <E4> the type of possible exception 4 that might be thrown
 */
@FunctionalInterface
public interface ExecutableThrowing4<E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception>
        extends ExecutableThrowing5<E1, E2, E3, E4, E4> {

    /**
     * {@inheritDoc}
     *
     * @throws E1 {@inheritDoc}
     * @throws E2 {@inheritDoc}
     * @throws E3 {@inheritDoc}
     * @throws E4 {@inheritDoc}
     */
    @Override
    void exec() throws E1, E2, E3, E4;

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
    default ExecutableThrowing4<E1, E2, E3, E4> then(ExecutableThrowing8<? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> after) {
        return ((ExecutableThrowing8<E1, E2, E3, E4, E4, E4, E4, E4>) after::exec).after(this)::exec;
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
    default ExecutableThrowing4<E1, E2, E3, E4> after(ExecutableThrowing8<? extends E1, ? extends E2, ? extends E3, ? extends E4, ? extends E4, ? extends E4, ? extends E4, ? extends E4> before) {
        return ((ExecutableThrowing8<E1, E2, E3, E4, E4, E4, E4, E4>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <E1> the type of possible exception 1 that might be thrown
     * @param <E2> the type of possible exception 2 that might be thrown
     * @param <E3> the type of possible exception 3 that might be thrown
     * @param <E4> the type of possible exception 4 that might be thrown
     * @return an idle executable that does nothing
     */
    static <E1 extends Exception, E2 extends Exception, E3 extends Exception, E4 extends Exception> ExecutableThrowing4<E1, E2, E3, E4> idle() {
        return ExecutableThrowing8.<E1, E2, E3, E4, E4, E4, E4, E4>idle()::exec;
    }
}
