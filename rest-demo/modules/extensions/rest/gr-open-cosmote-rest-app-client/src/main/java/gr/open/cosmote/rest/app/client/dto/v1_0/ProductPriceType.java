package gr.open.cosmote.rest.app.client.dto.v1_0;

import gr.open.cosmote.rest.app.client.function.UnsafeSupplier;
import gr.open.cosmote.rest.app.client.serdes.v1_0.ProductPriceTypeSerDes;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
public class ProductPriceType {

	public String getAfterText() {
		return afterText;
	}

	public void setAfterText(String afterText) {
		this.afterText = afterText;
	}

	public void setAfterText(
		UnsafeSupplier<String, Exception> afterTextUnsafeSupplier) {

		try {
			afterText = afterTextUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String afterText;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setAmount(
		UnsafeSupplier<String, Exception> amountUnsafeSupplier) {

		try {
			amount = amountUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String amount;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setCurrency(
		UnsafeSupplier<String, Exception> currencyUnsafeSupplier) {

		try {
			currency = currencyUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String currency;

	public String getPreText() {
		return preText;
	}

	public void setPreText(String preText) {
		this.preText = preText;
	}

	public void setPreText(
		UnsafeSupplier<String, Exception> preTextUnsafeSupplier) {

		try {
			preText = preTextUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String preText;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductPriceType)) {
			return false;
		}

		ProductPriceType productPriceType = (ProductPriceType)object;

		return Objects.equals(toString(), productPriceType.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ProductPriceTypeSerDes.toJSON(this);
	}

}