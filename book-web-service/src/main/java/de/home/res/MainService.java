package de.home.res;

import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class MainService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getResources() {
        String BASE_URI = "localhost:8080/rest/";
        JsonObjectBuilder j = Json.createObjectBuilder();

        j.add("books", BASE_URI+"books");
        j.add("orders", BASE_URI+"orders");

        return j.build();
    }
}
