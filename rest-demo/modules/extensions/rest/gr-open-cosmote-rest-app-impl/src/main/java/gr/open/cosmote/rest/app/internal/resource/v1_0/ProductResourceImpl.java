package gr.open.cosmote.rest.app.internal.resource.v1_0;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.vulcan.pagination.Page;
import gr.open.cosmote.rest.app.dto.v1_0.Product;
import gr.open.cosmote.rest.app.internal.resource.v1_0.utils.MockData;
import gr.open.cosmote.rest.app.resource.v1_0.ProductResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.validation.constraints.NotNull;

import static com.liferay.portal.kernel.log.LogFactoryUtil.getLog;

/**
 * @author Technopolis S.A.
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/product.properties",
	scope = ServiceScope.PROTOTYPE, service = ProductResource.class
)
public class ProductResourceImpl extends BaseProductResourceImpl {

	private static final Log _log = getLog(ProductResourceImpl.class);


	@Override
	public Product getCampaignProduct(@NotNull String idRef) throws Exception {
		_log.info("CALLING getCampaignProduct...");
		_log.info("  idRef:" + idRef);

		return mockData.getProduct(idRef);
	}

	@Reference
	private MockData mockData;
}