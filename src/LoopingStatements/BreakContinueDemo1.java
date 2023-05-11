package LoopingStatements;

public class BreakContinueDemo1 {
    public static void main(String[] args) {
        for(int a=1;a<=10;a++){
            if(a==6){
                break;
            }
            System.out.println(a);
         }
        System.out.println("==========================");
        for (int a=1;a<=10;a++){
            if(a==6){
                continue;
            }
            System.out.println(a);
        }
    }
}
