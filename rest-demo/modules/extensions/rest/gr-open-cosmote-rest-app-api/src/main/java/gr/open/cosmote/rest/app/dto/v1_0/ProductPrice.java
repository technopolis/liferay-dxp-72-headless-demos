package gr.open.cosmote.rest.app.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
@GraphQLName("ProductPrice")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ProductPrice")
public class ProductPrice {

	@Schema
	@Valid
	public ProductPriceType getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(ProductPriceType monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}

	@JsonIgnore
	public void setMonthlyPrice(
		UnsafeSupplier<ProductPriceType, Exception>
			monthlyPriceUnsafeSupplier) {

		try {
			monthlyPrice = monthlyPriceUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ProductPriceType monthlyPrice;

	@Schema
	@Valid
	public ProductPriceType getOnceOffPrice() {
		return onceOffPrice;
	}

	public void setOnceOffPrice(ProductPriceType onceOffPrice) {
		this.onceOffPrice = onceOffPrice;
	}

	@JsonIgnore
	public void setOnceOffPrice(
		UnsafeSupplier<ProductPriceType, Exception>
			onceOffPriceUnsafeSupplier) {

		try {
			onceOffPrice = onceOffPriceUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (monthlyPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"monthlyPrice\": ");

			sb.append(String.valueOf(monthlyPrice));
		}

		if (onceOffPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"onceOffPrice\": ");

			sb.append(String.valueOf(onceOffPrice));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		defaultValue = "gr.open.cosmote.rest.app.dto.v1_0.ProductPrice",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		return string.replaceAll("\"", "\\\\\"");
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\":");
			sb.append("\"");
			sb.append(entry.getValue());
			sb.append("\"");

			if (iterator.hasNext()) {
				sb.append(",");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}