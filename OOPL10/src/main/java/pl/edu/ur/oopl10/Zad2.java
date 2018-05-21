package pl.edu.ur.oopl10;
import java.util.Scanner;
public class Zad2 {
    public static void main(String[] args) {
        int[] tablica = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Który element tablicy wyświetlić?");
        int index = sc.nextInt();
        sc.close();
        try{
            System.out.println(tablica[index]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Podałeś indeks wykraczający poza rozmiar tablicy!");
        }
    }
}
    

