
  
object SingleInheritance{  
    
    
    class Car{  
    var car:String = "Baleno 1.2 Zeta" 
}  
  
class Price extends Car{  
    var price:Int = 820000 
    println("The price of car = "+car+"is "+price)  
      
}  
    
    
    
    def main(args:Array[String]){  
        var p = new Price()  
   
        
    }  
}  