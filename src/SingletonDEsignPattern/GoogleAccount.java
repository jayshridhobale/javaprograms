package SingletonDEsignPattern;

import MultilevelInheritance.Google;

public class GoogleAccount {
    static GoogleAccount g1;
   static int count=0 ;
    private GoogleAccount(){
        count++;
    }
    public static GoogleAccount createAccount(){
        if(count==0){
            g1=new GoogleAccount();
            System.out.println("Account Created");
        }
        else {
            System.out.println("Acount is Allready Created");
        }
        return g1;
    }
    void accessGmail(){
        System.out.println("Access Gmail using Google");
    }
    void accessDrive(){
        System.out.println("Access drive using Google");
    }
}
