
interface FunInterface
{ 
    // An abstract function 
    void abstractFunction(int x); 
   
}
class Main {
  public static void main(String[] args) {
 
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FunInterface obj = (int arg)->System.out.println(arg*arg); 
  
        // This calls above lambda expression 
        obj.abstractFunction(5);
  }
}
