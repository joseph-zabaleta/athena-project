package com.athena;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bonjour")
public class HelloResource {

    @GET
    @Path("text")
    @Produces(MediaType.TEXT_PLAIN)
    public String direBonjour() {
        return "Bonjour, tout le monde!";
    }

    @GET
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayJsonHello() {
        return "{\"name\":\"greeting\", \"message\":\"Bonjour tout le monde!\"}";
    }
}