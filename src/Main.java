public class Main {
    public static void main(String[] args) {
     String str = "abcdef";
     String[] dividedString = dividedString(str);
        System.out.println(dividedString[0] + "  " + dividedString[1]);
    }
    public static String[] dividedString(String str) {
        String[] result = new String[2];
        if (str.length() % 2 == 0) {
            result[0] = str.substring(0, str.length() / 2);
            result[1] = str.substring(str.length() / 2);
        } else {
            result[0] = str.substring(0, str.length() / 2);
            result[1] = str.substring(str.length() / 2);
        }
        return result;
    }
}
