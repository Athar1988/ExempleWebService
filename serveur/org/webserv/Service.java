package org.webserv;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/banque")
public class Service {

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "hello test";
	}
	
	@GET
	@Path("/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)
	public double conversion(@PathParam("montant") double mt){
		return 10*mt;
	}
	
	@GET
	@Path("/infos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getInfos(){
		List<String> liste = new ArrayList<>();
		liste.add("A");
		liste.add("B");
		return liste;
	}
	
}
