public boolean has23(int[] nums) {
  boolean has23 = false;
  if (nums[0] == 2) {
    return true;
  }
  if (nums[0] == 3) {
    return true;
  }
  if (nums[1] == 2) {
    return true;
  }
  if (nums[1] == 3) {
    return true;
  }
  return has23;
}


public boolean no23(int[] nums) {
  boolean has23 = true;
  if (nums[0] == 2) {
    return false;
  }
  if (nums[0] == 3) {
    return false;
  }
  if (nums[1] == 2) {
    return false;
  }
  if (nums[1] == 3) {
    return false;
  }
  return has23;
}


public int[] makeLast(int[] nums) {
  int result[] = new int[nums.length*2];
  result[result.length-1] = nums[nums.length-1];
  return result;
}


public boolean double23(int[] nums) {
  int count1 = 0;
  int count2 = 0;
  boolean double23 = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      count1++;
    }
  }
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 3) {
      count2++;
    }
  }
  
  if (count1 == 2) {
    double23 = true;;
  }
   if (count2 == 2) {
    double23 = true;;
  }
  return double23;
}


public int[] fix23(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      if (nums[i+1] == 3) {
        nums[i+1] = 0;
      }
    }
  }
  return nums;
}


public int start1(int[] a, int[] b) {
  int starts1 = 0;
  if (a.length > 0 && a[0] == 1) {
    starts1++;
  }

  if (b.length > 0 && b[0] == 1) {
    starts1++;
  }
  return starts1;
}


public int[] biggerTwo(int[] a, int[] b) {
  int num1 = 0;
  int num2 = 0;

  for (int i = 0; i < a.length; i++) {
    num1 += a[i];
  }

  for (int i = 0; i < b.length; i++) {
    num2 += b[i];
  }

  if (num1 > num2) {
    return a;
  } else if (num2 > num1) {
    return b;
  } else {
    return a;
  }
}


public int[] makeMiddle(int[] nums) {
  int[] result = new int[2];
  result[0] = nums[nums.length/2 - 1];
  result[1] = nums[nums.length/2];
  return result;
}


public int[] plusTwo(int[] a, int[] b) {
  int[] result = new int[a.length + b.length];
  result[0] = a[0];
  result[1] = a[1];
  result[2] = b[0];
  result[3] = b[1];
  
  return result;
}


public int[] swapEnds(int[] nums) {
  int result[] = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    result[i] = nums[i];
  }
  result[0] = nums[nums.length-1];
  result[nums.length-1] = nums[0];
  return result;
}


public int[] midThree(int[] nums) {
  int[] result = new int[3];
  result[0] = nums[nums.length/2 - 1];
  result[1] = nums[nums.length/2];
  result[2] = nums[nums.length/2 + 1];
  return result;
}


public int maxTriple(int[] nums) {
  int value = 0;
  if (nums[0] > nums[nums.length/2] && nums[0] > nums[nums.length-1]) {
    value = nums[0];
  }
  else if(nums[nums.length/2] > nums[0] && nums[nums.length/2] > nums[nums.length-1]) {
    value = nums[nums.length/2];
  }
  else {
    value = nums[nums.length-1];
  }
  return value;
}


public int[] frontPiece(int[] nums) {
  int result[] = new int[2];
  if (nums.length == 0) {
    return nums;
  }
  if (nums.length == 1) {
    return nums;
  }
  if (nums.length > 1) {
    result[0] = nums[0];
    result[1] = nums[1];
  }
  
  return result;
}


public boolean unlucky1(int[] nums) {
    int i = nums.length;
    if (i < 2) return false; 

    if (nums[0] == 1 && nums[1] == 3) {
      return true;
    }

    if (i > 2 && nums[1] == 1 && nums[2] == 3) {
    return true;
    }

    if (nums[i - 2] == 1 && nums[i - 1] == 3) {
    return true;
    }

    return false; 
}


public int[] make2(int[] a, int[] b) {
    int[] result = new int[2];
    int index = 0;

    for (int i = 0; i < a.length && index < 2; i++) {
        result[index] = a[i];
        index++;
    }

    for (int i = 0; i < b.length && index < 2; i++) {
        result[index] = b[i];
        index++;
    }

    return result;
}


public int[] front11(int[] a, int[] b) {
    if (a.length > 0 && b.length > 0) {
        return new int[] {a[0], b[0]};  
    } else if (a.length > 0) {
        return new int[] {a[0]};        
    } else if (b.length > 0) {
        return new int[] {b[0]};      
    } else {
        return new int[] {};             
    }
}
