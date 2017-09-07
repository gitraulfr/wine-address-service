package com.ecommerce.wine.address.model.response;

import java.io.Serializable;

public class AddressResponse implements Serializable {
	
	private static final long serialVersionUID = 2300510002173434744L;
	
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
