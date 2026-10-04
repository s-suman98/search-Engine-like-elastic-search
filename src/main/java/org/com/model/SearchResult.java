package org.com.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchResult {

private String  document;

private  int weight;
}
