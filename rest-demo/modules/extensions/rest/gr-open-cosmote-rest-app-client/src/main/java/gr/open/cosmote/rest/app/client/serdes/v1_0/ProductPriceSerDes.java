package gr.open.cosmote.rest.app.client.serdes.v1_0;

import gr.open.cosmote.rest.app.client.dto.v1_0.ProductPrice;
import gr.open.cosmote.rest.app.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
public class ProductPriceSerDes {

	public static ProductPrice toDTO(String json) {
		ProductPriceJSONParser productPriceJSONParser =
			new ProductPriceJSONParser();

		return productPriceJSONParser.parseToDTO(json);
	}

	public static ProductPrice[] toDTOs(String json) {
		ProductPriceJSONParser productPriceJSONParser =
			new ProductPriceJSONParser();

		return productPriceJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ProductPrice productPrice) {
		if (productPrice == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (productPrice.getMonthlyPrice() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"monthlyPrice\": ");

			sb.append(String.valueOf(productPrice.getMonthlyPrice()));
		}

		if (productPrice.getOnceOffPrice() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"onceOffPrice\": ");

			sb.append(String.valueOf(productPrice.getOnceOffPrice()));
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ProductPriceJSONParser productPriceJSONParser =
			new ProductPriceJSONParser();

		return productPriceJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(ProductPrice productPrice) {
		if (productPrice == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (productPrice.getMonthlyPrice() == null) {
			map.put("monthlyPrice", null);
		}
		else {
			map.put(
				"monthlyPrice", String.valueOf(productPrice.getMonthlyPrice()));
		}

		if (productPrice.getOnceOffPrice() == null) {
			map.put("onceOffPrice", null);
		}
		else {
			map.put(
				"onceOffPrice", String.valueOf(productPrice.getOnceOffPrice()));
		}

		return map;
	}

	public static class ProductPriceJSONParser
		extends BaseJSONParser<ProductPrice> {

		@Override
		protected ProductPrice createDTO() {
			return new ProductPrice();
		}

		@Override
		protected ProductPrice[] createDTOArray(int size) {
			return new ProductPrice[size];
		}

		@Override
		protected void setField(
			ProductPrice productPrice, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "monthlyPrice")) {
				if (jsonParserFieldValue != null) {
					productPrice.setMonthlyPrice(
						ProductPriceTypeSerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "onceOffPrice")) {
				if (jsonParserFieldValue != null) {
					productPrice.setOnceOffPrice(
						ProductPriceTypeSerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		string = string.replace("\\", "\\\\");

		return string.replace("\"", "\\\"");
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

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}

			if (iterator.hasNext()) {
				sb.append(",");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}