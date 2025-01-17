/*
 * File: MapIterator.java
 * ----------------------
 * This program illustrates iteration using the various styles of maps.
  */

import acm.program.*;
import java.util.*;

/**
 * This program finds the name corresponding to a two-letter
 * abbreviation of a state.
 */
public class MapIterator extends ConsoleProgram {

	public void run() {
		HashMap<String,String> stateMap = new HashMap<String,String>();

		for(int i = 0; i < STATE_CODES.length; i++){
			stateMap.put(STATE_CODES[i], STATE_NAMES[i]);
		}
		listKeys(stateMap, 13);
	}

/* Lists the state abbreviations using the order from the map */
	private void listKeys(HashMap<String,String> map, int nPerLine) {
		   String className = map.getClass().getName();
		   int lastDot = className.lastIndexOf(".");
		   String shortName = className.substring(lastDot + 1);
		   println("Using " + shortName + ", the keys are:");
		   int i=0;
		 
		   for (String k : map.keySet()){
		      print(" " + k);
		      i++;
		      if (i % nPerLine == 0) println();
		   }

	}

/* Define the abbreviation and state arrays */
	private static final String[] STATE_CODES = {
		"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE",
		"FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY",
		"LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT",
		"NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH",
		"OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX",
		"UT", "VA", "VT", "WA", "WI", "WV", "WY"
	};

	private static final String[] STATE_NAMES = {
		"Alaska", "Alabama", "Arkansas", "Arizona", "California",
		"Colorado", "Connecticut", "District of Columbia",
		"Delaware", "Florida", "Georgia", "Hawaii", "Iowa",
		"Idaho", "Illinois", "Indiana", "Kansas", "Kentucky",
		"Louisiana", "Massachusetts", "Maryland", "Maine",
		"Michigan", "Minnesota", "Missouri", "Mississippi",
		"Montana", "North Carolina", "North Dakota", "Nebraska",
		"New Hampshire", "New Jersey", "New Mexico", "Nevada",
		"New York", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
		"Puerto Rico", "Rhode Island", "South Carolina",
		"South Dakota", "Tennessee", "Texas", "Utah", "Virginia",
		"Vermont", "Washington", "Wisconsin", "West Virginia",
		"Wyoming"
	};

}
