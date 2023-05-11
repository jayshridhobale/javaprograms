package String;

public class ReplacewithStar {

    public static void main(String[] args) {

        String str="abccbacba";
        System.out.println(str.substring(0,1)+"*"+str.substring(2));
        System.out.println(str.substring(0,7)+"*"+str.substring(8));
        System.out.println(str.substring(0,4)+"*"+str.substring(5));
        System.out.println(str.substring(0,1)+"*"+str.substring(2,7)+"*"+str.substring(8));
        System.out.println(str.replace("b","*"));





    }

}


