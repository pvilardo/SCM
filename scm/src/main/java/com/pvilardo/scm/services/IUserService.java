package com.pvilardo.scm.services;

import java.util.List;

import org.springframework.security.core.userdetails.User;

import com.pvilardo.scm.model.Role;

public interface IUserService {

	public abstract long countAllUsers();
	public abstract void deleteUser(User user);
	public abstract User findUser(String id);
	public abstract List<User> findAllUsers();
	public abstract List<User> findUserEntries(int firstResult
	, int maxResults);
	public abstract User findByUsername(String username);
	public abstract void saveUser(User user);
	public abstract User updateUser(User user);

	public abstract List<Role> getUserRoles(String id);	
	}
