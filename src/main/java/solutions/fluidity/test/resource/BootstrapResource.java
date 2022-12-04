package solutions.fluidity.test.resource;

import org.springframework.stereotype.Component;
import solutions.fluidity.test.exception.CustomRunTimeException;
import solutions.fluidity.test.service.BootstrapService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Path("bootstrap")
public class BootstrapResource {

    private BootstrapService bootstrapService;
    final Logger log = Logger.getLogger(FixturesResource.class.getName());
    public BootstrapResource(BootstrapService bootstrapService) {
        this.bootstrapService = bootstrapService;
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBootstrapStatic() throws IOException {
        try {
            String result = bootstrapService.getBootstrapData();
            return Response.ok(result).build();
        }catch (IOException ioe){
            log.log(Level.SEVERE,ioe.getMessage(),ioe.getCause());
        }catch (CustomRunTimeException crte){
            log.log(Level.SEVERE,crte.getMessage(),crte.getCause());
        }
        return Response.serverError().build();
    }
}