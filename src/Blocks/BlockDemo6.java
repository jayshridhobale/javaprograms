package Blocks;
class Facebook{
    {   // Non-Static Block
        System.out.println("Account Created");
        CreatedProfile();
    }
    void CreatedProfile(){
        System.out.println("Profile Created");
    }
}
public class BlockDemo6 {
    public static void main(String[] args) {

        Facebook f1=new Facebook();
        Facebook f2=new Facebook();
        Facebook f3=new Facebook();

    }
}
