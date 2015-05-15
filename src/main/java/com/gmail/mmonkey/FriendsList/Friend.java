package com.gmail.mmonkey.FriendsList;

import java.util.UUID;

public class Friend {

	private UUID id;
	private String name;
	private boolean accepted;
	private boolean loginNotification;
	
	public UUID getId() {
		return this.id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean accepted() {
		return this.accepted;
	}
	
	public void accepted(boolean accepted) {
		this.accepted = accepted;
	}
	
	public boolean loginNotification() {
		return this.loginNotification;
	}
	
	public void loginNotification(boolean loginNotification) {
		this.loginNotification = loginNotification;
	}
	
	public Friend() {
	}
	
	
}
