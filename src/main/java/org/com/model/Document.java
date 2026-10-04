package org.com.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document {

 private int id;
 private String title;
 private String content;
}
