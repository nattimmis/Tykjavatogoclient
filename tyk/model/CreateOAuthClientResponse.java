package com.me.tyk.model;

import com.google.gson.annotations.SerializedName;

/**
 * A response to a request to create an OAuth client.
 * 
 * @author Me
 *
 */
public class CreateOAuthClientResponse {

	@SerializedName(value="client_id")
	private String clientId;
	
	private String secret;
	
	@SerializedName(value="redirect_uri")
	private String redirectUri;
	
	public String getClientId() {
		return clientId;
	}
	
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

}