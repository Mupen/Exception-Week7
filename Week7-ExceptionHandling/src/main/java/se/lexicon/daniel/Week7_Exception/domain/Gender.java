package se.lexicon.daniel.Week7_Exception.domain;

public enum Gender {
	MALE,FEMALE;

    public String toString(){
        return this.name().toLowerCase();
    }
}
