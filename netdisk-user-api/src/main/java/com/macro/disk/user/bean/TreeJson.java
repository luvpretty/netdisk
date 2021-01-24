package com.macro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class TreeJson implements Serializable{
	private String id;
	private String label;
	private String type;//org,position,user
	private boolean disabled=false;//true表示checkbox可以禁用，false表示启用
	private List<TreeJson> children=new ArrayList<TreeJson>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public List<TreeJson> getChildren() {
		return children;
	}

	public void setChildren(List<TreeJson> children) {
		this.children = children;
	}
}
