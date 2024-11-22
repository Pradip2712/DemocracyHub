package com.pdp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoatingCard {

	@Id
	private String voaterid;
	private String constituency;

	public VoatingCard() {
		super();
	}

	public VoatingCard(String voaterid, String constituency) {
		super();
		this.voaterid = voaterid;
		this.constituency = constituency;
	}

	public String getVoaterid() {
		return voaterid;
	}

	public void setVoaterid(String voaterid) {
		this.voaterid = voaterid;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	@Override
	public String toString() {
		return " voaterid=" + voaterid + ", constituency=" + constituency;
	}

}
