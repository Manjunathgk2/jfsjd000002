import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class java8 {
    public static void main(String[] args) {
      List<String> names= Arrays.asList("Ajay","Ram","Abhi","Mgk","Bharath");
      Stream<String> s1=names.stream().filter(name -> name.startsWith("A")).map(name->name.toUpperCase());
      s1.forEach(System.out::println);
    }
}
