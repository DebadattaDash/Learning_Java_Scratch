package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 1234567890l;
        //short s = phone_no; //Implicit Narrow?
        short s1 = (short)phone; //explicit narrow?
    }
}
