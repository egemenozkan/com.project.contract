package com.project.common.model;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.project.api.data.enums.UserType;

public class UserPrincipal extends User {

	private static final long serialVersionUID = 5577192456921820944L;

	public UserPrincipal(int id, String firstName, String lastName, String email, String pictureUrl, String username,
			String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pictureUrl = pictureUrl;

	}

	private int id;

//	private String username;
//	private String password;

	private String firstName;
	private String lastName;
	private String email;
	private UserType userType;

	private String pictureUrl;

	private String facebookId;
	private String googleId;
	private String vkontakteId;

	private Map<String, String> userInfo;
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

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Map<String, String> getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(Map<String, String> userInfo) {
		this.userInfo = userInfo;
	}

//	@JsonDeserialize(using = GrantedDeserializer.class)
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		List<GrantedAuthority> authorities = new ArrayList<>();
//		if (roles != null) {
//			roles.forEach(role -> authorities.add(new SimpleGrantedAuthority(role)));
//
//		}
//		return authorities;
//	}

}
