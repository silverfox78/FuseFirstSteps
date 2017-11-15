package fuse.ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RestServicio {
	@GET
	@Path("/Metodo01/{nombre}")
	@Produces(MediaType.APPLICATION_JSON)
	public String Metodo01(@PathParam("nombre") String nopmbre){
		return null;
	}
}
