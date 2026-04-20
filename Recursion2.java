public int triangle(int rows) {
  if (rows == 0)
  return 0;
  else if (rows == 1)
  return 1;
  else return rows + triangle(rows - 1);
}

public int sumDigits(int n) {
  if (n == 0)
  return 0;
  else return (n % 10) + sumDigits(n / 10);
}

public int powerN(int base, int n) {
  if (n == 0) 
  return 0;
  else if (n == 1) 
  return base;
  else return base * powerN(base, n - 1);
}
