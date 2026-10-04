package org.com.Indexer;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.com.model.Document;
import org.com.tokens.TokenizerI;

import javax.lang.model.element.NestingKind;
import java.util.List;

@Data
@AllArgsConstructor
public class Indexer {

private InvertedIndex invertedIndex;

private TokenizerI tokenizer;


public void addDocument(Document document){
	
	List<String> titelTokens=tokenizer.tokenize (document.getTitle ());
	List<String> contentTokens=tokenizer.tokenize (document.getContent ());
	
	
	
	 titelTokens.forEach ((key)-> invertedIndex.saveToken (key, document.getTitle ()));
	 
	 contentTokens.forEach ((key)->invertedIndex.saveToken (key,document.getTitle ()));
 }


public void addDocuments(List<Document> document){
	
	document.forEach (this::addDocument);
}










}
