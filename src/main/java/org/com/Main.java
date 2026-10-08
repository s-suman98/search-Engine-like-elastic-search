package org.com;

import org.com.engine.SearchEngine;
import org.com.strategy.SimpleRankingStargtegy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String[] args) {
	
	
	SearchEngine searchEngine=new SearchEngine(new SimpleRankingStargtegy ());
	
	
	
	System.out.println (searchEngine.search ("softwar"));



}
}