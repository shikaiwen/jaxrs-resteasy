package com.kevin.learning.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import test.Logged;

/**
 * http://www.mkyong.com/webservices/jax-rs/resteasy-hello-world-example/
 * 
 * jetty：http://my.oschina.net/cokolin/blog/409164
 * 辛苦这位：http://iblike.iteye.com/blog/1010242
 * @author root
 *
 *
 *  不错的文章，结构清晰:https://www.google.com.hk/?gws_rd=ssl#newwindow=1&q=ws+rest++%40Prematching+%40Namebinding
 */
@Path("/message")
public class MessageRestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/log/{param}")
	@Logged
	public Response logMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}
	
	
}
