package org.coviam.interviews.controller;

import java.util.List;

public class Data {
	private String type;
	private String text;
	private List<Text> text1;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String gettext() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Text> getText1() 
	{
		return text1;
	}
	public void setText(List<Text> text1) {
		this.text1 = text1;
	}
}
