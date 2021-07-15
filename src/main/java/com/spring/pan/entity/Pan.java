package com.spring.pan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PANS")
public class Pan {

	@Id
	@Column(name="pan")
	private String pan;
	@Column(name="score")
	private float score;

	public Pan()
	{
		
	}
	
	public Pan(String pan,float score)
	{
		this.pan=pan;
		this.score=score;
		
	}
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Pan [pan=" + pan + ", score=" + score + "]";
	}
}
