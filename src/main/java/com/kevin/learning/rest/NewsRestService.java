package com.kevin.learning.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("news")
public class NewsRestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "news  : " + msg;

		return Response.status(200).entity(result).build();

	}
}
