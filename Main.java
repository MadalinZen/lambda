package LambdaExpressions;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String,Integer> lambdaExp = (s)->s.length();

        Integer size1 = lambdaExp.apply("aici este un string");

        System.out.println(size1);



        Function<String,String> replaceExp = s -> {

            String aux = s.replace("  ", " ");
            while(aux.contains("  ")){

                aux = aux.replace("  ", " ");
            }
            return aux;


        };

        Function<String,Integer> sizeExp = s -> s.length();

        //Integer size = sizeExp.apply(replaceExp.apply("t  t   "));

        String res = replaceExp.apply("t  t   ");
        System.out.println(">>>>"+res+"<<<<");

        Integer size = sizeExp.apply(res);
        System.out.println(size);


    }




}
