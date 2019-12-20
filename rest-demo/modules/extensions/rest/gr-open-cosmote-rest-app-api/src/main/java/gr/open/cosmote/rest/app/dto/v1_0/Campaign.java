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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
@GraphQLName("Campaign")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Campaign")
public class Campaign {

	@Schema
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@JsonIgnore
	public void setAddress(
		UnsafeSupplier<String, Exception> addressUnsafeSupplier) {

		try {
			address = addressUnsafeSupplier.get();
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
	protected String address;

	@Schema
	public String getCampaignContactId() {
		return campaignContactId;
	}

	public void setCampaignContactId(String campaignContactId) {
		this.campaignContactId = campaignContactId;
	}

	@JsonIgnore
	public void setCampaignContactId(
		UnsafeSupplier<String, Exception> campaignContactIdUnsafeSupplier) {

		try {
			campaignContactId = campaignContactIdUnsafeSupplier.get();
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
	protected String campaignContactId;

	@Schema
	public Boolean getComparisonFlag() {
		return comparisonFlag;
	}

	public void setComparisonFlag(Boolean comparisonFlag) {
		this.comparisonFlag = comparisonFlag;
	}

	@JsonIgnore
	public void setComparisonFlag(
		UnsafeSupplier<Boolean, Exception> comparisonFlagUnsafeSupplier) {

		try {
			comparisonFlag = comparisonFlagUnsafeSupplier.get();
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
	protected Boolean comparisonFlag;

	@Schema
	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	@JsonIgnore
	public void setContactId(
		UnsafeSupplier<String, Exception> contactIdUnsafeSupplier) {

		try {
			contactId = contactIdUnsafeSupplier.get();
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
	protected String contactId;

	@Schema
	public String getEshopIdExisting() {
		return eshopIdExisting;
	}

	public void setEshopIdExisting(String eshopIdExisting) {
		this.eshopIdExisting = eshopIdExisting;
	}

	@JsonIgnore
	public void setEshopIdExisting(
		UnsafeSupplier<String, Exception> eshopIdExistingUnsafeSupplier) {

		try {
			eshopIdExisting = eshopIdExistingUnsafeSupplier.get();
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
	protected String eshopIdExisting;

	@Schema
	public String getEshopIdTarget() {
		return eshopIdTarget;
	}

	public void setEshopIdTarget(String eshopIdTarget) {
		this.eshopIdTarget = eshopIdTarget;
	}

	@JsonIgnore
	public void setEshopIdTarget(
		UnsafeSupplier<String, Exception> eshopIdTargetUnsafeSupplier) {

		try {
			eshopIdTarget = eshopIdTargetUnsafeSupplier.get();
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
	protected String eshopIdTarget;

	@Schema
	public String getGenevaBillingAccount() {
		return genevaBillingAccount;
	}

	public void setGenevaBillingAccount(String genevaBillingAccount) {
		this.genevaBillingAccount = genevaBillingAccount;
	}

	@JsonIgnore
	public void setGenevaBillingAccount(
		UnsafeSupplier<String, Exception> genevaBillingAccountUnsafeSupplier) {

		try {
			genevaBillingAccount = genevaBillingAccountUnsafeSupplier.get();
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
	protected String genevaBillingAccount;

	@Schema
	public String getOnceOfTarget() {
		return onceOfTarget;
	}

	public void setOnceOfTarget(String onceOfTarget) {
		this.onceOfTarget = onceOfTarget;
	}

	@JsonIgnore
	public void setOnceOfTarget(
		UnsafeSupplier<String, Exception> onceOfTargetUnsafeSupplier) {

		try {
			onceOfTarget = onceOfTargetUnsafeSupplier.get();
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
	protected String onceOfTarget;

	@Schema
	public String getOnceOffExisting() {
		return onceOffExisting;
	}

	public void setOnceOffExisting(String onceOffExisting) {
		this.onceOffExisting = onceOffExisting;
	}

	@JsonIgnore
	public void setOnceOffExisting(
		UnsafeSupplier<String, Exception> onceOffExistingUnsafeSupplier) {

		try {
			onceOffExisting = onceOffExistingUnsafeSupplier.get();
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
	protected String onceOffExisting;

	@Schema
	public String getRecurringExisting() {
		return recurringExisting;
	}

	public void setRecurringExisting(String recurringExisting) {
		this.recurringExisting = recurringExisting;
	}

	@JsonIgnore
	public void setRecurringExisting(
		UnsafeSupplier<String, Exception> recurringExistingUnsafeSupplier) {

		try {
			recurringExisting = recurringExistingUnsafeSupplier.get();
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
	protected String recurringExisting;

	@Schema
	public String getRecurringTarget() {
		return recurringTarget;
	}

	public void setRecurringTarget(String recurringTarget) {
		this.recurringTarget = recurringTarget;
	}

	@JsonIgnore
	public void setRecurringTarget(
		UnsafeSupplier<String, Exception> recurringTargetUnsafeSupplier) {

		try {
			recurringTarget = recurringTargetUnsafeSupplier.get();
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
	protected String recurringTarget;

	@Schema
	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	@JsonIgnore
	public void setSerialNum(
		UnsafeSupplier<String, Exception> serialNumUnsafeSupplier) {

		try {
			serialNum = serialNumUnsafeSupplier.get();
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
	protected String serialNum;

	@Schema
	public String getSiebelProductIdTarget() {
		return siebelProductIdTarget;
	}

	public void setSiebelProductIdTarget(String siebelProductIdTarget) {
		this.siebelProductIdTarget = siebelProductIdTarget;
	}

	@JsonIgnore
	public void setSiebelProductIdTarget(
		UnsafeSupplier<String, Exception> siebelProductIdTargetUnsafeSupplier) {

		try {
			siebelProductIdTarget = siebelProductIdTargetUnsafeSupplier.get();
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
	protected String siebelProductIdTarget;

	@Schema
	public String getSiebelProductNameExisting() {
		return siebelProductNameExisting;
	}

	public void setSiebelProductNameExisting(String siebelProductNameExisting) {
		this.siebelProductNameExisting = siebelProductNameExisting;
	}

	@JsonIgnore
	public void setSiebelProductNameExisting(
		UnsafeSupplier<String, Exception>
			siebelProductNameExistingUnsafeSupplier) {

		try {
			siebelProductNameExisting =
				siebelProductNameExistingUnsafeSupplier.get();
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
	protected String siebelProductNameExisting;

	@Schema
	public String getSiebelProductNameTarget() {
		return siebelProductNameTarget;
	}

	public void setSiebelProductNameTarget(String siebelProductNameTarget) {
		this.siebelProductNameTarget = siebelProductNameTarget;
	}

	@JsonIgnore
	public void setSiebelProductNameTarget(
		UnsafeSupplier<String, Exception>
			siebelProductNameTargetUnsafeSupplier) {

		try {
			siebelProductNameTarget =
				siebelProductNameTargetUnsafeSupplier.get();
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
	protected String siebelProductNameTarget;

	@Schema
	public String getSpecificPortalDescription() {
		return specificPortalDescription;
	}

	public void setSpecificPortalDescription(String specificPortalDescription) {
		this.specificPortalDescription = specificPortalDescription;
	}

	@JsonIgnore
	public void setSpecificPortalDescription(
		UnsafeSupplier<String, Exception>
			specificPortalDescriptionUnsafeSupplier) {

		try {
			specificPortalDescription =
				specificPortalDescriptionUnsafeSupplier.get();
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
	protected String specificPortalDescription;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Campaign)) {
			return false;
		}

		Campaign campaign = (Campaign)object;

		return Objects.equals(toString(), campaign.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (address != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append("\"");

			sb.append(_escape(address));

			sb.append("\"");
		}

		if (campaignContactId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"campaignContactId\": ");

			sb.append("\"");

			sb.append(_escape(campaignContactId));

			sb.append("\"");
		}

		if (comparisonFlag != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"comparisonFlag\": ");

			sb.append(comparisonFlag);
		}

		if (contactId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contactId\": ");

			sb.append("\"");

			sb.append(_escape(contactId));

			sb.append("\"");
		}

		if (eshopIdExisting != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"eshopIdExisting\": ");

			sb.append("\"");

			sb.append(_escape(eshopIdExisting));

			sb.append("\"");
		}

		if (eshopIdTarget != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"eshopIdTarget\": ");

			sb.append("\"");

			sb.append(_escape(eshopIdTarget));

			sb.append("\"");
		}

		if (genevaBillingAccount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"genevaBillingAccount\": ");

			sb.append("\"");

			sb.append(_escape(genevaBillingAccount));

			sb.append("\"");
		}

		if (onceOfTarget != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"onceOfTarget\": ");

			sb.append("\"");

			sb.append(_escape(onceOfTarget));

			sb.append("\"");
		}

		if (onceOffExisting != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"onceOffExisting\": ");

			sb.append("\"");

			sb.append(_escape(onceOffExisting));

			sb.append("\"");
		}

		if (recurringExisting != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recurringExisting\": ");

			sb.append("\"");

			sb.append(_escape(recurringExisting));

			sb.append("\"");
		}

		if (recurringTarget != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recurringTarget\": ");

			sb.append("\"");

			sb.append(_escape(recurringTarget));

			sb.append("\"");
		}

		if (serialNum != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serialNum\": ");

			sb.append("\"");

			sb.append(_escape(serialNum));

			sb.append("\"");
		}

		if (siebelProductIdTarget != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siebelProductIdTarget\": ");

			sb.append("\"");

			sb.append(_escape(siebelProductIdTarget));

			sb.append("\"");
		}

		if (siebelProductNameExisting != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siebelProductNameExisting\": ");

			sb.append("\"");

			sb.append(_escape(siebelProductNameExisting));

			sb.append("\"");
		}

		if (siebelProductNameTarget != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siebelProductNameTarget\": ");

			sb.append("\"");

			sb.append(_escape(siebelProductNameTarget));

			sb.append("\"");
		}

		if (specificPortalDescription != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"specificPortalDescription\": ");

			sb.append("\"");

			sb.append(_escape(specificPortalDescription));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		defaultValue = "gr.open.cosmote.rest.app.dto.v1_0.Campaign",
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