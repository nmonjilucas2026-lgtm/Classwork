/*
Do the following codingbat problems in Array-1 
(you can complete this without loops):

rotateLeft3()

reverse3()

maxEnd3()

sum2()

middleWay()

makeEnds()

 
*/

 public int[] rotateLeft3(int[] nums) {
  int[] result = new int[nums.length];
     
  for (int i = 0; i < nums.length-1; i++) {
      result[i] = nums[i+1];
    }
    result[result.length-1] = nums[0];
    return result;
}

public int[] reverse3(int[] nums) {
  int[] result = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    result[i] = nums[i];
  }
  result[0] = nums[nums.length-1];
  result[nums.length-1] = nums[0];
  return result;
}

public int[] maxEnd3(int[] nums) {
  int[] result = new int[nums.length];
  int biggest = nums[0];
  if (biggest < nums[nums.length-1]) {
    biggest = nums[nums.length-1];
  }
  for (int i = 0; i < nums.length; i++) {
    result[i] = biggest;
  }
  return result;
}

public int sum2(int[] nums) {
  if (nums.length == 0) {
    return 0;
  }
  if (nums.length == 1) {
    return nums[0];
  }
  return nums[0] + nums[1];
}

public int[] middleWay(int[] a, int[] b) {
  int result[] = new int[2];
  result[0] = a[1];
  result[1] = b[1];
  return result;
}

public int[] makeEnds(int[] nums) {
  int result[] = new int[2];
  result[0] = nums[0];
  result[1] = nums[nums.length-1];
  return result;
}


