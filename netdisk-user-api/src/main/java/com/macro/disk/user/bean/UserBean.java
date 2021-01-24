package com.macro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserBean implements Serializable{
	private String id;
	private String nickname;
	private String username;
	private String telephone;
}
