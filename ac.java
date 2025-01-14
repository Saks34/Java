class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}

public class ac {
    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age isn ot vbalid");
        }
        else{
            System.out.println("aja bhai");
        }
    }
    public static void main(String[] args){
        try{
            validate(13);
        }
        catch(InvalidAgeException e){
            System.out.println("mil gaya");
            System.out.println("error: "+e);
        }
        System.out.println("rest of the code");
    }
}
