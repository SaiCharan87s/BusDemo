package com.lti.Dao;

import java.util.List;

import com.lti.model.UserDetails;

public interface UserDao {

	UserDetails addOrUpdateUser(UserDetails user);
	UserDetails findUserById(int userId);
	List<UserDetails> viewUserDetails();
	boolean loginUser(String email, String password);
}
