//rotateLeft3
public int[] rotateLeft3(int[] nums) {
  int[] copyArr = new int[nums.length];
  copyArr[0] = nums[1];
  copyArr[1] = nums[2];
  copyArr[2] = nums[0];
  return copyArr;
}

//reverse3
public int[] reverse3(int[] nums) {
  int[] copyArr = new int[nums.length];
  copyArr[0] = nums[2];
  copyArr[2] = nums[0];
  copyArr[1] = nums[1];
  return copyArr;
}

//maxEnd3
public int[] maxEnd3(int[] nums) {
  int[] copyArr = new int[nums.length];
  if(nums[0] > nums[2]) {
    copyArr[1] = nums[0];
    copyArr[2] = nums[0];
    copyArr[0] = nums[0];
  }
  else if(nums[2] > nums[0]) {
    copyArr[0] = nums[2];
    copyArr[1] = nums[2];
    copyArr[2] = nums[2];
  }
  else if(nums[0] == nums[2]) {
    copyArr[0] = nums[0];
    copyArr[1] = nums[0];
    copyArr[2] = nums[0];
  }
  return copyArr;
}

//sum2
public int sum2(int[] nums) {
  int sum = 0;
  if((nums.length < 2) && (nums.length > 0)) {
    return sum += nums[0];
  }
  else if(nums.length >= 2) {
    return sum += (nums[0] + nums[1]);
  }
  else {
    return 0;
  }
}

//middleWay
public int[] middleWay(int[] a, int[] b) {
  int[] copyArr = new int[2];
  copyArr[0] = a[1];
  copyArr[1] = b[1];
  return copyArr;
}

//makeEnds
public int[] makeEnds(int[] nums) {
  int[] copyArr = new int[2];
  copyArr[0] = nums[0];
  copyArr[1] = nums[nums.length-1];
  return copyArr;
}
