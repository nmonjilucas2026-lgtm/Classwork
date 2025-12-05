public int countHi(String str) {
    int count = 0;

    
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.substring(i, i + 2).equals("hi")) {
            count++;
        }
    }
    
    return count;
}

public boolean catDog(String str) {
    int cat = 0;
    int dog = 0;

    for (int i = 0; i < str.length() - 2; i++) {
        String sub = str.substring(i, i + 3);

        if (sub.equals("cat")) {
            cat++;
        }
        if (sub.equals("dog")) {
            dog++;
        }
    }
    return cat == dog;
}

public int countCode(String str) {
  int count = 0;
  for (int i = 0; i < str.length() - 3; i++) {
if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
  count++;
}
  }
  return count;
}

public String repeatEnd(String str, int n) {
    String end = str.substring(str.length() - n);
    String result = "";
    
    for (int i = 0; i < n; i++) {
        result += end;
    }
    
    return result;
}
