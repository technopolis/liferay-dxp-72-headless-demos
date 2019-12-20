package gr.open.cosmote.rest.app.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author Technopolis S.A.
 * @generated
 */
@Component(
	property = {
		"osgi.jaxrs.application.base=/cosmote-rest-app",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=Liferay.Cosmote.Rest"
	},
	service = Application.class
)
@Generated("")
public class CosmoteRestApp extends Application {
}