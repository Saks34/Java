import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}

public class ai {
    public static void main(String [] args) throws ClassNotFoundException{
        Person p = new Person("abc", 41);
        try{
            FileOutputStream fileOut = new FileOutputStream("p.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(p);
            objOut.close();
            fileOut.close();
            System.out.println("Object serialized");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Person d = null;
        try{
            FileInputStream fileIn = new FileInputStream("p.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            d = (Person) objIn.readObject();
            objIn.close();
            fileIn.close();
            System.out.println("deserialized");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        if(d !=  null){
            System.out.println(d.getName()+d.getAge());
        }
    }
    
}