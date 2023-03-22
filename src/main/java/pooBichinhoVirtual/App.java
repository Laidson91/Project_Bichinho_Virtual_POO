package pooBichinhoVirtual;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
       Random aleatorio = new Random();
       
       BichinhoVirtual a = new BichinhoVirtual("Cachorro", aleatorio.nextInt(10), 
               aleatorio.nextInt(10),5);
       BichinhoVirtual b = new BichinhoVirtual("Gato", aleatorio.nextInt(10), 
       aleatorio.nextInt(10), 5);
       BichinhoVirtual c = new BichinhoVirtual("Coelho", aleatorio.nextInt(10),
       aleatorio.nextInt(10), 5);
       
       ArrayList<BichinhoVirtual> Fazenda = new ArrayList();
       Fazenda.add(a);
       Fazenda.add(b);
       Fazenda.add(c);
       
       Scanner teclado = new Scanner (System.in);
       int op;
       int alimento, brinquedo;
       
       while(true){
           System.out.println("::: Fazenda :::");
           System.out.println("1 - Alimentar todos os bichos");
           System.out.println("2 - Brincar com todos os bichos");
           
           System.out.println("3 - Ouvir todos os bichos");
           System.out.println("4 - Sair");
           op = teclado.nextInt();
           
           if (op == 1){
               System.out.println("Alimentar todos com: ");
               alimento = teclado.nextInt();
               for(int i= 0; i <= 2; i++)
                   Fazenda.get(i).alimenta(alimento);
           }
           else if (op == 2){
               System.out.println("Brincar com todos com: ");
               brinquedo = teclado.nextInt();
               for(int i = 0; i <= 2; i++)
                   Fazenda.get(i).bricar(brinquedo);
           }
           else if(op == 3){
               for(int i = 0; i <= 2; i++){
                   System.out.println(Fazenda.get(i).str());
                   System.out.println(Fazenda.get(i).getNome() + ": " + Fazenda.get(i).humor());
               }
               }
               else if(op == 4)
                       break;
                     
           
       }
       
       
    }
}






