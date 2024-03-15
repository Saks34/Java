interface Innerm{
    void show();
    
}

class n {
    public static void main(String [] args){
        Innerm n = new Innerm() {
            public void show(){
                System.out.println(8);
            }
        };
        n.show();
    }
    
}