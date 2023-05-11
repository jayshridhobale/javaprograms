package Variables;
 class Demo{     //in one file having buisness class and have another class havoing main method that is explicit classloading
        static String batchCode="1CCM24";     //one time loading
        void markAttendance(String s_name){

            System.out.println("BatchCode is :"+batchCode);
            System.out.println(s_name +   " Your Attendance was Successfully");
        }
    }
public class ExplicitClassLoading {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.markAttendance("Jayshri");

    }
}
