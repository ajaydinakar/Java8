
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException  {

   Arrays.stream(new int[]{1,2,3,4,5,5})
              .sorted()
              .map(x -> x*x)
              .average()
              .ifPresent(System.out::print);
}
}
