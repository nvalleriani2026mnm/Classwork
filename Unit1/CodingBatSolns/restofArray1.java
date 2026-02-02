//has23
public boolean has23(int[] nums) {
  for(int i = 0; i < nums.length; i++) {
    if((nums[i] == 2) || (nums[i] == 3)) {
      return true;
    }
  }
  return false;
}

//no23
public boolean no23(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
    if((nums[i] == 2) || (nums[i] == 3)) {
      return false;
    }
  }
  return true;
}

//makeLast
public int[] makeLast(int[] nums) {
  int[] copyArr = new int[nums.length * 2];
  copyArr[copyArr.length-1] = nums[nums.length-1];
  return copyArr;
}

//double23



