package String;

public class StringDemo4 {
    public static void main(String[] args) {
        String str = "JAVA_SQL_PYTHON_JS";
        String[] arr = str.split("_");
        System.out.println("String value : " + str);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
