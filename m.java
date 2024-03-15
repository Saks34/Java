abstract class Innerm {
    abstract void show();
    
}

class m {
    public static void main(String [] args){
        Innerm n = new Innerm() {
            void show(){
                System.out.println(8);
            }
        };
        n.show();
    }
    
}