fun main() {

//    1. დაწერეთ ფუნქცია, რომელსაც გადაეცემა ტექსტი და აბრუნებს პალინდრომია თუ არა. (პალინდრომი
//    არის ტექსტი რომელიც ერთნაირად იკითხება ორივე მხრიდან).

//    Boolean isPalindrome(String text);

//    fun isPalindrome(text: String): Boolean {
//
//        return text == text.reversed()
//    }

//    2. გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა
//    (თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა
//    დავახურდაოთ.

//    Int minSplit(Int amount);

//    fun minSplit(amount: Int): Int {
//        var change = amount
//        var minCent = 0
//        val cents = arrayOf(50, 20, 10, 5, 1)
//        for (c in cents) {
//            minCent += change / c
//            if (change >= c) {
//                change %= c
//            }
//        }
//        return minCent
//    }


//    3. მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც
//    გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში არ
//    შედის.

//    Int notContains(Int[] array);

//    fun notContains(array: Array<Int>): Int {
//        val sortedArray = array.sorted()
//
//        for (e in sortedArray){
//            if(e - 1 > 0 && !array.contains(e - 1)) {
//                return e - 1
//            } else if(!array.contains(e + 1)) {
//                return e + 1
//            }
//        }
//        return 0
//    }


//    4. მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან. დაწერეთ ფუნქცია რომელიც
//    აბრუნებს ფრჩხილები არის თუ არა მათემატიკურად სწორად დასმული.
//
//    Boolean isProperly(String sequence);
//
//    მაგ: (()()) სწორი მიმდევრობაა, ())() არასწორია

//    fun isProperly(sequence: String): Boolean {
//        return when (sequence.length % 2) {
//            0 -> {
//                var resultSequence = sequence
//                while ("()" in resultSequence) {
//                    resultSequence = resultSequence.replace("()", "")
//                }
//                resultSequence.isEmpty()
//            }
//
//            else -> false
//        }
//    }


//    5. გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით. დაწერეთ
//    ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
//
//    Int countVariants(Int stairsCount);

//    fun fibonacciNumber(n: Int): Int {
//        return if (n <= 1) {
//            n
//        } else {
//            fibonacciNumber(n - 1) + fibonacciNumber(n - 2)
//        }
//    }
//
//    fun countVariants(stairsCount: Int): Int {
//        return fibonacciNumber(stairsCount + 1)
//    }
//
//    print(countVariants(5))

//    6. დაწერეთ საკუთარი მონაცემთა სტრუქტურა, რომელიც საშუალებას მოგვცემს O(1) დროში წავშალოთ
//    ელემენტი.
}