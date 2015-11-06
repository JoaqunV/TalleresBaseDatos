package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.FilmActorFacade;
import model.Film_Actor;

@Stateless
public class FilmActorFacadeEJB  extends AbstractFacade<Film_Actor> implements FilmActorFacade{

	@PersistenceContext(unitName = "sakilaPU")
	private EntityManager em; 
	
	public FilmActorFacadeEJB() {
		super(Film_Actor.class); 
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}
}