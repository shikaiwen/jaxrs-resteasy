package test;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Provider;


/**
 * http://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey
 * @author root
 *
 */
@Provider
@PreMatching
public class MyContainerFilter implements ContainerRequestFilter{

	public void filter(ContainerRequestContext req) throws IOException {
		
		System.out.println("prematching");
		
		
	}

}
