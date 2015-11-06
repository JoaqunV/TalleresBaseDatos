package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="film")
@NamedQuery(name="Film.findAll", query="SELECT a FROM Film a")
public class Film implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="film_id", unique=true, nullable=false)
	private int filmId;

	@Column(name="title", nullable=false, length=45)
	private String title;

	@Column(name="description", nullable=true, length=255)
	private String description;

	@Column(name="release_year", nullable=true, length=45)
	private String releaseYear;
	
	@Column(name="language_id", nullable=false)
	private int languageId;
	
	@Column(name="original_language_id", nullable=true)
	private int originalLanguageId;
	
	@Column(name="rental_duration", nullable=false)
	private int rentalDuration;
	
	@Column(name="rental_rate", nullable=false)
	private double rentalRate;
	
	@Column(name="length", nullable=true)
	private int length;
	
	@Column(name="replacement_cost", nullable=false)
	private double replacementCost;
	
	@Column(name="rating", nullable=true, length=20)
	private String rating;
	
	@Column(name="special_features", nullable=true, length=255)
	private String specialFeatures;
	
	@Column(name="last_update", nullable=false)
	private Timestamp lastUpdate;

	public Film() {
	}

	public int getFilmId() {
		return this.filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleaseYear() {
		return this.releaseYear;
	}
	
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	
	public int getOriginalLanguageId() {
		return this.originalLanguageId;
	}

	public void setOriginalLanguageId(int originalLanguageId) {
		this.originalLanguageId= originalLanguageId;
	}
	
	public int getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration= rentalDuration;
	}
	
	public double getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate= rentalRate;
	}
	
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length= length;
	}
	
	public double getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost= replacementCost;
	}
	
	public String getRating() {
		return this.rating;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getSpecialFeatures() {
		return this.specialFeatures;
	}
	
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
	
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	@OneToMany(mappedBy="film")
	//Lista en la cual se guardará la relación del film con el actor
	private List<Film_Actor> actors;

	List<Film_Actor> getActors() {
		return actors;
	}

	void setActors(List<Film_Actor> actors) {
		this.actors = actors;
	}
	
	public List<Actor> obtenerActores(){
		List<Actor> lista = new ArrayList<Actor>();
		for(Film_Actor Actor : this.actors){
			lista.add(Actor.getActor());
		}
		return lista;
	}

}