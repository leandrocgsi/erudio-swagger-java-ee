package br.com.erudio.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        /**
         * Removing it removes the warning and Swagger still works as expected.
         *
         * resources.add(com.wordnik.swagger.jaxrs.JaxrsApiReader.class);
         *
         * WARNING: A provider com.wordnik.swagger.jaxrs.JaxrsApiReader
         * registered in SERVER runtime does not implement any provider
         * interfaces applicable in the SERVER runtime. Due to constraint
         * configuration problems the provider
         * com.wordnik.swagger.jaxrs.JaxrsApiReader will be ignored.
         */
        resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider.class);
        resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON.class);
        resources.add(com.wordnik.swagger.jaxrs.listing.ResourceListingProvider.class);
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.erudio.rest.hello.HelloResource.class);
    }

}
