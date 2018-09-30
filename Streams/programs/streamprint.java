
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException  {
    IntStream
      .range(1,10)
      .forEach(System.out::print);
  }
}
