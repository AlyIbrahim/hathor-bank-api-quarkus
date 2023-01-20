package com.aliction.hathorbank;


import java.util.UUID;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(hal = true, path = "/accounts", rolesAllowed = "client")
public interface AccountsResource extends PanacheEntityResource<Account, Long>{

 
}
