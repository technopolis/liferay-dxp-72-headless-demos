package gr.open.cosmote.rest.app.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.function.UnsafeTriConsumer;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import gr.open.cosmote.rest.app.client.dto.v1_0.Campaign;
import gr.open.cosmote.rest.app.client.http.HttpInvoker;
import gr.open.cosmote.rest.app.client.pagination.Page;
import gr.open.cosmote.rest.app.client.pagination.Pagination;
import gr.open.cosmote.rest.app.client.resource.v1_0.CampaignResource;
import gr.open.cosmote.rest.app.client.serdes.v1_0.CampaignSerDes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.lang.time.DateUtils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
public abstract class BaseCampaignResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_campaignResource.setContextCompany(testCompany);

		CampaignResource.Builder builder = CampaignResource.builder();

		campaignResource = builder.locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		Campaign campaign1 = randomCampaign();

		String json = objectMapper.writeValueAsString(campaign1);

		Campaign campaign2 = CampaignSerDes.toDTO(json);

		Assert.assertTrue(equals(campaign1, campaign2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		Campaign campaign = randomCampaign();

		String json1 = objectMapper.writeValueAsString(campaign);
		String json2 = CampaignSerDes.toJSON(campaign);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		Campaign campaign = randomCampaign();

		campaign.setAddress(regex);
		campaign.setCampaignContactId(regex);
		campaign.setContactId(regex);
		campaign.setEshopIdExisting(regex);
		campaign.setEshopIdTarget(regex);
		campaign.setGenevaBillingAccount(regex);
		campaign.setOnceOfTarget(regex);
		campaign.setOnceOffExisting(regex);
		campaign.setRecurringExisting(regex);
		campaign.setRecurringTarget(regex);
		campaign.setSerialNum(regex);
		campaign.setSiebelProductIdTarget(regex);
		campaign.setSiebelProductNameExisting(regex);
		campaign.setSiebelProductNameTarget(regex);
		campaign.setSpecificPortalDescription(regex);

		String json = CampaignSerDes.toJSON(campaign);

		Assert.assertFalse(json.contains(regex));

		campaign = CampaignSerDes.toDTO(json);

		Assert.assertEquals(regex, campaign.getAddress());
		Assert.assertEquals(regex, campaign.getCampaignContactId());
		Assert.assertEquals(regex, campaign.getContactId());
		Assert.assertEquals(regex, campaign.getEshopIdExisting());
		Assert.assertEquals(regex, campaign.getEshopIdTarget());
		Assert.assertEquals(regex, campaign.getGenevaBillingAccount());
		Assert.assertEquals(regex, campaign.getOnceOfTarget());
		Assert.assertEquals(regex, campaign.getOnceOffExisting());
		Assert.assertEquals(regex, campaign.getRecurringExisting());
		Assert.assertEquals(regex, campaign.getRecurringTarget());
		Assert.assertEquals(regex, campaign.getSerialNum());
		Assert.assertEquals(regex, campaign.getSiebelProductIdTarget());
		Assert.assertEquals(regex, campaign.getSiebelProductNameExisting());
		Assert.assertEquals(regex, campaign.getSiebelProductNameTarget());
		Assert.assertEquals(regex, campaign.getSpecificPortalDescription());
	}

	@Test
	public void testGetCampaignSmspromoCampaignContactContactPage()
		throws Exception {

		Page<Campaign> page =
			campaignResource.getCampaignSmspromoCampaignContactContactPage(
				testGetCampaignSmspromoCampaignContactContactPage_getCampaignContactId(),
				testGetCampaignSmspromoCampaignContactContactPage_getContactId(),
				RandomTestUtil.randomString(), null, Pagination.of(1, 2), null);

		Assert.assertEquals(0, page.getTotalCount());

		String campaignContactId =
			testGetCampaignSmspromoCampaignContactContactPage_getCampaignContactId();
		String irrelevantCampaignContactId =
			testGetCampaignSmspromoCampaignContactContactPage_getIrrelevantCampaignContactId();
		String contactId =
			testGetCampaignSmspromoCampaignContactContactPage_getContactId();
		String irrelevantContactId =
			testGetCampaignSmspromoCampaignContactContactPage_getIrrelevantContactId();

		if ((irrelevantCampaignContactId != null) &&
			(irrelevantContactId != null)) {

			Campaign irrelevantCampaign =
				testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
					irrelevantCampaignContactId, irrelevantContactId,
					randomIrrelevantCampaign());

			page =
				campaignResource.getCampaignSmspromoCampaignContactContactPage(
					irrelevantCampaignContactId, irrelevantContactId, null,
					null, Pagination.of(1, 2), null);

			Assert.assertEquals(1, page.getTotalCount());

			assertEquals(
				Arrays.asList(irrelevantCampaign),
				(List<Campaign>)page.getItems());
			assertValid(page);
		}

		Campaign campaign1 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, randomCampaign());

		Campaign campaign2 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, randomCampaign());

		page = campaignResource.getCampaignSmspromoCampaignContactContactPage(
			campaignContactId, contactId, null, null, Pagination.of(1, 2),
			null);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(campaign1, campaign2),
			(List<Campaign>)page.getItems());
		assertValid(page);
	}

	@Test
	public void testGetCampaignSmspromoCampaignContactContactPageWithFilterDateTimeEquals()
		throws Exception {

		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.DATE_TIME);

		if (entityFields.isEmpty()) {
			return;
		}

		String campaignContactId =
			testGetCampaignSmspromoCampaignContactContactPage_getCampaignContactId();
		String contactId =
			testGetCampaignSmspromoCampaignContactContactPage_getContactId();

		Campaign campaign1 = randomCampaign();

		campaign1 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, campaign1);

		for (EntityField entityField : entityFields) {
			Page<Campaign> page =
				campaignResource.getCampaignSmspromoCampaignContactContactPage(
					campaignContactId, contactId, null,
					getFilterString(entityField, "between", campaign1),
					Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(campaign1),
				(List<Campaign>)page.getItems());
		}
	}

	@Test
	public void testGetCampaignSmspromoCampaignContactContactPageWithFilterStringEquals()
		throws Exception {

		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.STRING);

		if (entityFields.isEmpty()) {
			return;
		}

		String campaignContactId =
			testGetCampaignSmspromoCampaignContactContactPage_getCampaignContactId();
		String contactId =
			testGetCampaignSmspromoCampaignContactContactPage_getContactId();

		Campaign campaign1 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, randomCampaign());

		@SuppressWarnings("PMD.UnusedLocalVariable")
		Campaign campaign2 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, randomCampaign());

		for (EntityField entityField : entityFields) {
			Page<Campaign> page =
				campaignResource.getCampaignSmspromoCampaignContactContactPage(
					campaignContactId, contactId, null,
					getFilterString(entityField, "eq", campaign1),
					Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(campaign1),
				(List<Campaign>)page.getItems());
		}
	}

	@Test
	public void testGetCampaignSmspromoCampaignContactContactPageWithPagination()
		throws Exception {

		String campaignContactId =
			testGetCampaignSmspromoCampaignContactContactPage_getCampaignContactId();
		String contactId =
			testGetCampaignSmspromoCampaignContactContactPage_getContactId();

		Campaign campaign1 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, randomCampaign());

		Campaign campaign2 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, randomCampaign());

		Campaign campaign3 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, randomCampaign());

		Page<Campaign> page1 =
			campaignResource.getCampaignSmspromoCampaignContactContactPage(
				campaignContactId, contactId, null, null, Pagination.of(1, 2),
				null);

		List<Campaign> campaigns1 = (List<Campaign>)page1.getItems();

		Assert.assertEquals(campaigns1.toString(), 2, campaigns1.size());

		Page<Campaign> page2 =
			campaignResource.getCampaignSmspromoCampaignContactContactPage(
				campaignContactId, contactId, null, null, Pagination.of(2, 2),
				null);

		Assert.assertEquals(3, page2.getTotalCount());

		List<Campaign> campaigns2 = (List<Campaign>)page2.getItems();

		Assert.assertEquals(campaigns2.toString(), 1, campaigns2.size());

		Page<Campaign> page3 =
			campaignResource.getCampaignSmspromoCampaignContactContactPage(
				campaignContactId, contactId, null, null, Pagination.of(1, 3),
				null);

		assertEqualsIgnoringOrder(
			Arrays.asList(campaign1, campaign2, campaign3),
			(List<Campaign>)page3.getItems());
	}

	@Test
	public void testGetCampaignSmspromoCampaignContactContactPageWithSortDateTime()
		throws Exception {

		testGetCampaignSmspromoCampaignContactContactPageWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, campaign1, campaign2) -> {
				BeanUtils.setProperty(
					campaign1, entityField.getName(),
					DateUtils.addMinutes(new Date(), -2));
			});
	}

	@Test
	public void testGetCampaignSmspromoCampaignContactContactPageWithSortInteger()
		throws Exception {

		testGetCampaignSmspromoCampaignContactContactPageWithSort(
			EntityField.Type.INTEGER,
			(entityField, campaign1, campaign2) -> {
				BeanUtils.setProperty(campaign1, entityField.getName(), 0);
				BeanUtils.setProperty(campaign2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetCampaignSmspromoCampaignContactContactPageWithSortString()
		throws Exception {

		testGetCampaignSmspromoCampaignContactContactPageWithSort(
			EntityField.Type.STRING,
			(entityField, campaign1, campaign2) -> {
				Class<?> clazz = campaign1.getClass();

				Method method = clazz.getMethod(
					"get" +
						StringUtil.upperCaseFirstLetter(entityField.getName()));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanUtils.setProperty(
						campaign1, entityField.getName(),
						Collections.singletonMap("Aaa", "Aaa"));
					BeanUtils.setProperty(
						campaign2, entityField.getName(),
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else {
					BeanUtils.setProperty(
						campaign1, entityField.getName(), "Aaa");
					BeanUtils.setProperty(
						campaign2, entityField.getName(), "Bbb");
				}
			});
	}

	protected void testGetCampaignSmspromoCampaignContactContactPageWithSort(
			EntityField.Type type,
			UnsafeTriConsumer<EntityField, Campaign, Campaign, Exception>
				unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		String campaignContactId =
			testGetCampaignSmspromoCampaignContactContactPage_getCampaignContactId();
		String contactId =
			testGetCampaignSmspromoCampaignContactContactPage_getContactId();

		Campaign campaign1 = randomCampaign();
		Campaign campaign2 = randomCampaign();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(entityField, campaign1, campaign2);
		}

		campaign1 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, campaign1);

		campaign2 =
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				campaignContactId, contactId, campaign2);

		for (EntityField entityField : entityFields) {
			Page<Campaign> ascPage =
				campaignResource.getCampaignSmspromoCampaignContactContactPage(
					campaignContactId, contactId, null, null,
					Pagination.of(1, 2), entityField.getName() + ":asc");

			assertEquals(
				Arrays.asList(campaign1, campaign2),
				(List<Campaign>)ascPage.getItems());

			Page<Campaign> descPage =
				campaignResource.getCampaignSmspromoCampaignContactContactPage(
					campaignContactId, contactId, null, null,
					Pagination.of(1, 2), entityField.getName() + ":desc");

			assertEquals(
				Arrays.asList(campaign2, campaign1),
				(List<Campaign>)descPage.getItems());
		}
	}

	protected Campaign
			testGetCampaignSmspromoCampaignContactContactPage_addCampaign(
				String campaignContactId, String contactId, Campaign campaign)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected String
			testGetCampaignSmspromoCampaignContactContactPage_getCampaignContactId()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected String
			testGetCampaignSmspromoCampaignContactContactPage_getIrrelevantCampaignContactId()
		throws Exception {

		return null;
	}

	protected String
			testGetCampaignSmspromoCampaignContactContactPage_getContactId()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected String
			testGetCampaignSmspromoCampaignContactContactPage_getIrrelevantContactId()
		throws Exception {

		return null;
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(Campaign campaign1, Campaign campaign2) {
		Assert.assertTrue(
			campaign1 + " does not equal " + campaign2,
			equals(campaign1, campaign2));
	}

	protected void assertEquals(
		List<Campaign> campaigns1, List<Campaign> campaigns2) {

		Assert.assertEquals(campaigns1.size(), campaigns2.size());

		for (int i = 0; i < campaigns1.size(); i++) {
			Campaign campaign1 = campaigns1.get(i);
			Campaign campaign2 = campaigns2.get(i);

			assertEquals(campaign1, campaign2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<Campaign> campaigns1, List<Campaign> campaigns2) {

		Assert.assertEquals(campaigns1.size(), campaigns2.size());

		for (Campaign campaign1 : campaigns1) {
			boolean contains = false;

			for (Campaign campaign2 : campaigns2) {
				if (equals(campaign1, campaign2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				campaigns2 + " does not contain " + campaign1, contains);
		}
	}

	protected void assertEqualsJSONArray(
		List<Campaign> campaigns, JSONArray jsonArray) {

		for (Campaign campaign : campaigns) {
			boolean contains = false;

			for (Object object : jsonArray) {
				if (equalsJSONObject(campaign, (JSONObject)object)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				jsonArray + " does not contain " + campaign, contains);
		}
	}

	protected void assertValid(Campaign campaign) {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (campaign.getAddress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"campaignContactId", additionalAssertFieldName)) {

				if (campaign.getCampaignContactId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("comparisonFlag", additionalAssertFieldName)) {
				if (campaign.getComparisonFlag() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("contactId", additionalAssertFieldName)) {
				if (campaign.getContactId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("eshopIdExisting", additionalAssertFieldName)) {
				if (campaign.getEshopIdExisting() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("eshopIdTarget", additionalAssertFieldName)) {
				if (campaign.getEshopIdTarget() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"genevaBillingAccount", additionalAssertFieldName)) {

				if (campaign.getGenevaBillingAccount() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("onceOfTarget", additionalAssertFieldName)) {
				if (campaign.getOnceOfTarget() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("onceOffExisting", additionalAssertFieldName)) {
				if (campaign.getOnceOffExisting() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"recurringExisting", additionalAssertFieldName)) {

				if (campaign.getRecurringExisting() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("recurringTarget", additionalAssertFieldName)) {
				if (campaign.getRecurringTarget() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("serialNum", additionalAssertFieldName)) {
				if (campaign.getSerialNum() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"siebelProductIdTarget", additionalAssertFieldName)) {

				if (campaign.getSiebelProductIdTarget() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"siebelProductNameExisting", additionalAssertFieldName)) {

				if (campaign.getSiebelProductNameExisting() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"siebelProductNameTarget", additionalAssertFieldName)) {

				if (campaign.getSiebelProductNameTarget() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"specificPortalDescription", additionalAssertFieldName)) {

				if (campaign.getSpecificPortalDescription() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<Campaign> page) {
		boolean valid = false;

		java.util.Collection<Campaign> campaigns = page.getItems();

		int size = campaigns.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			graphQLFields.add(new GraphQLField(additionalAssertFieldName));
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(Campaign campaign1, Campaign campaign2) {
		if (campaign1 == campaign2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getAddress(), campaign2.getAddress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"campaignContactId", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						campaign1.getCampaignContactId(),
						campaign2.getCampaignContactId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("comparisonFlag", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getComparisonFlag(),
						campaign2.getComparisonFlag())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("contactId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getContactId(), campaign2.getContactId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("eshopIdExisting", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getEshopIdExisting(),
						campaign2.getEshopIdExisting())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("eshopIdTarget", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getEshopIdTarget(),
						campaign2.getEshopIdTarget())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"genevaBillingAccount", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						campaign1.getGenevaBillingAccount(),
						campaign2.getGenevaBillingAccount())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("onceOfTarget", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getOnceOfTarget(),
						campaign2.getOnceOfTarget())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("onceOffExisting", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getOnceOffExisting(),
						campaign2.getOnceOffExisting())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"recurringExisting", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						campaign1.getRecurringExisting(),
						campaign2.getRecurringExisting())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("recurringTarget", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getRecurringTarget(),
						campaign2.getRecurringTarget())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("serialNum", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						campaign1.getSerialNum(), campaign2.getSerialNum())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"siebelProductIdTarget", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						campaign1.getSiebelProductIdTarget(),
						campaign2.getSiebelProductIdTarget())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"siebelProductNameExisting", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						campaign1.getSiebelProductNameExisting(),
						campaign2.getSiebelProductNameExisting())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"siebelProductNameTarget", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						campaign1.getSiebelProductNameTarget(),
						campaign2.getSiebelProductNameTarget())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"specificPortalDescription", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						campaign1.getSpecificPortalDescription(),
						campaign2.getSpecificPortalDescription())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equalsJSONObject(
		Campaign campaign, JSONObject jsonObject) {

		for (String fieldName : getAdditionalAssertFieldNames()) {
			if (Objects.equals("address", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getAddress(),
						jsonObject.getString("address"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("campaignContactId", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getCampaignContactId(),
						jsonObject.getString("campaignContactId"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("comparisonFlag", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getComparisonFlag(),
						jsonObject.getBoolean("comparisonFlag"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("contactId", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getContactId(),
						jsonObject.getString("contactId"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("eshopIdExisting", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getEshopIdExisting(),
						jsonObject.getString("eshopIdExisting"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("eshopIdTarget", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getEshopIdTarget(),
						jsonObject.getString("eshopIdTarget"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("genevaBillingAccount", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getGenevaBillingAccount(),
						jsonObject.getString("genevaBillingAccount"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("onceOfTarget", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getOnceOfTarget(),
						jsonObject.getString("onceOfTarget"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("onceOffExisting", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getOnceOffExisting(),
						jsonObject.getString("onceOffExisting"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("recurringExisting", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getRecurringExisting(),
						jsonObject.getString("recurringExisting"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("recurringTarget", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getRecurringTarget(),
						jsonObject.getString("recurringTarget"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("serialNum", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getSerialNum(),
						jsonObject.getString("serialNum"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("siebelProductIdTarget", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getSiebelProductIdTarget(),
						jsonObject.getString("siebelProductIdTarget"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("siebelProductNameExisting", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getSiebelProductNameExisting(),
						jsonObject.getString("siebelProductNameExisting"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("siebelProductNameTarget", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getSiebelProductNameTarget(),
						jsonObject.getString("siebelProductNameTarget"))) {

					return false;
				}

				continue;
			}

			if (Objects.equals("specificPortalDescription", fieldName)) {
				if (!Objects.deepEquals(
						campaign.getSpecificPortalDescription(),
						jsonObject.getString("specificPortalDescription"))) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid field name " + fieldName);
		}

		return true;
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_campaignResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_campaignResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator, Campaign campaign) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("address")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getAddress()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("campaignContactId")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getCampaignContactId()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("comparisonFlag")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("contactId")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getContactId()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("eshopIdExisting")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getEshopIdExisting()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("eshopIdTarget")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getEshopIdTarget()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("genevaBillingAccount")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getGenevaBillingAccount()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("onceOfTarget")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getOnceOfTarget()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("onceOffExisting")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getOnceOffExisting()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("recurringExisting")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getRecurringExisting()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("recurringTarget")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getRecurringTarget()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("serialNum")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getSerialNum()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("siebelProductIdTarget")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getSiebelProductIdTarget()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("siebelProductNameExisting")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getSiebelProductNameExisting()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("siebelProductNameTarget")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getSiebelProductNameTarget()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("specificPortalDescription")) {
			sb.append("'");
			sb.append(String.valueOf(campaign.getSpecificPortalDescription()));
			sb.append("'");

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected Campaign randomCampaign() throws Exception {
		return new Campaign() {
			{
				address = RandomTestUtil.randomString();
				campaignContactId = RandomTestUtil.randomString();
				comparisonFlag = RandomTestUtil.randomBoolean();
				contactId = RandomTestUtil.randomString();
				eshopIdExisting = RandomTestUtil.randomString();
				eshopIdTarget = RandomTestUtil.randomString();
				genevaBillingAccount = RandomTestUtil.randomString();
				onceOfTarget = RandomTestUtil.randomString();
				onceOffExisting = RandomTestUtil.randomString();
				recurringExisting = RandomTestUtil.randomString();
				recurringTarget = RandomTestUtil.randomString();
				serialNum = RandomTestUtil.randomString();
				siebelProductIdTarget = RandomTestUtil.randomString();
				siebelProductNameExisting = RandomTestUtil.randomString();
				siebelProductNameTarget = RandomTestUtil.randomString();
				specificPortalDescription = RandomTestUtil.randomString();
			}
		};
	}

	protected Campaign randomIrrelevantCampaign() throws Exception {
		Campaign randomIrrelevantCampaign = randomCampaign();

		return randomIrrelevantCampaign;
	}

	protected Campaign randomPatchCampaign() throws Exception {
		return randomCampaign();
	}

	protected CampaignResource campaignResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(":");
					sb.append(entry.getValue());
					sb.append(",");
				}

				sb.setLength(sb.length() - 1);

				sb.append(")");
			}

			if (_graphQLFields.length > 0) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(",");
				}

				sb.setLength(sb.length() - 1);

				sb.append("}");
			}

			return sb.toString();
		}

		private final GraphQLField[] _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final Log _log = LogFactoryUtil.getLog(
		BaseCampaignResourceTestCase.class);

	private static BeanUtilsBean _beanUtilsBean = new BeanUtilsBean() {

		@Override
		public void copyProperty(Object bean, String name, Object value)
			throws IllegalAccessException, InvocationTargetException {

			if (value != null) {
				super.copyProperty(bean, name, value);
			}
		}

	};
	private static DateFormat _dateFormat;

	@Inject
	private gr.open.cosmote.rest.app.resource.v1_0.CampaignResource
		_campaignResource;

}