package ser.i.sssk;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/first")
@Produces("application/json;charset=UTF-8")
@Controller
public class ResourceRest {

    @Path("/for-all")
    @GET
    public Response getForAll() {
        return Response.ok("for-all").build();
    }

    @Path("/for-user")
    @GET
    public Response getForUser() {
        return Response.ok("for-user").build();
    }

    @Path("/for-admin")
    @GET
    public Response getForAdmin() {
        return Response.ok("for-admin").build();
    }

}
