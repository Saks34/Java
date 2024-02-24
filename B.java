public class B{
    public static void main(String[] args){
        String st = "hello";
        String a = "HELLO";
        String s = "     HELLO    ";
        String b = String.copyValueOf(new char[] {'h','e'});
        System.out.println(st);
        System.out.println(st.codePointBefore(1));
        System.out.println(st.codePointAt(1));
        System.out.println(st.codePointCount(1,5));
        System.out.println(st.compareTo(a));
        System.out.println(st.compareToIgnoreCase(a));
        System.out.println(st.concat(a));
        System.out.println(st.contains(a));
        System.out.println(st.contentEquals(a));
        System.out.println(b);
        System.out.println(st.endsWith(a));
        System.out.println(st.isEmpty());
        System.out.println(st.lastIndexOf(4));
        System.out.println(st.length());
        System.out.println(st.matches(b));
        System.out.println(st.substring(3));
        System.out.println(st.toCharArray());
        System.out.println(st.toLowerCase());
        System.out.println(st.toString());
        System.out.println(st.toUpperCase());
        System.out.println(s.trim());
        System.out.println(String.valueOf(5));
    }
}