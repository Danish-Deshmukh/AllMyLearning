package section14Lambda.Lambda5MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class Local {
    private static int last_id = 1;
    private int id;
    public Local() {
        id = Local.last_id++;
        System.out.println("Creating a PlainOld Object: id = " + id);
    }
}
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Bob", "Hannah", "AnnA", "DaiNsh", "Deshmukh"));
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

        calculator(Integer::sum, 32,12);

        Supplier<Local> reference1 = Local::new;
        Local newPojo = reference1.get();

        System.out.println("Getting array");
        Local[] pojo1 = seedArray(Local::new, 10);

        calculator((s1, s2) -> s1.concat(s2), "Hello", "World");
        calculator(String::concat, "Hello", "World");

        BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);
        BiFunction<String, String, String> b2 = (s1, s2) -> s1.concat(s2);
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("Hello","World"));
        System.out.println(b2.apply("Hello","World"));
        System.out.println(u1.apply("Hello"));

        String result = "Hello".transform(u1);
        System.out.println("Result = " + result);

        result = result.transform(String::toLowerCase);
        System.out.println("Result = " + result );

        Function<String, Boolean> f0 = s -> s.isEmpty();
        boolean resultBoolean = result.transform(f0);
        System.out.println("Result = " + resultBoolean);
    }

    private static Local[] seedArray(Supplier<Local> reference,int count) {

        Local[] array = new Local[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }
    private static <T> void calculator(BinaryOperator<T> operation,
                                       T value1, T value2) {

        T result = operation.apply(value1,value2);
        System.out.println("Result of operation " + result);
    }
}
