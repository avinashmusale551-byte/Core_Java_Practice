package LambdaExpression;

import java.util.List;
import java.util.function.Function; // Using Java's built-in Function interface

public class FunctionalInterfaceFunction5 {
    public static void main(String[] args) {
        List<String> list = List.of("sandy", "load", "wider", "whisper", "Gangster", "happy", "sad");

     
        Function<String, Integer> sq = (l) -> l.length();
        Function<String,Integer> pk=sq.andThen((j)-> j*j);

        for (String s : list) {
            
            System.out.println(pk.apply(s));
        }
    }
}
