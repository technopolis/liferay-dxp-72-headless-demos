package gr.open.cosmote.rest.app.client.dto.v1_0;

import gr.open.cosmote.rest.app.client.function.UnsafeSupplier;
import gr.open.cosmote.rest.app.client.serdes.v1_0.ProductPriceSerDes;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
public class ProductPrice {

	public ProductPriceType getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(ProductPriceType monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}

	public void setMonthlyPrice(
		UnsafeSupplier<ProductPriceType, Exception>
			monthlyPriceUnsafeSupplier) {

		try {
			monthlyPrice = monthlyPriceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ProductPriceType monthlyPrice;

	public ProductPriceType getOnceOffPrice() {
		return onceOffPrice;
	}

	public void setOnceOffPrice(ProductPriceType onceOffPrice) {
		this.onceOffPrice = onceOffPrice;
	}

	public void setOnceOffPrice(
		UnsafeSupplier<ProductPriceType, Exception>
			onceOffPriceUnsafeSupplier) {

		try {
			onceOffPrice = onceOffPriceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ProductPriceType onceOffPrice;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductPrice)) {
			return false;
		}

		ProductPrice productPrice = (ProductPrice)object;

		return Objects.equals(toString(), productPrice.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ProductPriceSerDes.toJSON(this);
	}

}