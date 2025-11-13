/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"

*/

public String doubleChar(String str) {
  String doublePrint = "";
  
  for (int num = 0; num < str.length(); num++) {
    char character = str.charAt(num);
    doublePrint += character;
    doublePrint += character;
  }
  
  return doublePrint;
} 
