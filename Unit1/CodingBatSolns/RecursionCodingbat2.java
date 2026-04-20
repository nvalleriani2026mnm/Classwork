//triangle
public int triangle(int rows) {
  if(rows == 0) {
    return 0;
  }
  else if(rows == 1) {
    return 1;
  }
  else if(rows > 1) {
    return rows + triangle(rows-1);
  }
  return 0;
}

//sumDigits
public int sumDigits(int n) {
  if(n < 10) {
    return n;
  }
  else if(n >= 10) {
    return (n % 10) + sumDigits(n / 10);
  }
  return 0;
}

//powerN
public int powerN(int base, int n) {
  if(n == 0) {
    return 1;
  }
  else if(base == 0) {
    return 0;
  }
  else if(n == 1) {
    return base;
  }
  else if(base > 0 && n > 1) {
    return base * powerN(base, n-1);
  }
  return 0;
}
