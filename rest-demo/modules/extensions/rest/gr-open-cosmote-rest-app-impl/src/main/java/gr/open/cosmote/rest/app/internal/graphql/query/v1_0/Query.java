package gr.open.cosmote.rest.app.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import gr.open.cosmote.rest.app.dto.v1_0.Campaign;
import gr.open.cosmote.rest.app.dto.v1_0.Product;
import gr.open.cosmote.rest.app.resource.v1_0.CampaignResource;
import gr.open.cosmote.rest.app.resource.v1_0.ProductResource;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
public class Query {

	public static void setCampaignResourceComponentServiceObjects(
		ComponentServiceObjects<CampaignResource>
			campaignResourceComponentServiceObjects) {

		_campaignResourceComponentServiceObjects =
			campaignResourceComponentServiceObjects;
	}

	public static void setProductResourceComponentServiceObjects(
		ComponentServiceObjects<ProductResource>
			productResourceComponentServiceObjects) {

		_productResourceComponentServiceObjects =
			productResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {campaignProduct(idRef: ___){idRef, title, description, businessDescription, productType, category, summary, businessSummary, imagePath, price}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public Product campaignProduct(@GraphQLName("idRef") String idRef)
		throws Exception {

		return _applyComponentServiceObjects(
			_productResourceComponentServiceObjects,
			this::_populateResourceContext,
			productResource -> productResource.getCampaignProduct(idRef));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {campaignSmspromoCampaignContactContact(campaignContactId: ___, contactId: ___, filter: ___, page: ___, pageSize: ___, search: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public CampaignPage campaignSmspromoCampaignContactContact(
			@GraphQLName("campaignContactId") String campaignContactId,
			@GraphQLName("contactId") String contactId,
			@GraphQLName("search") String search,
			@GraphQLName("filter") String filterString,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_campaignResourceComponentServiceObjects,
			this::_populateResourceContext,
			campaignResource -> new CampaignPage(
				campaignResource.getCampaignSmspromoCampaignContactContactPage(
					campaignContactId, contactId, search,
					_filterBiFunction.apply(campaignResource, filterString),
					Pagination.of(page, pageSize),
					_sortsBiFunction.apply(campaignResource, sortsString))));
	}

	@GraphQLName("CampaignPage")
	public class CampaignPage {

		public CampaignPage(Page campaignPage) {
			items = campaignPage.getItems();
			page = campaignPage.getPage();
			pageSize = campaignPage.getPageSize();
			totalCount = campaignPage.getTotalCount();
		}

		@GraphQLField
		protected java.util.Collection<Campaign> items;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("ProductPage")
	public class ProductPage {

		public ProductPage(Page productPage) {
			items = productPage.getItems();
			page = productPage.getPage();
			pageSize = productPage.getPageSize();
			totalCount = productPage.getTotalCount();
		}

		@GraphQLField
		protected java.util.Collection<Product> items;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(CampaignResource campaignResource)
		throws Exception {

		campaignResource.setContextAcceptLanguage(_acceptLanguage);
		campaignResource.setContextCompany(_company);
		campaignResource.setContextHttpServletRequest(_httpServletRequest);
		campaignResource.setContextHttpServletResponse(_httpServletResponse);
		campaignResource.setContextUriInfo(_uriInfo);
		campaignResource.setContextUser(_user);
	}

	private void _populateResourceContext(ProductResource productResource)
		throws Exception {

		productResource.setContextAcceptLanguage(_acceptLanguage);
		productResource.setContextCompany(_company);
		productResource.setContextHttpServletRequest(_httpServletRequest);
		productResource.setContextHttpServletResponse(_httpServletResponse);
		productResource.setContextUriInfo(_uriInfo);
		productResource.setContextUser(_user);
	}

	private static ComponentServiceObjects<CampaignResource>
		_campaignResourceComponentServiceObjects;
	private static ComponentServiceObjects<ProductResource>
		_productResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private Company _company;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private UriInfo _uriInfo;
	private User _user;

}