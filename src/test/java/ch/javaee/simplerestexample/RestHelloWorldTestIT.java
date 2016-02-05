package ch.javaee.simplerestexample;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author marco
 */
public class RestHelloWorldTestIT {
    
    String helloWorldURL = "http://localhost:8080/SimpleRestExample/rest/examples/helloWorld";
    String expectedResult = "Hello World";
    
    
    @Test
    public void testIntegrationHello(){
        // the client connect to the REST service
        Client client = ClientBuilder.newClient();
        
        String helloWorldString = client.target(helloWorldURL) // connection to the pre-defined URL
                .request("text/plain")  // we request a "text/plain" answer
                .get(String.class); // we call the 'get' method and we transform the answer in a String
       // assertEquals(200, response.getStatus());
        assertEquals(expectedResult, helloWorldString);
        
    }
    
}
