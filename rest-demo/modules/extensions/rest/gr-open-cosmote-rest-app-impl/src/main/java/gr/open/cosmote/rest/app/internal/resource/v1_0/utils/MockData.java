package gr.open.cosmote.rest.app.internal.resource.v1_0.utils;

import gr.open.cosmote.rest.app.dto.v1_0.*;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;

@Component(service = MockData.class)
public class MockData {

    public Product getProduct(String idRef) {
        switch(idRef) {
            case "double_play_24_l":
                return getProductDouble_play_24_l();
            case "double_play_24_xl":
                return getProductDouble_play_24_xl();
            case "double_play_22_l":
                return getProductDouble_play_22_l();
            case "double_play_22_xl":
                return getProductDouble_play_22_xl();
        }
        return new Product();
    }

    private Product getProductDouble_play_22_xl() {
        Product result = new Product();

        result.setBusinessDescription("");
        result.setBusinessSummary("");
        result.setCategory("201375");
        result.setDescription("");
        result.setIdRef("double_play_22_xl");
        result.setImagePath("http://devmazi.cosmote.gr/storefront/renderImage.image?imageName=triplePlayImage_2mines_onlineoffer.png");
        result.setPrice(this::getProductPriceDouble_play_22_xl);
        result.setProductType(this::getProductTypeDouble_play_22_xl);
        result.setSummary("");
        result.setTitle("COSMOTE Double Play 24 XL");

        return result;
    }

    private ProductType getProductTypeDouble_play_22_xl() {
        ProductType result = new ProductType();

        result.setIdRef("200152");
        result.setTitle("Product Bundle");

        return result;
    }

    private Product getProductDouble_play_22_l() {
        Product result = new Product();

        result.setBusinessDescription("");
        result.setBusinessSummary("");
        result.setCategory("201375");
        result.setDescription("");
        result.setIdRef("double_play_22_xl");
        result.setImagePath("http://devmazi.cosmote.gr/storefront/renderImage.image?imageName=triplePlayImage_2mines_onlineoffer.png");
        result.setPrice(this::getProductPriceDouble_play_22_xl);
        result.setProductType(this::getProductTypeDouble_play_22_xl);
        result.setSummary("");
        result.setTitle("COSMOTE Double Play 24 XL");

        return result;
    }

    private Product getProductDouble_play_24_xl() {
        Product result = new Product();

        result.setBusinessDescription("");
        result.setBusinessSummary("");
        result.setCategory("201375");
        result.setDescription("");
        result.setIdRef("double_play_22_xl");
        result.setImagePath("http://devmazi.cosmote.gr/storefront/renderImage.image?imageName=triplePlayImage_2mines_onlineoffer.png");
        result.setPrice(this::getProductPriceDouble_play_22_xl);
        result.setProductType(this::getProductTypeDouble_play_22_xl);
        result.setSummary("");
        result.setTitle("COSMOTE Double Play 24 XL");

        return result;
    }

    private Product getProductDouble_play_24_l() {
        Product result = new Product();

        result.setBusinessDescription("");
        result.setBusinessSummary("");
        result.setCategory("201375");
        result.setDescription("");
        result.setIdRef("double_play_22_xl");
        result.setImagePath("http://devmazi.cosmote.gr/storefront/renderImage.image?imageName=triplePlayImage_2mines_onlineoffer.png");
        result.setPrice(this::getProductPriceDouble_play_22_xl);
        result.setProductType(this::getProductTypeDouble_play_22_xl);
        result.setSummary("");
        result.setTitle("COSMOTE Double Play 24 XL");

        return result;
    }

    private ProductPrice getProductPriceDouble_play_22_xl() {
        ProductPrice result = new ProductPrice();

        ProductPriceType productPriceType1 = new ProductPriceType();
        productPriceType1.setAfterText("το μήνα");
        productPriceType1.setAmount("26.21");
        productPriceType1.setCurrency("EUR");
        productPriceType1.setPreText("με");

        ProductPriceType productPriceType2 = new ProductPriceType();
        productPriceType2.setAfterText("");
        productPriceType2.setAmount("0");
        productPriceType2.setCurrency("EUR");
        productPriceType2.setPreText("");

        result.setMonthlyPrice(productPriceType1);
        result.setOnceOffPrice(productPriceType2);

        return result;
    }

    private ProductPrice getDouble_play_22_l() {
        ProductPrice result = new ProductPrice();

        ProductPriceType productPriceType1 = new ProductPriceType();
        productPriceType1.setAfterText("το μήνα");
        productPriceType1.setAmount("26.21");
        productPriceType1.setCurrency("EUR");
        productPriceType1.setPreText("με");

        ProductPriceType productPriceType2 = new ProductPriceType();
        productPriceType2.setAfterText("");
        productPriceType2.setAmount("0");
        productPriceType2.setCurrency("EUR");
        productPriceType2.setPreText("");

        result.setMonthlyPrice(productPriceType1);
        result.setOnceOffPrice(productPriceType2);

        return result;
    }

