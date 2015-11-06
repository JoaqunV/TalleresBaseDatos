package service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import facade.FilmActorFacade;
import model.Film_Actor;

@Path("/film_actor")
public class FilmActorService {
	
	@EJB 
	FilmActorFacade film_actorFacadeEJB;
	
	Logger logger = Logger.getLogger(FilmActorService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Film_Actor> findAll(){
		return film_actorFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Film_Actor find(@PathParam("id") Integer id) {
        return film_actorFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Film_Actor entity) {
		film_actorFacadeEJB.create(entity);
    }
}