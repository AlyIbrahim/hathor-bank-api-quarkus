package com.aliction.hathorbank;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.security.identity.SecurityIdentity;

@Path("/hello")
public class GreetingResource {

    
    @Inject
    SecurityIdentity securityIdentity;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/secure")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed("client")
    // @PermitAll
    public String security() {
        System.out.println("Security Path");
        System.out.println(securityIdentity.getPrincipal().getName());
        System.out.println(securityIdentity.getRoles());
        return "Hello from Security";
    }
}