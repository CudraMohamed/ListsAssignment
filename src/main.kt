//Given a list of 10 strings ,write a function that returns a list of
//the strings at even indices 2,4,6 etc
fun main(){
    var myList=allies(listOf("Cudra","Mike","Sasha","Nur","Din","Ash","Nash","Halish","Rash","Miriam"))
    println(myList)

    var totalAdds=peopHeight(listOf(1,2,3,4,5))
    println(totalAdds)

    var mish=Person("Mish",20,5.7,50.5)
    var lish=Person("Lish",21,4.7,45.5)
    var sash=Person("Sash",22,6.7,47.5)
    var pash=Person("Pash",23,7.7,67.5)
    var posh=Person("Posh",24,8.7,87.5)
    var nameList= listOf(mish,lish,sash,pash,posh)
    var descNameList=nameList.sortedByDescending { girl->girl.age }
    println(descNameList)

    twoMore(listOf())

    var person1=Person("Miss",25,5.6,43.3)
    var person2=Person("Mr",35,7.1,70.3)
    var add= mutableListOf(person1,person2)


    println(descNameList.plus(add))

    var car1=Cars("JeepA507N",99)
    var car2=Cars("ToyotaA507N",89)
    var chevrolet=Cars("ChevroletA507N",79)
    var porsche=Cars("porscheA507N",69)
    var subaru=Cars("SubaruA507N",59)
    var allCars= listOf(car1,car2,chevrolet,porsche,subaru)
    println(carList(allCars))


}
fun allies(friends:List<String>):List<String>{
    friends.forEachIndexed { index, s ->
        if (index%2==0){
            println(s)
        }
    }
    return friends
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun peopHeight(height:List<Int>):String{
    var average=height.average()
    var add=height.sum()
    var addAvg="$average,$add"
    return addAvg
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name:String,var age:Int,var height:Double,var weight:Double)

//  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

fun twoMore(twoPeople:List<Person>):List<Any>{

    return listOf()
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Cars(var registration:String,var mileage:Int)

fun carList(car:List<Cars>):Int{
    var avg=0
    car.forEach { new->new.mileage
        avg+=new.mileage

    }
    var totalAvg=avg/car.count()
    return totalAvg
}

