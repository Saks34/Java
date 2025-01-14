class Gene<X>{
    <T> Gene(T t){
        System.out.println(t);
    }
}

public class al {
    public static void main(String[] args){
        Gene<String> g= new Gene<>("helloo");
    }
}
