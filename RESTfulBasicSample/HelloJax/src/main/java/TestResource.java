import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by haloz on 27.12.13.
 */

@Path("helloworld")
public class TestResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Hello World";
    }
}
