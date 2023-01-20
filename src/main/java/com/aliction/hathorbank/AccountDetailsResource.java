package com.aliction.hathorbank;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

// @Authenticated
@ResourceProperties(hal = true, path = "account-details", rolesAllowed = "client")
public interface AccountDetailsResource extends PanacheEntityResource<AccountDetails, Long> {
    @GET
    @Path("/account/{accountId}")
    default List<AccountDetails> findByAccountId(@PathParam("accountId") UUID accountId) {
        return AccountDetails.find("accountId = :accountId", Collections.singletonMap("accountId", accountId)).list();
    }
}