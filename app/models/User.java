package models;

import java.util.HashSet;
import java.util.Set;

public class User {
	private String user;
	public Long userid;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	private static Set<User> users;
    static {
        users = new HashSet<User>();
        users.add(new User(1L, "da04153686b0d86ccefec67ab05936ff2798d2db")); //+33625236481, Maxime
        users.add(new User(2L, "41cbf68b5f758010bb34422cf84d8ea7b5787abc")); //+33602112078, Adrien
    }
    public User() {}
	public User(Long userid, String hashOfPhoneNum) {
		this.userid = userid;
		this.user = hashOfPhoneNum;
	}
}
