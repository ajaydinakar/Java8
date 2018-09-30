
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException  {

    System.out.println(
    IntStream
      .range(1,10)
      .skip(5)
      .sum());
  }
}
