package com.rays.pro4.Exception;

/**
 * ApplicationException is propogated from Model classes when an business logic
 * exception occurered.
 * 
 * @author Prakhar Solanki
 *
 */
public class ApplicationException extends Exception {

	public ApplicationException(String msg) {
		super(msg);
	}

}
