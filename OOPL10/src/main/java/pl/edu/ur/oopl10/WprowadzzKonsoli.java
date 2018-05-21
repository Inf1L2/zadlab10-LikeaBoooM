package pl.edu.ur.oopl10;
import java.util.Scanner;
public class WprowadzzKonsoli {
    
    Scanner wczytaj;

    public WprowadzzKonsoli() {
        wczytaj=new Scanner(System.in);
    }
    
    
    
    public void WprowadzInt(){
        try{
           int thing = wczytaj.nextInt();
        }catch(Exception e){
            System.out.println("Wprowadzono zly typ danych !");
        }
    }
    
    public void WprowadzChar(){
        try{
            String thing =wczytaj.nextLine();
            if(thing.length()>1){
                throw new Exception("Wprowadzono zly typ danych !"); 
            }
        }catch(Exception e){
            System.out.println("");
            
        }
    }
    public void WprowadzFloat(){
        try{
           float thing = wczytaj.nextFloat();
        }catch(Exception e){
            System.out.println("Wprowadzono zly typ danych !");
            System.out.println("Zbyt dyza ilosc znakow");
        }
    }
    public void WprowadzString(){
        try{
           String thing = wczytaj.nextLine();
        }catch(Exception e){
            System.out.println("Wprowadzono zly typ danych !");
            System.out.println("Zbyt dyza ilosc znakow");
        }
    }
    public void WprowadzLong(){
        try{
           long thing = wczytaj.nextLong();
        }catch(Exception e){
            System.out.println("Wprowadzono zly typ danych !");
            System.out.println("Zbyt dyza ilosc znakow");
        }
    }
    public void WprowadzShort(){
        try{
           short thing = wczytaj.nextShort();
        }catch(Exception e){
            System.out.println("Wprowadzono zly typ danych !");
            System.out.println("Zbyt dyza ilosc znakow");
        }
    }
    public void WprowadzDouble(){
        try{
           double thing = wczytaj.nextDouble();
        }catch(Exception e){
            System.out.println("Wprowadzono zly typ danych !");
            System.out.println("Zbyt dyza ilosc znakow");
        }
    }
   
}
