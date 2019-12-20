package gr.open.cosmote.rest.app.client.dto.v1_0;

import gr.open.cosmote.rest.app.client.function.UnsafeSupplier;
import gr.open.cosmote.rest.app.client.serdes.v1_0.CampaignSerDes;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
public class Campaign {

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddress(
		UnsafeSupplier<String, Exception> addressUnsafeSupplier) {

		try {
			address = addressUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String address;

	public String getCampaignContactId() {
		return campaignContactId;
	}

	public void setCampaignContactId(String campaignContactId) {
		this.campaignContactId = campaignContactId;
	}

	public void setCampaignContactId(
		UnsafeSupplier<String, Exception> campaignContactIdUnsafeSupplier) {

		try {
			campaignContactId = campaignContactIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String campaignContactId;

	public Boolean getComparisonFlag() {
		return comparisonFlag;
	}

	public void setComparisonFlag(Boolean comparisonFlag) {
		this.comparisonFlag = comparisonFlag;
	}

	public void setComparisonFlag(
		UnsafeSupplier<Boolean, Exception> comparisonFlagUnsafeSupplier) {

		try {
			comparisonFlag = comparisonFlagUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean comparisonFlag;

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public void setContactId(
		UnsafeSupplier<String, Exception> contactIdUnsafeSupplier) {

		try {
			contactId = contactIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String contactId;

	public String getEshopIdExisting() {
		return eshopIdExisting;
	}

	public void setEshopIdExisting(String eshopIdExisting) {
		this.eshopIdExisting = eshopIdExisting;
	}

	public void setEshopIdExisting(
		UnsafeSupplier<String, Exception> eshopIdExistingUnsafeSupplier) {

		try {
			eshopIdExisting = eshopIdExistingUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String eshopIdExisting;

	public String getEshopIdTarget() {
		return eshopIdTarget;
	}

	public void setEshopIdTarget(String eshopIdTarget) {
		this.eshopIdTarget = eshopIdTarget;
	}

	public void setEshopIdTarget(
		UnsafeSupplier<String, Exception> eshopIdTargetUnsafeSupplier) {

		try {
			eshopIdTarget = eshopIdTargetUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String eshopIdTarget;

	public String getGenevaBillingAccount() {
		return genevaBillingAccount;
	}

	public void setGenevaBillingAccount(String genevaBillingAccount) {
		this.genevaBillingAccount = genevaBillingAccount;
	}

	public void setGenevaBillingAccount(
		UnsafeSupplier<String, Exception> genevaBillingAccountUnsafeSupplier) {

		try {
			genevaBillingAccount = genevaBillingAccountUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String genevaBillingAccount;

	public String getOnceOfTarget() {
		return onceOfTarget;
	}

	public void setOnceOfTarget(String onceOfTarget) {
		this.onceOfTarget = onceOfTarget;
	}

	public void setOnceOfTarget(
		UnsafeSupplier<String, Exception> onceOfTargetUnsafeSupplier) {

		try {
			onceOfTarget = onceOfTargetUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String onceOfTarget;

	public String getOnceOffExisting() {
		return onceOffExisting;
	}

	public void setOnceOffExisting(String onceOffExisting) {
		this.onceOffExisting = onceOffExisting;
	}

	public void setOnceOffExisting(
		UnsafeSupplier<String, Exception> onceOffExistingUnsafeSupplier) {

		try {
			onceOffExisting = onceOffExistingUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String onceOffExisting;

	public String getRecurringExisting() {
		return recurringExisting;
	}

	public void setRecurringExisting(String recurringExisting) {
		this.recurringExisting = recurringExisting;
	}

	public void setRecurringExisting(
		UnsafeSupplier<String, Exception> recurringExistingUnsafeSupplier) {

		try {
			recurringExisting = recurringExistingUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String recurringExisting;

	public String getRecurringTarget() {
		return recurringTarget;
	}

	public void setRecurringTarget(String recurringTarget) {
		this.recurringTarget = recurringTarget;
	}

	public void setRecurringTarget(
		UnsafeSupplier<String, Exception> recurringTargetUnsafeSupplier) {

		try {
			recurringTarget = recurringTargetUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String recurringTarget;

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public void setSerialNum(
		UnsafeSupplier<String, Exception> serialNumUnsafeSupplier) {

		try {
			serialNum = serialNumUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String serialNum;

	public String getSiebelProductIdTarget() {
		return siebelProductIdTarget;
	}

	public void setSiebelProductIdTarget(String siebelProductIdTarget) {
		this.siebelProductIdTarget = siebelProductIdTarget;
	}

	public void setSiebelProductIdTarget(
		UnsafeSupplier<String, Exception> siebelProductIdTargetUnsafeSupplier) {

		try {
			siebelProductIdTarget = siebelProductIdTargetUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String siebelProductIdTarget;

	public String getSiebelProductNameExisting() {
		return siebelProductNameExisting;
	}

	public void setSiebelProductNameExisting(String siebelProductNameExisting) {
		this.siebelProductNameExisting = siebelProductNameExisting;
	}

	public void setSiebelProductNameExisting(
		UnsafeSupplier<String, Exception>
			siebelProductNameExistingUnsafeSupplier) {

		try {
			siebelProductNameExisting =
				siebelProductNameExistingUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String siebelProductNameExisting;

	public String getSiebelProductNameTarget() {
		return siebelProductNameTarget;
	}

	public void setSiebelProductNameTarget(String siebelProductNameTarget) {
		this.siebelProductNameTarget = siebelProductNameTarget;
	}

	public void setSiebelProductNameTarget(
		UnsafeSupplier<String, Exception>
			siebelProductNameTargetUnsafeSupplier) {

		try {
			siebelProductNameTarget =
				siebelProductNameTargetUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String siebelProductNameTarget;

	public String getSpecificPortalDescription() {
		return specificPortalDescription;
	}

	public void setSpecificPortalDescription(String specificPortalDescription) {
		this.specificPortalDescription = specificPortalDescription;
	}

	public void setSpecificPortalDescription(
		UnsafeSupplier<String, Exception>
			specificPortalDescriptionUnsafeSupplier) {

		try {
			specificPortalDescription =
				specificPortalDescriptionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

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
		return CampaignSerDes.toJSON(this);
	}

}