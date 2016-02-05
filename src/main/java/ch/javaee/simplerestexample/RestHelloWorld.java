package ch.javaee.simplerestexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author marco
 */
@Provider  // @Provider tell the server that this is a REST class
@Path("examples") // define the path for this class: [server]/rest/examples
public class RestHelloWorld {
    
    @Path("helloWorld") // path used to call the method [server]/rest/examples/examples
    @GET // answer only to a http get request
    public String hello(){  // return a simple string (text/plain by default)
        return "Hello World"; // string to be returned
    }
}
