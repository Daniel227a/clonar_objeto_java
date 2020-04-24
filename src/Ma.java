import java.util.Scanner;

public class Ma
{
    public static void main(String[]args)
    {

        Scanner teclado=new Scanner(System.in);
        teclado.nextLine();
        System.out.println("digite a idade ");
        int idade=teclado.nextInt();
        teclado.nextLine();
        System.out.println("digite o nome ");
        String nome=teclado.nextLine();
      Pessoa a1= new Pessoa(idade,nome);
        System.out.println(a1.toString());
        Pessoa a2=new Pessoa(a1);
        System.out.println(a2.toString());



    }

}
