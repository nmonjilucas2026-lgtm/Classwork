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

/*
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
*/

//Did not learn this specifically, had to search it up
public String firstTwo(String str) {
   if (str.length() < 2) {
        return str;
    }
    return str.substring(0, 2);
}

/*
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
*/

//knew what I needed, but didn't know how to put it--ultimately I searched it up after multiple failed attempts
public String withoutEnd(String str) {
    String middle = str.substring(1, str.length() - 1);
    return middle;
}



