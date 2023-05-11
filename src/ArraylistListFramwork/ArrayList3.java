package ArraylistListFramwork;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("Manual");
        str.add("Java");
        str.add("Sql");
        str.add("Web tech");

        //there are three types of printing the arraylist
        System.out.println("step1-Using normal sysout");
        System.out.println(str);
        System.out.println("step2-Using For loop");
        for(int a=0;a<str.size();a++){
            System.out.println(str.get(a));
        }
        System.out.println("step 3-Using enhanced for loop");
        for (String s:str) {
            System.out.println(s);

        }
    }
}
