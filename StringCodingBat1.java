//Answer for String helloName
public String helloName(String name) {
  return "Hello " + name + "!";
}

//Answer for makeAbba
public String makeAbba(String a, String b) {
  return a + b + b + a;
}

//Answer for makeTags
public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

//Answer for firsthalf
public String firstHalf(String str) {
  int halfOfSentence = (str.length()/2);
  String firstPart = new String (str.substring(0, halfOfSentence));
  return firstPart;
}
