package computations;

import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        System.out.println(reverseUsingStack("johndoe"));
    }

    public static String reverseUsingStack(String string){
        String[] strArr = string.split("");
        Stack stack = new Stack();
        String result = "";
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(String.format("pusthing %s to stack", strArr[i]));
            stack.push(strArr[i]);
        }
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}
