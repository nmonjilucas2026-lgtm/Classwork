/*
*Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, 
e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"

*/
public String makeOutWord(String out, String word) {
  String beginning = out.substring(0, 2);
  String end = out.substring(2, 4);
  
  return beginning + word + end;
}

/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
*/

public String extraEnd(String str) {
  String lastTwo = str.substring(str.length() - 2);
  return lastTwo + lastTwo + lastTwo;
}
