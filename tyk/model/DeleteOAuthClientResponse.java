package com.me.tyk.model;

/**
 * A response to a request to delete an OAuth client.
 * 
 * @author Me
 *
 */
public class DeleteOAuthClientResponse {

	private String key;
	private String status;
	private String action;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}