package gr.open.cosmote.rest.app.client.serdes.v1_0;

import gr.open.cosmote.rest.app.client.dto.v1_0.Campaign;
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
public class CampaignSerDes {

	public static Campaign toDTO(String json) {
		CampaignJSONParser campaignJSONParser = new CampaignJSONParser();

		return campaignJSONParser.parseToDTO(json);
	}

	public static Campaign[] toDTOs(String json) {
		CampaignJSONParser campaignJSONParser = new CampaignJSONParser();

		return campaignJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Campaign campaign) {
		if (campaign == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (campaign.getAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getAddress()));

			sb.append("\"");
		}

		if (campaign.getCampaignContactId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"campaignContactId\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getCampaignContactId()));

			sb.append("\"");
		}

		if (campaign.getComparisonFlag() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"comparisonFlag\": ");

			sb.append(campaign.getComparisonFlag());
		}

		if (campaign.getContactId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contactId\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getContactId()));

			sb.append("\"");
		}

		if (campaign.getEshopIdExisting() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"eshopIdExisting\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getEshopIdExisting()));

			sb.append("\"");
		}

		if (campaign.getEshopIdTarget() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"eshopIdTarget\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getEshopIdTarget()));

			sb.append("\"");
		}

		if (campaign.getGenevaBillingAccount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"genevaBillingAccount\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getGenevaBillingAccount()));

			sb.append("\"");
		}

		if (campaign.getOnceOfTarget() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"onceOfTarget\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getOnceOfTarget()));

			sb.append("\"");
		}

		if (campaign.getOnceOffExisting() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"onceOffExisting\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getOnceOffExisting()));

			sb.append("\"");
		}

		if (campaign.getRecurringExisting() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recurringExisting\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getRecurringExisting()));

			sb.append("\"");
		}

		if (campaign.getRecurringTarget() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recurringTarget\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getRecurringTarget()));

			sb.append("\"");
		}

		if (campaign.getSerialNum() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serialNum\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getSerialNum()));

			sb.append("\"");
		}

		if (campaign.getSiebelProductIdTarget() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siebelProductIdTarget\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getSiebelProductIdTarget()));

			sb.append("\"");
		}

		if (campaign.getSiebelProductNameExisting() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siebelProductNameExisting\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getSiebelProductNameExisting()));

			sb.append("\"");
		}

		if (campaign.getSiebelProductNameTarget() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siebelProductNameTarget\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getSiebelProductNameTarget()));

			sb.append("\"");
		}

		if (campaign.getSpecificPortalDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"specificPortalDescription\": ");

			sb.append("\"");

			sb.append(_escape(campaign.getSpecificPortalDescription()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		CampaignJSONParser campaignJSONParser = new CampaignJSONParser();

		return campaignJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Campaign campaign) {
		if (campaign == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (campaign.getAddress() == null) {
			map.put("address", null);
		}
		else {
			map.put("address", String.valueOf(campaign.getAddress()));
		}

		if (campaign.getCampaignContactId() == null) {
			map.put("campaignContactId", null);
		}
		else {
			map.put(
				"campaignContactId",
				String.valueOf(campaign.getCampaignContactId()));
		}

		if (campaign.getComparisonFlag() == null) {
			map.put("comparisonFlag", null);
		}
		else {
			map.put(
				"comparisonFlag", String.valueOf(campaign.getComparisonFlag()));
		}

		if (campaign.getContactId() == null) {
			map.put("contactId", null);
		}
		else {
			map.put("contactId", String.valueOf(campaign.getContactId()));
		}

		if (campaign.getEshopIdExisting() == null) {
			map.put("eshopIdExisting", null);
		}
		else {
			map.put(
				"eshopIdExisting",
				String.valueOf(campaign.getEshopIdExisting()));
		}

		if (campaign.getEshopIdTarget() == null) {
			map.put("eshopIdTarget", null);
		}
		else {
			map.put(
				"eshopIdTarget", String.valueOf(campaign.getEshopIdTarget()));
		}

		if (campaign.getGenevaBillingAccount() == null) {
			map.put("genevaBillingAccount", null);
		}
		else {
			map.put(
				"genevaBillingAccount",
				String.valueOf(campaign.getGenevaBillingAccount()));
		}

		if (campaign.getOnceOfTarget() == null) {
			map.put("onceOfTarget", null);
		}
		else {
			map.put("onceOfTarget", String.valueOf(campaign.getOnceOfTarget()));
		}

		if (campaign.getOnceOffExisting() == null) {
			map.put("onceOffExisting", null);
		}
		else {
			map.put(
				"onceOffExisting",
				String.valueOf(campaign.getOnceOffExisting()));
		}

		if (campaign.getRecurringExisting() == null) {
			map.put("recurringExisting", null);
		}
		else {
			map.put(
				"recurringExisting",
				String.valueOf(campaign.getRecurringExisting()));
		}

		if (campaign.getRecurringTarget() == null) {
			map.put("recurringTarget", null);
		}
		else {
			map.put(
				"recurringTarget",
				String.valueOf(campaign.getRecurringTarget()));
		}

		if (campaign.getSerialNum() == null) {
			map.put("serialNum", null);
		}
		else {
			map.put("serialNum", String.valueOf(campaign.getSerialNum()));
		}

		if (campaign.getSiebelProductIdTarget() == null) {
			map.put("siebelProductIdTarget", null);
		}
		else {
			map.put(
				"siebelProductIdTarget",
				String.valueOf(campaign.getSiebelProductIdTarget()));
		}

		if (campaign.getSiebelProductNameExisting() == null) {
			map.put("siebelProductNameExisting", null);
		}
		else {
			map.put(
				"siebelProductNameExisting",
				String.valueOf(campaign.getSiebelProductNameExisting()));
		}

		if (campaign.getSiebelProductNameTarget() == null) {
			map.put("siebelProductNameTarget", null);
		}
		else {
			map.put(
				"siebelProductNameTarget",
				String.valueOf(campaign.getSiebelProductNameTarget()));
		}

		if (campaign.getSpecificPortalDescription() == null) {
			map.put("specificPortalDescription", null);
		}
		else {
			map.put(
				"specificPortalDescription",
				String.valueOf(campaign.getSpecificPortalDescription()));
		}

		return map;
	}

	public static class CampaignJSONParser extends BaseJSONParser<Campaign> {

		@Override
		protected Campaign createDTO() {
			return new Campaign();
		}

		@Override
		protected Campaign[] createDTOArray(int size) {
			return new Campaign[size];
		}

		@Override
		protected void setField(
			Campaign campaign, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "address")) {
				if (jsonParserFieldValue != null) {
					campaign.setAddress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "campaignContactId")) {
				if (jsonParserFieldValue != null) {
					campaign.setCampaignContactId((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "comparisonFlag")) {
				if (jsonParserFieldValue != null) {
					campaign.setComparisonFlag((Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "contactId")) {
				if (jsonParserFieldValue != null) {
					campaign.setContactId((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "eshopIdExisting")) {
				if (jsonParserFieldValue != null) {
					campaign.setEshopIdExisting((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "eshopIdTarget")) {
				if (jsonParserFieldValue != null) {
					campaign.setEshopIdTarget((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "genevaBillingAccount")) {

				if (jsonParserFieldValue != null) {
					campaign.setGenevaBillingAccount(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "onceOfTarget")) {
				if (jsonParserFieldValue != null) {
					campaign.setOnceOfTarget((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "onceOffExisting")) {
				if (jsonParserFieldValue != null) {
					campaign.setOnceOffExisting((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "recurringExisting")) {
				if (jsonParserFieldValue != null) {
					campaign.setRecurringExisting((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "recurringTarget")) {
				if (jsonParserFieldValue != null) {
					campaign.setRecurringTarget((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "serialNum")) {
				if (jsonParserFieldValue != null) {
					campaign.setSerialNum((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "siebelProductIdTarget")) {

				if (jsonParserFieldValue != null) {
					campaign.setSiebelProductIdTarget(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "siebelProductNameExisting")) {

				if (jsonParserFieldValue != null) {
					campaign.setSiebelProductNameExisting(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "siebelProductNameTarget")) {

				if (jsonParserFieldValue != null) {
					campaign.setSiebelProductNameTarget(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "specificPortalDescription")) {

				if (jsonParserFieldValue != null) {
					campaign.setSpecificPortalDescription(
						(String)jsonParserFieldValue);
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