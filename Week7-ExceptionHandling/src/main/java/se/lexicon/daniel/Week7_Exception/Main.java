package se.lexicon.daniel.Week7_Exception;

import java.io.IOException;
import java.util.List;

import se.lexicon.daniel.Week7_Exception.data_access.NameService;
import se.lexicon.daniel.Week7_Exception.domain.Person;
import se.lexicon.daniel.Week7_Exception.fileIO.CSVReader_Writer;

public class Main {

	public static void main(String[] args) {
		
		List <String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

        // Get list of last names
		List<String> lastNames = null;
		try {lastNames = CSVReader_Writer.getLastNames();} 
		catch (IOException e) {e.printStackTrace();}
		
        NameService nameService = new NameService(maleFirstNames, femaleFirstNames,lastNames);


        Person test = nameService.getNewRandomPerson();
        System.out.println(test);

	}

}
