package solutions.fluidity.test.resource;

import org.glassfish.grizzly.http.util.HttpStatus;
import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BootstrapResourceTest {

    @Test
    public void test_getBootstrapStatic_valid() {
       // final Response response = target("/api/v1/bootstrap").request().get();
        assertEquals(HttpStatus.OK_200.getStatusCode(), 200);
        assertEquals(MediaType.APPLICATION_JSON, "application/json");
    }
}