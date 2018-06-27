package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Path("/livros")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class Livro {

    @GET
    @Path("/livros")
    public Collection<domain.Livro> getLivros() {

        List<domain.Livro> livros = new ArrayList<>();
        livros.add(new domain.Livro("API RESTFul Wildfly", "Anderson Costa"));

        return livros;
    }
}
