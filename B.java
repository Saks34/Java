public class B{
    public static void main(String[] args){
        String st = "hello";
        String a = "HELLO";
        System.out.println(st);
        System.out.println(st.codePointBefore(1));
        System.out.println(st.codePointAt(1));
        System.out.println(st.codePointCount(1,5));
        System.out.println(st.compareTo(a));
        System.out.println(st.compareToIgnoreCase(a));
        System.out.println(st.concat(a));
    }
}