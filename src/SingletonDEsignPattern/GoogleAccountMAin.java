package SingletonDEsignPattern;

public class GoogleAccountMAin {
    public static void main(String[] args) {
        GoogleAccount acc1=GoogleAccount.createAccount();
        acc1.accessDrive();
        GoogleAccount acc2=GoogleAccount.createAccount();
        acc1.accessGmail();
//        System.out.println(acc1);
//        System.out.println(acc2);
    }
}
