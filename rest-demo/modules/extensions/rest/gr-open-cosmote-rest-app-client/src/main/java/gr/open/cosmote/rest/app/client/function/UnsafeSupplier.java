package gr.open.cosmote.rest.app.client.function;

import javax.annotation.Generated;

/**
 * @author Technopolis S.A.
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}