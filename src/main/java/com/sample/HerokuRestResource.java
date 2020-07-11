package com.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api")
public class HerokuRestResource {

    @GET
    @Path("/hello")
    public String getHelloWorld() {
        return "Hello World!";
    }
}
