package section14Lambda.Lambda7Chaining;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String name = "Danish";
        Function<String,String> uCase = s -> s.toUpperCase();
        System.out.println(uCase.apply(name));

        Function<String,String> lastName = s -> s.concat(" Deshmukh");
        Function<String,String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        Function<String,String[]> f0 = uCase
                .andThen(s -> s.concat(" Deshmukh"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));
    }
}
