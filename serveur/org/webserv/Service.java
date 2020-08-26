package org.webserv;


@Path("/banque")
public class Service {

	@GET
	@Path("/simple")
	public String Simple() {
		return  "Hello";
	}
}
