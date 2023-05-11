package ExtraCode;

public class FirstNonReapatingCharacter {
    public static void main(String[] args) {
        String str="aabcdee";
        for (int i=0;i<str.length();i++){
            boolean status=true;
            for (int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    status=false;

                }
            }
            if(status){
                System.out.println(str.charAt(i));
                break;
            }
        }

    }
}
