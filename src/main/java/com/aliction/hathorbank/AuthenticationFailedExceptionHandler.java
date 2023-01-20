package com.aliction.hathorbank;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.quarkus.security.AuthenticationFailedException;
import io.vertx.core.Handler;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

// https://quarkus.io/guides/security-built-in-authentication-support-concept

@ApplicationScoped
public class AuthenticationFailedExceptionHandler {

    
    public void init(@Observes Router router) {
        router.route().failureHandler(new Handler<RoutingContext>() {
            @Override
            public void handle(RoutingContext event) {
                System.out.println(System.currentTimeMillis());
                // event.response().end("CUSTOMIZED_RESPONSE");
                if (event.failure() instanceof AuthenticationFailedException) {
                    event.response().end("Invalid Token - Expired?");
                    // event.response().end(event.failure().getMessage());
                } else {
                    event.next();
                }
            }
        });
    }
}