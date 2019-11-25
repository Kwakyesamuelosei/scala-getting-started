package io.turntabl.scalagettingstarted

object MyApp extends App {
    val firstName = "Sam"
    val homeTown = "Kwahu"
//    print(s"$firstName was born in $homeTown \n");

    def threeTimes(word: String) = word * 3
//    print(threeTimes("Yaa"))

    def even(num: Int) = if (num % 2 == 0) true else false
//    print(even(3))

    def odd(num: Int) = if (even(num)) false else true
//    print(odd(2))

    def even2(num:Int) = even(num)
//    print(even2(3))

    def wordsToLower(words: String*) = words map (_.toLowerCase)
//    print(wordsToLower("NADIA","TAWIAH","UG"))

    def isWeekendDay(day: String) =
        day match {
            case "Friday" => true
            case "Saturday" => true
            case "Sunday" => true
            case _ => false
        }
//    print(isWeekendDay("Friday"))
    def areWeekendDays(days: String*) =
        days map (isWeekendDay(_))
//    print(areWeekendDays("Monday","Saturday","Sunday"))

//    areWeekendDays("Monday","Saturday","Sunday") foreach( println)

    def mutiple(name: String, num: Int) =
        name * num
//    print(mutiple("Doreen",4))



}

