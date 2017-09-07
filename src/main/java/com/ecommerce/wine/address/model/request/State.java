package com.ecommerce.wine.address.model.request;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;

//@Entity
//@Table(name = "state")
public class State {

//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wine.wine_state_nidstate_seq")
//	@SequenceGenerator(name = "wine.wine_state_nidstate_seq", sequenceName = "wine.wine_state_nidstate_seq", allocationSize = 1)
//	@Column(name = "nidstate")
	private int idState;
	
//	@Column(name = "nidcountry")
	private int idCountry;
	
//	@Column(name = "sstate")
	private String state;
	
//	@Column(name = "bisactive")
	private boolean isActive;

}
