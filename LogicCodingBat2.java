//alarmClock
public String alarmClock(int day, boolean vacation) {
  if (vacation && (day >= 1 && day <= 5)) {
    return "10:00";
  }
  else if (vacation && (day == 0 || day >= 6)) {
    return "off";
  }
  
  else if (day >= 1 && day <= 5) {
    return "7:00";
  }
  else {
    return "10:00";
  }
}

//in1To10
public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode && (n >= 10 || n <= 1)) {
    return true;
  }
  else if ((outsideMode == false) && n >= 1 && n <= 10) {
    return true;
  }
  else {
    return false;
  }
}
