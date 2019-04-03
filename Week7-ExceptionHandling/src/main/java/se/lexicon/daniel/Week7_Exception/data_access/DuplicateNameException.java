package se.lexicon.daniel.Week7_Exception.data_access;

public class DuplicateNameException extends Exception {

	private static final long serialVersionUID = 1L;
	private String exception;
	public DuplicateNameException(String exception) {this.exception = exception;}
	public String getException() {return exception;}
	
}