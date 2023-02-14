package com.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class CriteriaAR {
	private int pageNum;
	private int amount;
	
	private String type;
	private String keyword;
	
	public CriteriaAR() {
		this(1, 6);
	}
	
	public CriteriaAR(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		return type == null? new String[] {}: type.split("");
	}
}
