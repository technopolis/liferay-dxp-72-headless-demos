package gr.open.cosmote.rest.app.client.serdes.v1_0;

import gr.open.cosmote.rest.app.client.dto.v1_0.ProductType;
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
public class ProductTypeSerDes {

	public static ProductType toDTO(String json) {
		ProductTypeJSONParser productTypeJSONParser =
			new ProductTypeJSONParser();

		return productTypeJSONParser.parseToDTO(json);
	}

	public static ProductType[] toDTOs(String json) {
		ProductTypeJSONParser productTypeJSONParser =
			new ProductTypeJSONParser();

		return productTypeJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ProductType productType) {
		if (productType == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (productType.getIdRef() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"idRef\": ");

			sb.append("\"");

			sb.append(_escape(productType.getIdRef()));

			sb.append("\"");
		}

		if (productType.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(productType.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ProductTypeJSONParser productTypeJSONParser =
			new ProductTypeJSONParser();

		return productTypeJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(ProductType productType) {
		if (productType == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (productType.getIdRef() == null) {
			map.put("idRef", null);
		}
		else {
			map.put("idRef", String.valueOf(productType.getIdRef()));
		}

		if (productType.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(productType.getTitle()));
		}

		return map;
	}

	public static class ProductTypeJSONParser
		extends BaseJSONParser<ProductType> {

		@Override
		protected ProductType createDTO() {
			return new ProductType();
		}

		@Override
		protected ProductType[] createDTOArray(int size) {
			return new ProductType[size];
		}

		@Override
		protected void setField(
			ProductType productType, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "idRef")) {
				if (jsonParserFieldValue != null) {
					productType.setIdRef((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					productType.setTitle((String)jsonParserFieldValue);
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