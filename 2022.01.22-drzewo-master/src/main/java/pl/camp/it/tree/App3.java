package pl.camp.it.tree;

import java.util.HashSet;
import java.util.Set;

public class App3 {
    public static Set<String> results = new HashSet<>();

    public static void main(String[] args) {
        String input = "abcabcabcbabca";

        reduceString(input);
        reduceString2(input);
        reduceString3(input);
        reduceString4(input);
        reduceString5(input);
        reduceString6(input);


        System.out.println(results.size());
        System.out.println(results);
    }

    public static void reduceString(String input) {
        while (true) {
            String abReduced = input.replace("ab", "c");
            abReduced = abReduced.replace("ba", "c");
            abReduced = abReduced.replace("bc", "a");
            abReduced = abReduced.replace("cb", "a");
            abReduced = abReduced.replace("ac", "b");
            abReduced = abReduced.replace("ca", "b");

            if(abReduced.length() == input.length()) {
                input = abReduced;
                break;
            }
            input = abReduced;
        }

        App3.results.add(input);
    }

    public static void reduceString2(String input) {
        while (true) {
            String abReduced = input.replace("bc", "a");
            abReduced = abReduced.replace("cb", "a");
            abReduced = abReduced.replace("ab", "c");
            abReduced = abReduced.replace("ba", "c");
            abReduced = abReduced.replace("ac", "b");
            abReduced = abReduced.replace("ca", "b");

            if(abReduced.length() == input.length()) {
                input = abReduced;
                break;
            }
            input = abReduced;
        }

        App3.results.add(input);
    }

    public static void reduceString3(String input) {
        while (true) {
            String abReduced = input.replace("ab", "c");
            abReduced = abReduced.replace("ba", "c");
            abReduced = abReduced.replace("ac", "b");
            abReduced = abReduced.replace("ca", "b");
            abReduced = abReduced.replace("bc", "a");
            abReduced = abReduced.replace("cb", "a");

            if(abReduced.length() == input.length()) {
                input = abReduced;
                break;
            }
            input = abReduced;
        }

        App3.results.add(input);
    }

    public static void reduceString4(String input) {
        while (true) {
            String abReduced = input.replace("ac", "b");
            abReduced = abReduced.replace("ca", "b");
            abReduced = abReduced.replace("bc", "a");
            abReduced = abReduced.replace("cb", "a");
            abReduced = abReduced.replace("ab", "c");
            abReduced = abReduced.replace("ba", "c");

            if(abReduced.length() == input.length()) {
                input = abReduced;
                break;
            }
            input = abReduced;
        }

        App3.results.add(input);
    }

    public static void reduceString5(String input) {
        while (true) {
            String abReduced = input.replace("bc", "a");
            abReduced = abReduced.replace("cb", "a");
            abReduced = abReduced.replace("ac", "b");
            abReduced = abReduced.replace("ca", "b");
            abReduced = abReduced.replace("ab", "c");
            abReduced = abReduced.replace("ba", "c");

            if(abReduced.length() == input.length()) {
                input = abReduced;
                break;
            }
            input = abReduced;
        }

        App3.results.add(input);
    }

    public static void reduceString6(String input) {
        while (true) {
            String abReduced = input.replace("ac", "b");
            abReduced = abReduced.replace("ca", "b");
            abReduced = abReduced.replace("ab", "c");
            abReduced = abReduced.replace("ba", "c");
            abReduced = abReduced.replace("bc", "a");
            abReduced = abReduced.replace("cb", "a");

            if(abReduced.length() == input.length()) {
                input = abReduced;
                break;
            }
            input = abReduced;
        }

        App3.results.add(input);
    }
}
