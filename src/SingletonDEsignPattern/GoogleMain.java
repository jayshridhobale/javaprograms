package SingletonDEsignPattern;

public class GoogleMain {
    public static void main(String[] args) {
        Google g2=Google.Gmail();
        g2.googleDrive();
        g2.googlePhotos();
        Google g3=Google.Gmail();
        System.out.println(g2+"\t"+g3);
    }
}
