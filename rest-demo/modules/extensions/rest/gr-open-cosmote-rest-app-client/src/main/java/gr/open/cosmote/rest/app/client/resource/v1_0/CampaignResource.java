package gr.open.cosmote.rest.app.client.resource.v1_0;

import gr.open.cosmote.rest.app.client.dto.v1_0.Campaign;
import gr.open.cosmote.rest.app.client.http.HttpInvoker;
import gr.open.cosmote.rest.app.client.pagination.Page;
import gr.open.cosmote.rest.app.client.pagination.Pagination;
import gr.open.cosmote.rest.app.client.serdes.v1_0.CampaignSerDes;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.Generated;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Generated("")
public interface CampaignResource {

	public static Builder builder() {
		return new Builder();
	}

	public Page<Campaign> getCampaignSmspromoCampaignContactContactPage(
			String campaignContactId, String contactId, String search,
			String filterString, Pagination pagination, String sortString)
		throws Exception;

	public HttpInvoker.HttpResponse
			getCampaignSmspromoCampaignContactContactPageHttpResponse(
				String campaignContactId, String contactId, String search,
				String filterString, Pagination pagination, String sortString)
		throws Exception;

	public static class Builder {

		public Builder authentication(String login, String password) {
			_login = login;
			_password = password;

			return this;
		}

		public CampaignResource build() {
			return new CampaignResourceImpl(this);
		}

		public Builder endpoint(String host, int port, String scheme) {
			_host = host;
			_port = port;
			_scheme = scheme;

			return this;
		}

		public Builder header(String key, String value) {
			_headers.put(key, value);

			return this;
		}

		public Builder locale(Locale locale) {
			_locale = locale;

			return this;
		}

		public Builder parameter(String key, String value) {
			_parameters.put(key, value);

			return this;
		}

		private Builder() {
		}

		private Map<String, String> _headers = new LinkedHashMap<>();
		private String _host = "localhost";
		private Locale _locale;
		private String _login = "test@liferay.com";
		private String _password = "test";
		private Map<String, String> _parameters = new LinkedHashMap<>();
		private int _port = 8080;
		private String _scheme = "http";

	}

	public static class CampaignResourceImpl implements CampaignResource {

		public Page<Campaign> getCampaignSmspromoCampaignContactContactPage(
				String campaignContactId, String contactId, String search,
				String filterString, Pagination pagination, String sortString)
			throws Exception {

			HttpInvoker.HttpResponse httpResponse =
				getCampaignSmspromoCampaignContactContactPageHttpResponse(
					campaignContactId, contactId, search, filterString,
					pagination, sortString);

			String content = httpResponse.getContent();

			_logger.fine("HTTP response content: " + content);

			_logger.fine("HTTP response message: " + httpResponse.getMessage());
			_logger.fine(
				"HTTP response status code: " + httpResponse.getStatusCode());

			return Page.of(content, CampaignSerDes::toDTO);
		}

		public HttpInvoker.HttpResponse
				getCampaignSmspromoCampaignContactContactPageHttpResponse(
					String campaignContactId, String contactId, String search,
					String filterString, Pagination pagination,
					String sortString)
			throws Exception {

			HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

			if (_builder._locale != null) {
				httpInvoker.header(
					"Accept-Language", _builder._locale.toLanguageTag());
			}

			for (Map.Entry<String, String> entry :
					_builder._headers.entrySet()) {

				httpInvoker.header(entry.getKey(), entry.getValue());
			}

			for (Map.Entry<String, String> entry :
					_builder._parameters.entrySet()) {

				httpInvoker.parameter(entry.getKey(), entry.getValue());
			}

			httpInvoker.httpMethod(HttpInvoker.HttpMethod.GET);

			if (search != null) {
				httpInvoker.parameter("search", String.valueOf(search));
			}

			if (filterString != null) {
				httpInvoker.parameter("filter", filterString);
			}

			if (pagination != null) {
				httpInvoker.parameter(
					"page", String.valueOf(pagination.getPage()));
				httpInvoker.parameter(
					"pageSize", String.valueOf(pagination.getPageSize()));
			}

			if (sortString != null) {
				httpInvoker.parameter("sort", sortString);
			}

			httpInvoker.path(
				_builder._scheme + "://" + _builder._host + ":" +
					_builder._port +
						"/o/cosmote-rest-app/v1.0/campaigns/smspromo/{campaignContactId}/{contactId}",
				campaignContactId, contactId);

			httpInvoker.userNameAndPassword(
				_builder._login + ":" + _builder._password);

			return httpInvoker.invoke();
		}

		private CampaignResourceImpl(Builder builder) {
			_builder = builder;
		}

		private static final Logger _logger = Logger.getLogger(
			CampaignResource.class.getName());

		private Builder _builder;

	}

}