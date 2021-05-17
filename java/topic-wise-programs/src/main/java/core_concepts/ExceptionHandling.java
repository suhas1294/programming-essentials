package core_concepts;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("s");
        list.add("q");
        list.add("w");
        list.add(1);
        list.add("e");
        list.add("grhcf");
        for (Object s: list){
            try {
                System.out.println(stringLength((String) s));
                System.out.println("hi");
            }catch (ClassCastException in){
                /*String a = (String) s;
                System.out.println(a.length());*/
                System.out.println("could not cast type");
            }
        }
        System.out.println(false && false);
    }

    private static int stringLength(String s){
        return s.length();
    }
}
