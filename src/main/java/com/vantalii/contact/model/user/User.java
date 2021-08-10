package com.vantalii.contact.model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.vantalii.contract.enums.UserType;

public class User implements Serializable {

	private static final long serialVersionUID = -4454221637535237933L;

	private int id;

	private String username;
	private String password;

	private String firstName;
	private String lastName;
	private String email;
	private UserType userType;
	
	private String pictureUrl;
	
	private String facebookId;
	private String googleId;
	private String vkontakteId;
	// private Company company;

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	public String getVkontakteId() {
		return vkontakteId;
	}

	public void setVkontakteId(String vkontakteId) {
		this.vkontakteId = vkontakteId;
	}

	private List<String> roles;



	
	public void grantAuthority(String authority) {
		if (roles == null)
			roles = new ArrayList<>();
		roles.add(authority);
	}

//	@Override
//	public List<GrantedAuthority> getAuthorities() {
//		List<GrantedAuthority> authorities = new ArrayList<>();
//		if (roles != null) {
//			roles.forEach(role -> authorities.add(new SimpleGrantedAuthority(role)));
//
//		}
//		return authorities;
//	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}