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
public boolean double23(int[] nums) {
  if(nums.length == 0 || nums.length == 1) {
    return false;
  }
  else {
    if((nums[0] == 2) && (nums[nums.length-1] == 2)) {
      return true;
    }
    else if((nums[0] == 3) && (nums[nums.length-1] == 3)) {
      return true;
    }
  }
  return false;
}

//fix23
public int[] fix23(int[] nums) {
  for(int i = 0; i < nums.length-1; i++) {
    if(nums[i] == 2) {
      if(nums[i+1] == 3) {
        nums[i+1] = 0;
        return nums;
      }
    }
  }
  return nums;
}

//start1
public int start1(int[] a, int[] b) {
  int count = 0;
  if(a.length >= 1) {
    if(a[0] == 1) {
      count++;
    }
  }
  if(b.length >= 1) {
    if(b[0] == 1) {
      count++;
    }
  }
  return count;
}

//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  if((a[0] + a[1]) > (b[0] + b[1])) {
    return a;
  }
  else if((a[0] + a[1]) < (b[0] + b[1])) {
    return b;
  }
  else {
    return a;
  }
}

//makeMiddle
public int[] makeMiddle(int[] nums) {
  int b = nums.length-1;
  int midNums[] = new int[2];
  for(int a = 0; a < nums.length; a++) {
    if(b - a == 1) {
      midNums[0] = nums[a];
      midNums[1] = nums[b];
    }
    else {
      b -= 1;
    }
  }
  return midNums;
}

//plusTwo
public int[] plusTwo(int[] a, int[] b) {
  int bothAB[] = new int[4];
  bothAB[0] = a[0];
  bothAB[1] = a[1];
  bothAB[2] = b[0];
  bothAB[3] = b[1];
  return bothAB;
}

//swapEnds
public int[] swapEnds(int[] nums) {
  int tempNum = nums[0];
  if(nums.length > 1) {
    nums[0] = nums[nums.length-1];
    nums[nums.length-1] = tempNum;
    return nums;
  }
  else {
    return nums;
  }
}

//midThree
public int[] midThree(int[] nums) {
   int b = nums.length-1;
  int midNums[] = new int[3];
  for(int a = 0; a < nums.length; a++) {
    if(b - a == 2) {
      midNums[0] = nums[a];
      midNums[1] = nums[a+1];
      midNums[2] = nums[b];
    }
    else {
      b -= 1;
    }
  }
  return midNums;
}
//Dude I just realized i could have used nums.length / 2 well at least i got creative right

//maxTriple
public int maxTriple(int[] nums) {
  if(nums.length > 1) {
    if((nums[0] > nums[nums.length/2]) && (nums[0] > nums[nums.length-1])) {
      return nums[0];
    }
    else if((nums[nums.length/2] > nums[0]) && (nums[nums.length/2] > nums[nums.length-1])) {
      return nums[nums.length/2];
    }
    else {
      return nums[nums.length-1];
    }
  }
  else {
    return nums[0];
  }
}

//frontPiece
public int[] frontPiece(int[] nums) {
  int copyArr[] = new int[2];
  if(nums.length < 2) {
    return nums;
  }
  else {
    copyArr[0] = nums[0];
    copyArr[1] = nums[1];
    return copyArr;
  }
}

//unlucky1
public boolean unlucky1(int[] nums) {
 if(nums.length > 1) {
    if(nums[0] == 1 && nums[1] == 3) {
     return true;
    }
    else if(nums[1] == 1 && nums[2] == 3) {
     return true;
    }
    else if(nums[nums.length-2] == 1 && nums[nums.length-1] == 3) {
     return true;
   }
    return false;
  }
  else {
    return false;
  }
}

//make2
public int[] make2(int[] a, int[] b) {
  int copyArr[] = new int[2];
  if(a.length >= 2) {
    copyArr[0] = a[0];
    copyArr[1] = a[1];
    return copyArr;
  }
  else if(a.length == 1) {
    copyArr[0] = a[0];
    copyArr[1] = b[0];
    return copyArr;
  }
  else if(a.length == 0) {
    copyArr[0] = b[0];
    copyArr[1] = b[1];
    return copyArr;
  }
  return copyArr;
}

//front11
public int[] front11(int[] a, int[] b) {
  int copyArr[] = new int[2];
  int copyArr2[] = new int[1];
  int empty[] = new int[0];
  if(a.length > 0 && b.length > 0) {
    copyArr[0] = a[0];
    copyArr[1] = b[0];
    return copyArr;
  }
  else if(a.length == 0 && b.length > 0) {
    copyArr2[0] = b[0];
    return copyArr2;
  }
  else if(a.length > 0 && b.length == 0) {
    copyArr2[0] = a[0];
    return copyArr2;
  }
  else if(a.length == 0 && b.length == 0) {
    return empty;
  }
  return empty;
}

