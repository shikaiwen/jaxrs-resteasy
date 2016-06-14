package com.kevin.learning.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * http://www.mkyong.com/webservices/jax-rs/resteasy-hello-world-example/
 * 
 * jetty：http://my.oschina.net/cokolin/blog/409164
 * 辛苦这位：http://iblike.iteye.com/blog/1010242
 * @author root
 *
 */

@Path("/message")
public class MessageRestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}
}
