package SingletonDEsignPattern;

public class Google {
    static Google gmail;
    static int count=0;
    private Google(){
        count++;
    }
    public static Google Gmail(){
        if(count==0){
            gmail=new Google();
        }
        return gmail;
    }
    void googlePhotos(){
        System.out.println("View and Upload Photos");
    }
    void googleDrive(){
        System.out.println("Download And upload document");
    }
}
