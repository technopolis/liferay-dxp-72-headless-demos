package gr.open.cosmote.rest.app.client.serdes.v1_0;

import gr.open.cosmote.rest.app.client.dto.v1_0.Product;
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
public class ProductSerDes {

	public static Product toDTO(String json) {
		ProductJSONParser productJSONParser = new ProductJSONParser();

		return productJSONParser.parseToDTO(json);
	}

	public static Product[] toDTOs(String json) {
		ProductJSONParser productJSONParser = new ProductJSONParser();

		return productJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Product product) {
		if (product == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (product.getBusinessDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"businessDescription\": ");

			sb.append("\"");

			sb.append(_escape(product.getBusinessDescription()));

			sb.append("\"");
		}

		if (product.getBusinessSummary() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"businessSummary\": ");

			sb.append("\"");

			sb.append(_escape(product.getBusinessSummary()));

			sb.append("\"");
		}

		if (product.getCategory() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"category\": ");

			sb.append("\"");

			sb.append(_escape(product.getCategory()));

			sb.append("\"");
		}

		if (product.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(product.getDescription()));

			sb.append("\"");
		}

		if (product.getIdRef() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"idRef\": ");

			sb.append("\"");

			sb.append(_escape(product.getIdRef()));

			sb.append("\"");
		}

		if (product.getImagePath() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imagePath\": ");

			sb.append("\"");

			sb.append(_escape(product.getImagePath()));

			sb.append("\"");
		}

		if (product.getPrice() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"price\": ");

			sb.append(String.valueOf(product.getPrice()));
		}

		if (product.getProductType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productType\": ");

			sb.append(String.valueOf(product.getProductType()));
		}

		if (product.getSummary() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"summary\": ");

			sb.append("\"");

			sb.append(_escape(product.getSummary()));

			sb.append("\"");
		}

		if (product.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(product.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ProductJSONParser productJSONParser = new ProductJSONParser();

		return productJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Product product) {
		if (product == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (product.getBusinessDescription() == null) {
			map.put("businessDescription", null);
		}
		else {
			map.put(
				"businessDescription",
				String.valueOf(product.getBusinessDescription()));
		}

		if (product.getBusinessSummary() == null) {
			map.put("businessSummary", null);
		}
		else {
			map.put(
				"businessSummary",
				String.valueOf(product.getBusinessSummary()));
		}

		if (product.getCategory() == null) {
			map.put("category", null);
		}
		else {
			map.put("category", String.valueOf(product.getCategory()));
		}

		if (product.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(product.getDescription()));
		}

		if (product.getIdRef() == null) {
			map.put("idRef", null);
		}
		else {
			map.put("idRef", String.valueOf(product.getIdRef()));
		}

		if (product.getImagePath() == null) {
			map.put("imagePath", null);
		}
		else {
			map.put("imagePath", String.valueOf(product.getImagePath()));
		}

		if (product.getPrice() == null) {
			map.put("price", null);
		}
		else {
			map.put("price", String.valueOf(product.getPrice()));
		}

		if (product.getProductType() == null) {
			map.put("productType", null);
		}
		else {
			map.put("productType", String.valueOf(product.getProductType()));
		}

		if (product.getSummary() == null) {
			map.put("summary", null);
		}
		else {
			map.put("summary", String.valueOf(product.getSummary()));
		}

		if (product.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(product.getTitle()));
		}

		return map;
	}

	public static class ProductJSONParser extends BaseJSONParser<Product> {

		@Override
		protected Product createDTO() {
			return new Product();
		}

		@Override
		protected Product[] createDTOArray(int size) {
			return new Product[size];
		}

		@Override
		protected void setField(
			Product product, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "businessDescription")) {
				if (jsonParserFieldValue != null) {
					product.setBusinessDescription(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "businessSummary")) {
				if (jsonParserFieldValue != null) {
					product.setBusinessSummary((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "category")) {
				if (jsonParserFieldValue != null) {
					product.setCategory((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					product.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "idRef")) {
				if (jsonParserFieldValue != null) {
					product.setIdRef((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "imagePath")) {
				if (jsonParserFieldValue != null) {
					product.setImagePath((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "price")) {
				if (jsonParserFieldValue != null) {
					product.setPrice(
						ProductPriceSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "productType")) {
				if (jsonParserFieldValue != null) {
					product.setProductType(
						ProductTypeSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "summary")) {
				if (jsonParserFieldValue != null) {
					product.setSummary((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					product.setTitle((String)jsonParserFieldValue);
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