package com.gmail.mmonkey.FriendsList;

import java.util.Collection;

public class Profile {
	
	private String name;
	private Collection<Friend> friends;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Collection<Friend> getFriends() {
		return this.friends;
	}
	
	public boolean addFriend(Friend friend) {
		return this.friends.add(friend);
	}
	
	public boolean addFriends(Collection<Friend> friends) {
		return this.friends.addAll(friends);
	}
	
	public Profile() {
	}

}
