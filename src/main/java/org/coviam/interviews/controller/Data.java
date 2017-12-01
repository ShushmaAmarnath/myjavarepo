package org.coviam.interviews.controller;

import java.util.List;

public class Data {
	private String type;
	private String text;
	private List<Text> options;
	
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
	public List<Text> getOptions() 
	{
		return options;
	}
	public void setText(List<Text> options) {
		this.options = options;
	}
}
