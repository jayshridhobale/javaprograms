package Important;
//write a program to remove a particular character from a given string
public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Remove this character";
        char character = 't';

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != character) {
                output.append(input.charAt(i));
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Removed Character: " + character);
        System.out.println("Output String: " + output.toString());
    }
}


