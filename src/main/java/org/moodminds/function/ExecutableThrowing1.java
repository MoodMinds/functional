package org.moodminds.function;

/**
 * Represents an operation that executes some action logic and declares possible exception to be thrown.
 *
 * @param <E> the type of possible exception that might be thrown
 */
@FunctionalInterface
public interface ExecutableThrowing1<E extends Exception>
        extends ExecutableThrowing2<E, E> {

    /**
     * {@inheritDoc}
     *
     * @throws E {@inheritDoc}
     */
    @Override
    void exec() throws E;

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
    default ExecutableThrowing1<E> then(ExecutableThrowing8<? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> after) {
        return ((ExecutableThrowing8<E, E, E, E, E, E, E, E>) after::exec).after(this)::exec;
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
    default ExecutableThrowing1<E> after(ExecutableThrowing8<? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E, ? extends E> before) {
        return ((ExecutableThrowing8<E, E, E, E, E, E, E, E>) before::exec).then(this)::exec;
    }


    /**
     * Return an idle executable that does nothing.
     *
     * @param <E> the type of possible exception that might be thrown
     * @return an idle executable that does nothing
     */
    static <E extends Exception> ExecutableThrowing1<E> idle() {
        return ExecutableThrowing8.<E, E, E, E, E, E, E, E>idle()::exec;
    }
}
