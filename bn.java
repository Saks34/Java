class Area{
private int length;

void set(int length){
    this.length = length;
}
void print(){
    System.out.println(length);
}
}

public class bn {
    public static void main(String[] args){
        Area a = new Area();
        a.set(25);
        a.print();
    }
}
