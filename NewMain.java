package newpackage;

import java.util.*;

public class NewMain {

    
    public static void main(String[] args) {
        CRUD dados=new CRUD();
        Scanner inputOp=new Scanner(System.in); //Recebe entradas do teclado
        int op; //Opção
        
        //MENU
        do{
            System.out.println("___________________________");
            System.out.println("SISTEMA DE DOAÇÕES");
            System.out.println("1.Adicionar doação");
            System.out.println("2.Histórico");
            System.out.println("3.Editar");
            System.out.println("4.Excluir");
            System.out.println("5.Buscar");
            System.out.println("0.Sair");
            System.out.println("Opção:");
            op=inputOp.nextInt();
            System.out.println("___________________________");
            
            switch(op){
            case 1 -> dados.cadastrar();
            case 2 -> dados.ler();
            case 3 -> dados.editar();
            case 4 -> dados.excluir();
            case 5 -> dados.buscar();
            }
            
        }while(op!=0);
    }
    
}
