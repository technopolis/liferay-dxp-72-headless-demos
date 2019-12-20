package gr.open.cosmote.rest.app.client.serdes.v1_0;

import gr.open.cosmote.rest.app.client.dto.v1_0.ProductPriceType;
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
public class ProductPriceTypeSerDes {

	public static ProductPriceType toDTO(String json) {
		ProductPriceTypeJSONParser productPriceTypeJSONParser =
			new ProductPriceTypeJSONParser();

		return productPriceTypeJSONParser.parseToDTO(json);
	}

	public static ProductPriceType[] toDTOs(String json) {
		ProductPriceTypeJSONParser productPriceTypeJSONParser =
			new ProductPriceTypeJSONParser();

		return productPriceTypeJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ProductPriceType productPriceType) {
		if (productPriceType == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (productPriceType.getAfterText() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"afterText\": ");

			sb.append("\"");

			sb.append(_escape(productPriceType.getAfterText()));

			sb.append("\"");
		}

		if (productPriceType.getAmount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"amount\": ");

			sb.append("\"");

			sb.append(_escape(productPriceType.getAmount()));

			sb.append("\"");
		}

		if (productPriceType.getCurrency() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"currency\": ");

			sb.append("\"");

			sb.append(_escape(productPriceType.getCurrency()));

			sb.append("\"");
		}

		if (productPriceType.getPreText() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"preText\": ");

			sb.append("\"");

			sb.append(_escape(productPriceType.getPreText()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ProductPriceTypeJSONParser productPriceTypeJSONParser =
			new ProductPriceTypeJSONParser();

		return productPriceTypeJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(ProductPriceType productPriceType) {
		if (productPriceType == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (productPriceType.getAfterText() == null) {
			map.put("afterText", null);
		}
		else {
			map.put(
				"afterText", String.valueOf(productPriceType.getAfterText()));
		}

		if (productPriceType.getAmount() == null) {
			map.put("amount", null);
		}
		else {
			map.put("amount", String.valueOf(productPriceType.getAmount()));
		}

		if (productPriceType.getCurrency() == null) {
			map.put("currency", null);
		}
		else {
			map.put("currency", String.valueOf(productPriceType.getCurrency()));
		}

		if (productPriceType.getPreText() == null) {
			map.put("preText", null);
		}
		else {
			map.put("preText", String.valueOf(productPriceType.getPreText()));
		}

		return map;
	}

	public static class ProductPriceTypeJSONParser
		extends BaseJSONParser<ProductPriceType> {

		@Override
		protected ProductPriceType createDTO() {
			return new ProductPriceType();
		}

		@Override
		protected ProductPriceType[] createDTOArray(int size) {
			return new ProductPriceType[size];
		}

		@Override
		protected void setField(
			ProductPriceType productPriceType, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "afterText")) {
				if (jsonParserFieldValue != null) {
					productPriceType.setAfterText((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "amount")) {
				if (jsonParserFieldValue != null) {
					productPriceType.setAmount((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "currency")) {
				if (jsonParserFieldValue != null) {
					productPriceType.setCurrency((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "preText")) {
				if (jsonParserFieldValue != null) {
					productPriceType.setPreText((String)jsonParserFieldValue);
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