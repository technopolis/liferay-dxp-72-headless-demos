package gr.open.cosmote.rest.app.client.dto.v1_0;

import gr.open.cosmote.rest.app.client.function.UnsafeSupplier;
import gr.open.cosmote.rest.app.client.serdes.v1_0.ProductTypeSerDes;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
public class ProductType {

	public String getIdRef() {
		return idRef;
	}

	public void setIdRef(String idRef) {
		this.idRef = idRef;
	}

	public void setIdRef(
		UnsafeSupplier<String, Exception> idRefUnsafeSupplier) {

		try {
			idRef = idRefUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String idRef;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		try {
			title = titleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String title;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductType)) {
			return false;
		}

		ProductType productType = (ProductType)object;

		return Objects.equals(toString(), productType.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ProductTypeSerDes.toJSON(this);
	}

}