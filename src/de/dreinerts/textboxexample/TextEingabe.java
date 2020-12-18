package de.dreinerts.textboxexample;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TextEingabe implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TextEingabe() {
		// TODO Auto-generated constructor stub
	}
	
	private String strEingabe;
	
	public String getStrEingabe() {
		return strEingabe;
	}

	public void setStrEingabe(String strEingabe) {
		this.strEingabe = strEingabe;
	}

	
	
	
}
