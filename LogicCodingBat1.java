//cigarParty
public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend && cigars >= 60) {
  return true;
  } 
  else if(cigars >= 40 && cigars < 61) {
  return true;
  } 
  else {
  return false;
  }
}

//dateFashion
public int dateFashion(int you, int date) {
  if (you <= 2 || date <= 2) {
    return 0;
  }
  else if (you >= 8 || date >= 8) {
    return 2;
  }
  else {
    return 1;
  }
}

//squirrelPlay
public boolean squirrelPlay(int temp, boolean isSummer) {
  if ((temp >= 60 && temp <= 100) && isSummer) {
    return true;
  }
  else if (temp >= 60 && temp <= 90) {
    return true;
  }
  else {
    return false;
  }
}

//caughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday) {
  if (isBirthday) {
    speed -= 5;
  }
  if (speed <=60){
    return 0;
  }
  else if (speed >= 61 && speed <=80){
    return 1;
  }
  else if (speed >= 81){
    return 2;
  }
  else{
    return 0;
  }
}

//sortaSum
public int sortaSum(int a, int b) {
  if ((a + b) < 10 || (a + b) > 20){
    return a + b;
  }
  else {
    return 20;
  }
}


