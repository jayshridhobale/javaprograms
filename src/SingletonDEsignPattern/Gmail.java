package SingletonDEsignPattern;

import javax.swing.plaf.IconUIResource;

public class Gmail {
    static Gmail g1;
    static int count=0;
    private Gmail(){
        count++;
    }
    public static Gmail login(){
        if(count==0){
            g1=new Gmail();
            System.out.println("Gmail login");
        }
        else{
            System.out.println("Gmail allready login");
        }
        return g1;
    }
    public void uploadResume(){
        System.out.println("upload Resume through Gmail");
    }
    public void sendDocument(){
        System.out.println("Send Document through Gmail");
    }
    public void downloadDocument(){
        System.out.println("Download document through Gmail");
    }
}
