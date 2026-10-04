package org.com.Indexer;


import java.util.HashMap;
import java.util.Map;

public class InvertedIndex {

private Map< String, Map< String, Integer > > invertIndex;


public InvertedIndex () {
	invertIndex = new HashMap<> ();
}

public void printIndex(){
	System.out.println (invertIndex);
}


public boolean saveToken (String keyword, String docTitle) {
	
	Map< String, Integer > docs = invertIndex.computeIfAbsent (keyword, k -> new HashMap<> ());
	
	docs.put(docTitle, docs.getOrDefault(docTitle, 0) + 1);
	
	//printIndex ();
	
	return true;
	
	
	
}

public Map<String,Integer> searchKeyWord(String keyword){
	
	
	return invertIndex.getOrDefault(keyword, new HashMap<>());
}



}
