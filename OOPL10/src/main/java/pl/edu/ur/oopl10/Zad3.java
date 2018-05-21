package pl.edu.ur.oopl10;
import java.util.Scanner;
public class Zad3 extends java.lang.Exception{
    public void Zad3(){
        Scanner wczytaj = new Scanner(System.in);
        
        System.out.println("Wprowadz liczby : ");
        System.out.println("Dzielnik to /t");
        double dzielnik = wczytaj.nextDouble();
        System.out.println("Dzielna to : /t");
        double dzielna = wczytaj.nextDouble();
        
        try{
            double wynik= dzielna/dzielnik;
            if(dzielnik==0){
                System.out.println("Nie mozna dzielic przez 0");
            }
        }catch(Exception e){
            System.out.println("Nie mozna dzielic przez 0");
        }
        
    }
    
    
}
