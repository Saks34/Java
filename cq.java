public class cq {
    public static String swapCase(String str) {
        String result = "";
        
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch; 
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        String a = "kHfwefew";
        System.out.println(swapCase(a));
    }
}
