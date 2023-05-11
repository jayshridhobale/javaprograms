package String;

public class IncreamentDecreament {

    public static void main(String[] args) {

        String[]arr={"++X","X++","--X","X--","++X"};
        int X=0;

        for (String s :arr)
        {
            if (s.contains("++"))
                X++;
            else
            {
                X--;
            }
        }
        System.out.println("X:"+X);
    }
}
