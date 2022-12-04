package solutions.fluidity.test.resource;

import org.springframework.stereotype.Component;
import solutions.fluidity.test.exception.CustomRunTimeException;
import solutions.fluidity.test.service.FixturesService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Component
@Path("fixtures")
public class FixturesResource {

    private FixturesService fixturesService;

    public FixturesResource(FixturesService fixturesService) {
        this.fixturesService = fixturesService;
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFixtures() throws IOException {
        try {
            String result = fixturesService.getFixtures();
            return Response.ok(result).build();
        }catch (IOException ioe){
            return Response.serverError().entity(ioe.getMessage()).build();
        }catch (CustomRunTimeException crte){
            return Response.serverError().entity(crte.getMessage()).build();
        }
    }

}