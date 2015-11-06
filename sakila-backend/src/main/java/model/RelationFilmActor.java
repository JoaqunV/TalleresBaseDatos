package model;

import java.io.Serializable;

public class RelationFilmActor implements Serializable{
	
	private static final long serialVersionUID = 343L;
	
	private int actorId;
	private int filmId;
	
	public RelationFilmActor(int filmId, int actorId){
		this.actorId = actorId;
		this.filmId = filmId;
	}

	public int getActorId() {
		return actorId;
	}

	public int getFilmId() {
		return filmId;
	}
	
	@Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Film_Actor) {
        	RelationFilmActor filmActorId = (RelationFilmActor) object;
            return filmActorId.actorId == this.actorId && filmActorId.filmId == this.filmId;
        }
        return false;
    }	
}
