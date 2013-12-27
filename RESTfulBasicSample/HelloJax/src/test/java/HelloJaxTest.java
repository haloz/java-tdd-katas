import com.sun.net.httpserver.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by haloz on 27.12.13.
 */
public class HelloJaxTest {

    HttpServer server;
    Client client;

    @Before
    public void setUp() throws IOException {
        server = Runner.startServer();
        client = ClientBuilder.newClient();
    }

    @After
    public void tearDown() {
        server.stop(0);
        server = null;
        client = null;
    }

    @Test
    public void testWebserverOutputsHelloWorldAsText() throws IOException {
        WebTarget target = client.target("http://localhost:8080/jax/helloworld");
        String responseMsg = target.request(MediaType.TEXT_PLAIN).get(String.class);

        assertEquals("Hello World", responseMsg);
    }
}
