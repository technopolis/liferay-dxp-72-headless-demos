package gr.open.cosmote.rest.app.internal.resource.v1_0;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import gr.open.cosmote.rest.app.dto.v1_0.Campaign;
import gr.open.cosmote.rest.app.internal.resource.v1_0.utils.MockData;
import gr.open.cosmote.rest.app.resource.v1_0.CampaignResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.validation.constraints.NotNull;

import java.util.Collections;
import java.util.List;

import static com.liferay.portal.kernel.log.LogFactoryUtil.getLog;

/**
 * @author Technopolis S.A.
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/campaign.properties",
	scope = ServiceScope.PROTOTYPE, service = CampaignResource.class
)
public class CampaignResourceImpl extends BaseCampaignResourceImpl {

	private static final Log _log = getLog(CampaignResourceImpl.class);

	@Override
	public Page<Campaign> getCampaignSmspromoCampaignContactContactPage(@NotNull String campaignContactId, @NotNull String contactId, String search, Filter filter, Pagination pagination, Sort[] sorts) throws Exception {
		_log.info("CALLING getCampaignSmspromoCampaignContact...");
		_log.info("  campaignContactId:" + campaignContactId);
		_log.info("  contactId:" + contactId);
		_log.info("  search:" + search);
		_log.info("  filter:" + filter);
		_log.info("  pagination:" + pagination);
		_log.info("  sorts:" + sorts);

		return Page.of(mockData.getCampaigns());
	}



	@Reference
	private MockData mockData;
}