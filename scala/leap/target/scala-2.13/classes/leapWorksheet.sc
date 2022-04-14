//def leapYear(year: Int): Boolean = {
//  if (year % 4 == 0) {
//    if (year % 100 == 0) {
//      if (year % 400 == 0) true
//      else false
//    }
//    else true
//  }
//  else false
//}

def leapYear(year: Int): Boolean = {
  (year % 4 == 0) && ((year%100 == 0) == (year%400 == 0)) //XNOR
}

leapYear(2015)
leapYear(1996)
leapYear(2100)
leapYear(2000)

