import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.ext.RuntimeDelegate;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by haloz on 27.12.13.
 */
public class Runner {
    static HttpServer startServer() throws IOException {

        // simple "sunny standard" webserver
        HttpServer server = HttpServer.create(
                new InetSocketAddress(8080), // port
                0
        );

        // example from http://antoniogoncalves.org/2012/12/19/test-your-jax-rs-2-0-web-service-uris-without-mocks/
        // this wraps a httphandler around our jax-rs 2.0 application
        HttpHandler handler = RuntimeDelegate.getInstance().createEndpoint(
                new JaxRsApp(),
                HttpHandler.class
        );

        // maps the URL /jax to the new handler
        server.createContext("/jax", handler);

        // and start
        server.start();

        return server;
    }

    public static void main(String[] args) throws IOException {
        HttpServer server = startServer();

        System.out.println("Hit a key to stop the server");
        System.in.read();

        server.stop(0);
    }
}
