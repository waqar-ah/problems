 package com.waqar.problems;

 import java.util.Arrays;
 import java.util.stream.Stream;

 public class LetterCount {
    public static void main(String[] args) {

    	// String[] names = {"william", "jones", "aaron", "seppe", "frank", "gilliam", "asd","a"};
        // System.out.println(Arrays.toString(names));
        // Stream<String> stream = Stream.of(names);
        // Integer sum  =  stream.filter(f -> f.length() > 5)
        //         .mapToInt(str -> str.length())
        //         .sum();
        // System.out.println(sum);
        List<List<String>> asd = {{"william", "jones", "aaron"},{"seppe", "frank", "gilliam"},{"asd","a"}};

        asd.stream()
        .flatMap(a -> a.get.stream())


        // String[] names = {"william", "jones", "aaron", "seppe", "frank", "gilliam", "asd","a"};
        // System.out.println(Arrays.toString(names));
        // Stream<String> stream = Stream.of(names);
        // Integer sum  =  stream.filter(f -> f.length() > 5)
        //         .mapToInt(str -> str.length())
        //         .sum();
        // System.out.println(sum);

    }

}
