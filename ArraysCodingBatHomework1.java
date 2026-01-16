//firstLast6
public boolean firstLast6(int[] nums) {
    if (nums[0] == 6) {
      return true;
    }
    else if (nums[nums.length-1] == 6) {
    return true;
    }
  return false;
}

//sameFirstLast
public boolean sameFirstLast(int[] nums) {
  for (int i = 0; i <= nums.length-1; i++) {
    if (nums[0] == nums[nums.length-1]) {
      return true;
    }
  }
  return false;
}

//makePi
public int[] makePi() {
  int pi[] = new int[3];
  pi[0] = 3;
  pi[1] = 1;
  pi[2] = 4;
  
  return pi;
}

//commonEnd
public boolean commonEnd(int[] a, int[] b) {
  if (a[0] == b[0]) {
    return true;
  }
  else if (a[a.length-1] == b[b.length-1]) {
    return true;
  }
  return false;
}

//sum3
public int sum3(int[] nums) {
   int num = 0;
  for (int i = 0; i <= nums.length-1; i++) {
    num += nums[i];
  }
  return num;
}
