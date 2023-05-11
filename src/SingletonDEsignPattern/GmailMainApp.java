package SingletonDEsignPattern;

public class GmailMainApp {
    public static void main(String[] args) {
        Gmail g1= Gmail.login();
        g1.sendDocument();
        g1.downloadDocument();
        g1.uploadResume();
        System.out.println("===========");
        Gmail g2=Gmail.login();
        System.out.println(g2);
        System.out.println(g1);


    }
}
