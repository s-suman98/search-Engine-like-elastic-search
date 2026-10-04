package org.com.tokens;

import java.util.Arrays;
import java.util.List;

public class SimpleTokenizer implements  TokenizerI{
@Override
public List< String > tokenize (String sentence) {
	return  Arrays.stream(sentence.split ("\\s+")).toList ();
}
}
