package pl.edu.ur.oopl10;
public class Zad3_T {
    public void Zad3_T(){
    Zad3 Throw = new Zad3();
    try{
        Throw.Zad3();
        System.out.println("Klasa przechwycila i obsluzyla wyjatek (ArithmeticException)");
    }catch(ArithmeticException e){
        System.out.println("Poprzednia klasa nie przechwycila wyjatku (ArithmeticException)");
    
    }
}
}