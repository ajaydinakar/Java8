
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException  {


    Stream.of("ajay","krishna","abi")
        .sorted()
        .findFirst()
        .ifPresent(System.out::print) ;   
      
  }
}
