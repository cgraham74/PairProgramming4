package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;

import java.util.List;

public class Application {

	public static void main(String[] args) {

		try {

			// Step Two: Create TELog, and log the start of the application.
			//
			TELog.log("Search application started" + "\n");



			// Step Four: Instantiate a Search Domain
			//
			SearchDomain searchDomain = new SearchDomain("data");
			TELog.log(searchDomain.toString());



			// Step Six: Single word search
			//
			SearchEngine searchEngine = new SearchEngine(searchDomain);
			searchEngine.indexFiles();
			List<String> searchedWords = searchEngine.search("squirrel");
			if (searchedWords.size() == 0){
				noFileFoundMessage();
			}
			for (String s : searchedWords){
				System.out.println(s);
			}



			// Step Seven: Multiple word search
			//
			SearchEngine searchMultiple = new SearchEngine(searchDomain);
			searchMultiple.indexFiles();
			List <String> searchMultiples = searchMultiple.search("telephone line");
			if(searchMultiples.size() == 0){
				noFileFoundMessage();
			}
			for (String s : searchMultiples){
				System.out.println(s);
			}


		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void noFileFoundMessage(){
		System.out.println("Searched word not found");
	}
}
