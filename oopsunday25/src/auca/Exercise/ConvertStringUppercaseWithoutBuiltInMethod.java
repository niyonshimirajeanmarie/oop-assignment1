package auca.Exercise;

public class ConvertStringUppercaseWithoutBuiltInMethod {
    public static void main(String[] args) {
        String str = "hello world";
        String upperStr = "";

        for(char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                upperStr += (char)(c - 32);
            } else {
                upperStr += c;
            }
        }

        System.out.println("Uppercase: " + upperStr);
    }
}
