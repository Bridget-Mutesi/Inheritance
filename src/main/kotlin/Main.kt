fun main(){
    val car = Car("Lexus","RX350","black",6)
    car.carry(5)
    car.identity()
    var x = car.calculateParkingFees(10)
    println(x)

    val bus = Bus("Toyo","sienna","white",6)
    var y = bus.maxTripFare(250.0)
    println(y)
    var add = bus.calculateParkingFees(2)
    println(add)



}

open class Car(var make:String, var model:String,var color:String, var capacity:Int){
    fun carry(people:Int){
        var x = (people-capacity)
        if (people<=capacity) {
            println("Carrying $people passengers")
        }
            else if (people>capacity){
                println("Over capacity by $x people")
            }


        }
    fun identity(){
        println("Iam a $color $make $model")
    }
   open fun calculateParkingFees(hours: Int): Int{
       var tek = hours*20
       return tek



    }
}

class Bus( make: String,  model:String,  color:String, capacity: Int):Car(make,model,color,capacity){
          fun maxTripFare(fare: Double):Double{
              val calculate = capacity * fare
              return calculate
          }

    override fun calculateParkingFees(hours: Int): Int {
        var mak = hours*capacity
        return mak
    }
}