    private ProductPrice getDouble_play_24_xl() {
        ProductPrice result = new ProductPrice();

        ProductPriceType productPriceType1 = new ProductPriceType();
        productPriceType1.setAfterText("το μήνα");
        productPriceType1.setAmount("26.21");
        productPriceType1.setCurrency("EUR");
        productPriceType1.setPreText("με");

        ProductPriceType productPriceType2 = new ProductPriceType();
        productPriceType2.setAfterText("");
        productPriceType2.setAmount("0");
        productPriceType2.setCurrency("EUR");
        productPriceType2.setPreText("");

        result.setMonthlyPrice(productPriceType1);
        result.setOnceOffPrice(productPriceType2);

        return result;
    }

    private ProductPrice getDouble_play_24_l() {
        ProductPrice result = new ProductPrice();

        ProductPriceType productPriceType1 = new ProductPriceType();
        productPriceType1.setAfterText("το μήνα");
        productPriceType1.setAmount("26.21");
        productPriceType1.setCurrency("EUR");
        productPriceType1.setPreText("με");

        ProductPriceType productPriceType2 = new ProductPriceType();
        productPriceType2.setAfterText("");
        productPriceType2.setAmount("0");
        productPriceType2.setCurrency("EUR");
        productPriceType2.setPreText("");

        result.setMonthlyPrice(productPriceType1);
        result.setOnceOffPrice(productPriceType2);

        return result;
    }

    private Campaign getCampaign1() {
        Campaign result = new Campaign();

        result.setAddress("INSTALLATION_ADDRESS|ΑΤΤΙΚΗΣ|ΚΑΛΛΙΘΕΑ|Δαβακη|55||17672");
        result.setCampaignContactId("225754604488991");
        result.setComparisonFlag(true);
        result.setContactId("1-SG5-3104");
        result.setEshopIdExisting("double_play_24_l");
        result.setEshopIdTarget("double_play_24_xl");
        result.setGenevaBillingAccount("1584336");
        result.setOnceOffExisting("0.00");
        result.setOnceOfTarget("0.00");
        result.setRecurringExisting("26.21");
        result.setRecurringTarget("29.90");
        result.setSerialNum("2104681427");
        result.setSiebelProductIdTarget("1-2FXQ91-C58");
        result.setSiebelProductNameExisting("COSMOTE Double Play 24 L");
        result.setSiebelProductNameTarget("COSMOTE Double Play 24 XL");
        result.setSpecificPortalDescription("Personalized offers for you");

        return result;
    }
    private Campaign getCampaign2() {
        Campaign result = new Campaign();

        result.setAddress("INSTALLATION_ADDRESS|ΑΤΤΙΚΗΣ|ΚΑΛΛΙΘΕΑ|Δαβακη|53||17672");
        result.setCampaignContactId("225754602121191");
        result.setComparisonFlag(true);
        result.setContactId("2-SG5-3104");
        result.setEshopIdExisting("double_play_22_l");
        result.setEshopIdTarget("double_play_22_xl");
        result.setGenevaBillingAccount("3224336");
        result.setOnceOffExisting("0.00");
        result.setOnceOfTarget("0.00");
        result.setRecurringExisting("24.21");
        result.setRecurringTarget("22.90");
        result.setSerialNum("2114681427");
        result.setSiebelProductIdTarget("2-2FXQ91-C58");
        result.setSiebelProductNameExisting("COSMOTE Double Play 24 L");
        result.setSiebelProductNameTarget("COSMOTE Double Play 24 XL");
        result.setSpecificPortalDescription("Personalized offers for you");

        return result;
    }
    public List<Campaign> getCampaigns() {
        List<Campaign> results = new ArrayList<>();

        results.add(getCampaign1());
        results.add(getCampaign2());
        results.add(getCampaign3());

        return results;
    }

    private Campaign getCampaign3() {
        Campaign result = new Campaign();

        result.setAddress("INSTALLATION_ADDRESS|ΑΤΤΙΚΗΣ|ΚΑΛΛΙΘΕΑ|Δαβακη|50||17672");
        result.setCampaignContactId("2232111204488991");
        result.setComparisonFlag(true);
        result.setContactId("3-SG5-3104");
        result.setEshopIdExisting("double_play_24_l");
        result.setEshopIdTarget("double_play_24_xl");
        result.setGenevaBillingAccount("1582136");
        result.setOnceOffExisting("0.00");
        result.setOnceOfTarget("0.00");
        result.setRecurringExisting("29.21");
        result.setRecurringTarget("24.90");
        result.setSerialNum("2124681427");
        result.setSiebelProductIdTarget("3-2FXQ91-C58");
        result.setSiebelProductNameExisting("COSMOTE Double Play 24 L");
        result.setSiebelProductNameTarget("COSMOTE Double Play 24 XL");
        result.setSpecificPortalDescription("Personalized offers for you");

        return result;
    }


}
