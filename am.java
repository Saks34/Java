class gene<T>{
    private T data;

    public gene(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

    public static <E> void printArray(E[] array){
        for(E e: array){
            System.out.print(e +" ");
        }
        System.out.println();
    }

    public <E> boolean isEqualTo(gene<E> other){
        return this.data.equals(other.getData());
    }
}

public class am {
    public static void main(String[] args){
        gene<Integer> i = new gene<>(10);

        System.out.println(i.getData());

        gene<String> s = new gene<>("hello");
        System.out.println(s.getData());

        Integer[] a = {1,2,3,4,5};
        gene.printArray(a);

        String[] b ={"hkijvrbhf","kihvwebfuiw","hvb druibfguu"};
        gene.printArray(b);


    }
}
