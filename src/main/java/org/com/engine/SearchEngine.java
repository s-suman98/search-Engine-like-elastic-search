package org.com.engine;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.com.Indexer.Indexer;
import org.com.Indexer.InvertedIndex;
import org.com.model.SearchResult;
import org.com.strategy.RankingStrategyI;
import org.com.tokens.SimpleTokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Data
public class SearchEngine {


private Indexer indexer;

RankingStrategyI rankingStrategy;

InvertedIndex invertedIndex;


public SearchEngine (RankingStrategyI rankingStrategy) {
	
	this.indexer = new Indexer (new InvertedIndex (),new SimpleTokenizer ());
	this.rankingStrategy=rankingStrategy;
	this.invertedIndex=new InvertedIndex ();
	init ();
	
	invertedIndex.printIndex ();
}

private void init () {
	
	System.out.println ("init called");
	
	
	//Sedd the documents
	indexer.addDocuments (SmapleDocs.sampleDocuments);
	
	
}



public List< SearchResult  > search(String word){
	
	  Map<String,Integer> resultMap=invertedIndex.searchKeyWord(word);
	  
	  
	   List<SearchResult> result=new ArrayList<> ();
	   
	   for(Map.Entry<String,Integer> entry:resultMap.entrySet ()){
		   result.add(new SearchResult (entry.getKey (),entry.getValue ()));
	   }
	
	
	  return  rankingStrategy.getRankWise (result);
	
	
}


}
