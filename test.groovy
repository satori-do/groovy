println ""               //Retreat, break...
println " - COMMENTS -"
println 2 + 2        // This is comment
println "Hello!"    /* This is comment, also */
/* And this is comment
multi string */
//Expected output///
println 3 + 2       //=> 5
println "Hello"    //=> Hello

println "Type of variables"///
def x = 1 /* оголошення безтипової змінної, присвоєнняїй значення
типу int */
x = "String" /* так як ми не вказали тип при оголошенні цієї змінної,
             то можна привласнювати цій змінній значення іншого типу */

//int b = 2 // оголошення змінної типу int
//b = "String for type int?" // так як тип змінної вказаний,
                           /* тоді коли ми присвоїмо значення String,
                           отримуємо помилку (GroovyCastException) */
println ""
println " - STRINGS -"
javaString = 'java' // Java String
groovyString = "Hello ${javaString}!" // Groovy String

println javaString // => java
println groovyString // => Hello java!

bigGroovyString = """
 long
  long
   string
""" // Long string with retreats
println "Long string with retreats: ${bigGroovyString}"
def a = "2"
println a
println a + "12" // Concatenation
println a * 3 // Multiplication

println ""
println " - LISTS -"
def someList = [1,2,3,4]   // Create list
def emptyList = []         // Create empty list

someList[0]                // Requesting to item by index
println someList
someList[4] = 6            // Add an item to the list
println someList
someList << 7 << 8         // Add an item to end of list
println someList
someList += [ 9, 10 ]      // "Sticking" list
println someList
someList[1..3]             // Getting a sublist
println someList
someList[2..4] = [ 12, 13, 14 ] // Rewrite subluist
println someList
someList[1,3,5..7,9]       // Getting a sublist
println "Getting a sublist:"
println "${someList}"

println "Cyclic output:"
for ( e in someList ) {
	println e          // Printing all items of list's someList
}

println ""
println " - MAPS -"
def someMap = [ 'a' : 1, 'b' : 2 ]   // Variable declaration

// Declaration an empty mapping
def emptyMap = [:]
def otherEmptyMap = [:] as HashMap

println someMap['a']                         // Item access
println someMap.a                            // Accessing the item as a field

someMap['a'] = 2                     // Change item
someMap.a = 2                        // Change the item as a field
// To store objects as a key, you can use parentheses ():
def map = [(new String("username")):"james", nickname:"jcameron", (new Integer(22)):1234]
println map.get(new Integer(22))
println ""

println "CONDITIONAL EXECUTION IF:"
def amPM = Calendar.getInstance().get(Calendar.AM_PM)
if (amPM == Calendar.AM){
	println("Good morning")
} else {
	println("Good evening")
}
amPM = Calendar.getInstance().get(Calendar.AM_PM)
if (amPM == Calendar.AM){
	println("Have another cup of coffee.")
} else {
	println("Go at home!")
}

def myBooleanVariable = true
println myBooleanVariable

///////////////////

def titanicBoxOffice = 1234600000
def titanicDirector = "James Cameron"

def trueLiesBoxOffice = 219000000
def trueLiesDirector = "James Cameron"

def returnOfTheKingBoxOffice = 752200000
def returnOfTheKingDirector = "Peter Jackson"

def theTwoTowersBoxOffice = 581200000
def theTwoTowersDirector = "PeterJackson"

titanicBoxOffice > returnOfTheKingBoxOffice // вычисляется как истина
titanicBoxOffice >= returnOfTheKingBoxOffice // вычисляется как истина
titanicBoxOffice >= titanicBoxOffice // вычисляется как истина
titanicBoxOffice > titanicBoxOffice // оценивается как ложное
titanicBoxOffice + trueLiesBoxOffice < returnOfTheKingBoxOffice + theTwoTowersBoxOffice // оценивается как ложное

titanicDirector > returnOfTheKingDirector // оценивается как ложное, потому что "J" находится перед "Р"
titanicDirector < returnOfTheKingDirector // вычисляется как истина
titanicDirector >= "James Cameron" // вычисляется как истина
titanicDirector == "James Cameron" // вычисляется как истина

if (titanicBoxOffice + trueLiesBoxOffice > returnOfTheKingBoxOffice + theTwoTowersBoxOffice){
	println(titanicDirector + " is a better director than " + returnOfTheKingDirector)
}
