package test;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Provider;

@Provider
public class MyContainerFilter implements ContainerRequestFilter{

	public void filter(ContainerRequestContext req) throws IOException {
		
		System.out.println(req);
		
		
	}

}
