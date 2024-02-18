package pl.camp.it.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        String s = "asjhkdgahsgdkfj";

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(c != 'a') {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
