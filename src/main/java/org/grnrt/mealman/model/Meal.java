package org.grnrt.mealman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Meal {

	public enum TYPE {
		BREAKFAST, LUNCH, DINNER
	}

	public enum STAGE {
		PROPOSAL, PLAN
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private Date date;
	private TYPE type;
	private STAGE stage;

	@ManyToOne
	@JoinColumn(name = "RECEIPE_ID")
	private Receipe receipe;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public STAGE getStage() {
		return stage;
	}

	public void setStage(STAGE stage) {
		this.stage = stage;
	}

	public Receipe getReceipe() {
		return receipe;
	}

	public void setReceipe(Receipe receipe) {
		this.receipe = receipe;
	}
}

