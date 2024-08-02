public class vowelcheck {
    public static void main(String[]args) {
        String inputString = "Hello World";
        boolean hasVowel = containsVowel(inputString);

        if (hasVowel) {

            System.out.println("The string contains at least one vowel:");
        } else {
            System.out.println("The string  does not contains any vowel:");
        }
    }
    public static boolean containsVowel(String input){
        input=input.toLowerCase();

        for (int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
            }
        }

