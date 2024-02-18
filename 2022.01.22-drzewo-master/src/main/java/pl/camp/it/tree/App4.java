package pl.camp.it.tree;

import java.util.HashSet;
import java.util.Set;

public class App4 {

    public static Set<String> results = new HashSet<>();
    public static void main(String[] args) {
        String s = "abcbac";

        stringChallenge(s);
    }

    public static void stringChallenge(String s) {
        reduceAB(s);
        reduceBC(s);
        reduceAC(s);

        System.out.println(results.size());
        System.out.println(results);
    }

    public static void reduceAB(String s) {
        String reduced = s.replace("ab", "c");
        reduced = reduced.replace("ba", "c");

        boolean flag = true;
        if(reduced.contains("b")) {
            flag = false;
            reduceBC(reduced);
        }
        if(reduced.contains("a")) {
            flag = false;
            reduceAC(reduced);
        }

        if(flag) {
            App4.results.add(reduced);
        }
    }

    public static void reduceBC(String s) {
        String reduced = s.replace("bc", "a");
        reduced = reduced.replace("cb", "a");

        boolean flag = true;
        if(reduced.contains("b")) {
            flag = false;
            reduceAB(reduced);
        }
        if(reduced.contains("c")) {
            flag = false;
            reduceAC(reduced);
        }

        if(flag) {
            App4.results.add(reduced);
        }
    }

    public static void reduceAC(String s) {
        String reduced = s.replace("ac", "b");
        reduced = reduced.replace("ca", "b");

        boolean flag = true;
        if(reduced.contains("a")) {
            flag = false;
            reduceAB(reduced);
        }
        if(reduced.contains("c")) {
            flag = false;
            reduceBC(reduced);
        }

        if(flag) {
            App4.results.add(reduced);
        }
    }
}
