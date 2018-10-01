
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException  {
  String[] names={"ajay","akhil","hemanth","vinay","anvesh","harsha"}; 
    Stream.of(names)
    .filter(x-> x.startsWith("a"))
    .forEach(System.out::println);
      
  }
}
