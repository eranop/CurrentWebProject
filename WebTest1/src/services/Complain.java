package services;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import allcode.Member;



public class Complain {
	
	
    private long id;
	

	private Member member;
	
	
	private Member moderator;
	

	private String complain;

	public Complain(Member member, Member moderator, String complain) 
	{
		this.member = member;
		this.setModerator(moderator);
		this.setComplain(complain);
	}

	public Member getMember() {
		return member;
	}

	public Member getModerator() {
		return moderator;
	}

	public void setModerator(Member moderator) {
		this.moderator = moderator;
	}

	public String getComplain() {
		return complain;
	}

	public void setComplain(String complain) {
		this.complain = complain;
	}

	public void presentComplain() {
		System.out.println("Complaining Member: " + getMember());
		System.out.println("Complained Moderator: " + getModerator());
		System.out.println("");
		System.out.println("Complain: " + getComplain());
	}
}
