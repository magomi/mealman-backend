package org.grnrt.mealman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voting {

	public enum VOTE {
		LIKE, NEUTRAL, DISLIKE
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private VOTE vote;

	@ManyToOne
	@JoinColumn(name = "PERSON_ID")
	private Person voter;

	@ManyToOne
	@JoinColumn(name = "MEAL_ID")
	private Meal meal;

	public VOTE getVote() {
		return vote;
	}

	public void setVote(VOTE vote) {
		this.vote = vote;
	}

	public Person getVoter() {
		return voter;
	}

	public void setVoter(Person voter) {
		this.voter = voter;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}
}

