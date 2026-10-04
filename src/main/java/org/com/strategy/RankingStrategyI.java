package org.com.strategy;

import org.com.model.SearchResult;

import java.util.List;

public interface RankingStrategyI {
	
	List< SearchResult > getRankWise(List<SearchResult> candidate);
}
