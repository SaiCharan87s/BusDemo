package com.lti.model;

public class GuestUser {
	
	int guestId;
	String gname;
	String gemail;
	String gmobile;
	
	public GuestUser() {
		
	}

	public GuestUser(int guestId, String gname, String gemail, String gmobile) {
		super();
		this.guestId = guestId;
		this.gname = gname;
		this.gemail = gemail;
		this.gmobile = gmobile;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGemail() {
		return gemail;
	}

	public void setGemail(String gemail) {
		this.gemail = gemail;
	}

	public String getGmobile() {
		return gmobile;
	}

	public void setGmobile(String gmobile) {
		this.gmobile = gmobile;
	}

}
