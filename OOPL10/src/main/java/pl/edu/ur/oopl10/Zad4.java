package pl.edu.ur.oopl10;
import java.util.Random;

public class Zad4 {
    public void Zad4(){
        Random random = new Random();
        int i = 0 ;
        do{
            int first = random.nextInt(21)- 10;
            int second = random.nextInt(21)- 10;
            int wynik;
        try{
            wynik= first/second;
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException (dzielenie przez zero)");
        }
        i++;
        }
        while(i!=3);
        
    }
}
