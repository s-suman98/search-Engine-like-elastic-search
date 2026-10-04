package org.com.strategy;

import org.com.model.SearchResult;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleRankingStargtegy implements  RankingStrategyI{
@Override
public List< SearchResult > getRankWise (List< SearchResult > candidate) {
	
	Collections.sort (candidate,(a,b)-> b.getWeight ()-a.getWeight ());
	
	return candidate;
}
}
