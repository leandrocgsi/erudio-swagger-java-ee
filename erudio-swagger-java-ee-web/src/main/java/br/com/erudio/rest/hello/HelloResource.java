package br.com.erudio.rest.hello;

import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Stateless
@Path("/hello")
@Api(value = "/hello", description = "Say Hello!")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Let's Groovy guys!", notes = "Let's Groovy guys!")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 500, message = "Houston we have a problem")})
    public Response sayHello() {
        JsonObject value = Json.createObjectBuilder()
                .add("firstName", "Leandro")
                .add("lastName", "Costa")
                .add("message", "Let's Groovy guys!")
                .build();
        return Response.status(200).entity(value).build();
    }
}
