import javax.ws.rs.core.Application;
import java.util.*;

/**
 * Created by haloz on 27.12.13.
 */
public class JaxRsApp extends Application {

    private final Set<Class<?>> classes;

    // deriving from javax.ws.rs.core.Application we need to override the classes and add our
    // new TestResource to the class list of resources.
    public JaxRsApp() {
        classes = new HashSet<Class<?>>();
        classes.add(TestResource.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
