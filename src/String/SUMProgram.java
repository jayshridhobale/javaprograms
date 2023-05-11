package String;

public class SUMProgram {

    public static void main(String[] args) {

        String str ="10 20 30 40";
        int sum =0;
        String []arr=str.split(" ");
        for (String s :arr)
        {
          sum+=Integer.parseInt(s);
        }
        System.out.println(sum);



    }
}
