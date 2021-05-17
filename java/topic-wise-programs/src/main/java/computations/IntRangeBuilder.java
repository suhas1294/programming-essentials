package computations;

public class IntRangeBuilder {
    public static void main(String[] args) {
        String input = "1-5, 8, 11-14, 18, 20, 26-29";
        String output = "";

        input = input.replace(" ", "");

        String[] arr = input.split(",");

        for (String str: arr) {
            if (str.contains("-")){
                int start = Integer.parseInt(str.split("-")[0]);
                int end = Integer.parseInt(str.split("-")[1]);
                for (int i = start; i <= end ; i++) {
                    if (output.equalsIgnoreCase("")){
                        output = output + i;
                    }else {
                        output = output + ", " + i;
                    }
                }
            }else {
                output = output + ", " + str;
            }
        }

        System.out.println(output);
    }
}
