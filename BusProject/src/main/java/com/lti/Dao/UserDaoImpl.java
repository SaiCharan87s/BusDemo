package com.lti.Dao;

import java.util.List;

import com.lti.model.Booking;
import com.lti.model.UserDetails;

public class UserDaoImpl implements UserDao {

	@Override
	public UserDetails addOrUpdateUser(UserDetails user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails findUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetails> viewUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Booking> viewBookingDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changepassword(int userId, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}


}
