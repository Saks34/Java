class Car {
int wheels,staring,gears;
boolean exaust;
Car(int wheels,int staring,int gears,boolean exaust){
    this.exaust=exaust;
    this.gears=gears;
    this.staring=staring;
    this.wheels=wheels;

}
    void move(){
        System.out.println(wheels);
    }
    void functionality(){
        System.out.println(staring);
        System.out.println(gears);
    }
    void speed(){
        System.out.println(exaust);
    }
}

public class ba {
    public static void main(String[] args){
        Car Tata = new Car(4,1,6,false);
        Tata.move();
        Tata.speed();
        
    }
}
