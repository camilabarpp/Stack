import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Program {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        Scanner sc = new Scanner(System.in);;

        //Adicionando 1 milhão de elementos
        for (int i = 1; i <= 10; i++)
        {
            s.push(i);
        }

        System.out.println();
        System.out.println("Pilha com tamanho: '" + s.size() + "' elementos!");

        System.out.println("------------------------------------------------");

        //Busca de um elemento
        System.out.println("Qual número você quer buscar? ");
        int a = sc.nextInt();
        System.out.println(s.search(a));

        System.out.println("------------------------------------------------");

        //Inserção no inicio da coleção
        s.add(0, 11);

        //Inserção no final da coleção
        s.push(12);

        //Remoção de um elemento no meio da coleção
        s.removeElement(7);

        System.out.println("Conteúdo da pilha: ");
        Iterator itr = s.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("------------------------------------------------");

        //Remoção de todos elementos  da coleção
        System.out.println();
        System.out.println("Voce quer esvaziar a pilha? (Y/N)? ");
        char clear = sc.next().charAt(0);
        if (clear == 'Y') {
            s.clear();
            System.out.println("Pilha vazia!");
        } else   {
            Iterator aa = s.iterator();
            while(aa.hasNext()) {
                Object element = aa.next();
                System.out.print(element + " ");
            }
        }

        System.out.println();
        System.out.println("------------------------------------------------");

        sc.close();

    }
}
