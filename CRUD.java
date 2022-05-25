package newpackage;

import java.util.*; //Importa tanto o Scanner como o Framework Collections

public class CRUD {
    //Declara duas coleções de Arrays para doador pf e pj
    Collection<PF> doadoresPF=new ArrayList<>(); 
    Collection<PJ> doadoresPJ=new ArrayList<>();
    //Declara um Scanner para Strings e um para Numeros(evita erro)
    Scanner inputStr=new Scanner(System.in);
    Scanner inputInt=new Scanner(System.in);
    String tp_doc; //Tipo de Documento(CPF, CPNJ)
    
    //CADASTRAR
    public void cadastrar(){ 
        //Declara dados base
        String nome,email,documento;
        float valor;
        
        //Separa em qual das coleções os dados serão salvos(PF,PJ)
        System.out.println("Informe o tipo de entidade(1.Pessoa Física 2.Pessoa Juridica):");
        int op=inputInt.nextInt();
        
        switch(op){
        case 1: //CPF
            System.out.println("Informe o nome do doador:");
            nome=inputStr.nextLine();
            System.out.println("Informe o email:");
            email=inputStr.nextLine();
            System.out.println("Informe o CPF:");
            documento=inputStr.nextLine();
            System.out.println("Informe o valor a ser doado:");
            valor=inputInt.nextFloat();
            
            PF doadorPF=new PF(nome,email,documento,valor); //Formata dados dentro do objeto
            doadoresPF.add(doadorPF); //Armazena novo cadastro na coleção
            
            System.out.println("___________________________");
            System.out.println("Cadastro Concluído");
            
            break;
            
        case 2: //CNPJ
            System.out.println("Informe o nome do doador:");
            nome=inputStr.nextLine();
            System.out.println("Informe o email:");
            email=inputStr.nextLine();
            System.out.println("Informe o CNPJ:");
            documento=inputStr.nextLine();
            System.out.println("Informe o valor a ser doado:");
            valor=inputInt.nextFloat();
            
            PJ doadorPJ=new PJ(nome,email,documento,valor); //Formata dados dentro do objeto
            doadoresPJ.add(doadorPJ); //Armazena novo cadastro na coleção
            
            System.out.println("___________________________");
            System.out.println("Cadastro Concluído");
            
            break;
        }
        
    }
    
    //LISTAR
    public void ler(){
        System.out.println("DOAÇÔES FEITAS POR PESSOAS FÌSICAS");
        
        Iterator<PF> i=doadoresPF.iterator(); //Cria objeto iterador para escanear coleção
        
        while(i.hasNext()){ //Enquanto coleção possui mais dados na lista{}
            PF temp=i.next(); //temp armazena o elemento atual lido pelo iterador
            System.out.println(temp.toString());
        }
        System.out.println("___________________________");
        System.out.println("DOAÇÔES FEITAS POR PESSOAS JURIDICAS");
        
        Iterator<PJ> n=doadoresPJ.iterator(); //Cria objeto iterador para escanear coleção
        
        while(n.hasNext()){
            PJ temp=n.next();
            System.out.println(temp.toString());
        }
        
    }
    
    //EDITAR
    public void editar(){
        String nome;
        String nomeT,email,documento;
        float valor;
        int op;
        boolean achado=false;
        
        System.out.println("Informe o tipo de entidade(1.Pessoa Física 2.Pessoa Juridica):");
        op=inputInt.nextInt();
        System.out.println("Informe o nome do doador:");
        nome=inputStr.nextLine();
        
        switch(op){
        case 1: //PF
            Collection<PF> listaTemp=new ArrayList<>(); //Lista temporária onde as informações serão reescritas
            Iterator<PF> i=doadoresPF.iterator(); //Cria objeto iterador para escanear coleção
        
            while(i.hasNext()){ //Enquanto coleção possui mais dados na lista{}
                PF temp=i.next(); //temp armazena o elemento atual lido pelo iterador
                
                if(temp.getNome().equals(nome)){ //Equals checa se a String lida pelo iterador é EXATAMENTE igual a String procurada
                    System.out.println("___________________________");
                    System.out.println("Informe o novo nome do doador:");
                    nomeT=inputStr.nextLine();
                    System.out.println("Informe o novo email:");
                    email=inputStr.nextLine();
                    System.out.println("Informe o novo CPF:");
                    documento=inputStr.nextLine();
                    System.out.println("Informe o novo valor a ser doado:");
                    valor=inputInt.nextFloat();
            
                    PF dados=new PF(nomeT,email,documento,valor);
                    listaTemp.add(dados);
                    achado=true;
                }
                else{
                    listaTemp.add(temp);  
                }
                doadoresPF=listaTemp;
            }
            
            if(!achado){
                System.out.println("ERRO: Doação não encontrada.");
            }
             
            System.out.println("___________________________");
            System.out.println("Edição Concluida");  
            
            break;
        
        case 2: //PJ
            Collection<PJ> listaTempa=new ArrayList<>();
            Iterator<PJ> n=doadoresPJ.iterator(); //Cria objeto iterador para escanear coleção
        
            while(n.hasNext()){
                PJ temp=n.next();
                
                if(temp.getNome().equals(nome)){
                    System.out.println("___________________________");
                    System.out.println("Informe o novo nome do doador:");
                    nomeT=inputStr.nextLine();
                    System.out.println("Informe o novo email:");
                    email=inputStr.nextLine();
                    System.out.println("Informe o novo CPF:");
                    documento=inputStr.nextLine();
                    System.out.println("Informe o novo valor a ser doado:");
                    valor=inputInt.nextFloat();
            
                    PJ dados=new PJ(nomeT,email,documento,valor);
                    listaTempa.add(dados);
                    achado=true;
                }
                else{
                    listaTempa.add(temp);  
                }
                doadoresPJ=listaTempa;
            }
            
            if(!achado){
                System.out.println("ERRO: Doação não encontrada.");
            }
             
            System.out.println("___________________________");
            System.out.println("Edição Concluida"); 
            
            break;
        }                
    }
    
    //EXCLUIR
    public void excluir(){
        String nome;
        int op;
        boolean achado=false;
        
        System.out.println("Informe o tipo de entidade(1.Pessoa Física 2.Pessoa Juridica):");
        op=inputInt.nextInt();
        System.out.println("Informe o nome do doador:");
        nome=inputStr.nextLine();
        
        switch(op){
        case 1: //PF
            Iterator<PF> i=doadoresPF.iterator(); //Cria objeto iterador para escanear coleção
        
            while(i.hasNext()){ //Enquanto coleção possui mais dados na lista{}
                PF temp=i.next(); //temp armazena o elemento atual lido pelo iterador
                if(temp.getNome().equals(nome)){
                    i.remove();
                    achado=true;
                    
                    System.out.println("___________________________");
                    System.out.println("Exclusão Concluída");
                }
            }
            
            if(!achado){
                System.out.println("ERRO: Doação não encontrada.");
            }
                
            break;
        
        case 2: //PJ
            Iterator<PJ> n=doadoresPJ.iterator(); //Cria objeto iterador para escanear coleção
        
            while(n.hasNext()){
                PJ temp=n.next();
                if(temp.getNome().equals(nome)){
                    n.remove();
                    achado=true;
                    
                    System.out.println("___________________________");
                    System.out.println("Exclusão Concluída");
                }
            }
            
            if(!achado){
                System.out.println("ERRO: Doação não encontrada.");
            }
            
            break;
        } 
    }
    
    //BUSCAR
    public void buscar(){
      String nome;
        int op;
        boolean achado=false;
        
        System.out.println("Informe o tipo de entidade(1.Pessoa Física 2.Pessoa Juridica):");
        op=inputInt.nextInt();
        System.out.println("Informe o nome do doador:");
        nome=inputStr.nextLine();
        
        switch(op){
        case 1: //PF
            Iterator<PF> i=doadoresPF.iterator(); //Cria objeto iterador para escanear coleção
        
            while(i.hasNext()){ //Enquanto coleção possui mais dados na lista{}
                PF temp=i.next(); //temp armazena o elemento atual lido pelo iterador
                if(temp.getNome().equals(nome)){
                    System.out.println("___________________________");
                    System.out.println(temp.toString());
                    
                    achado=true;
                }
            }
            
            if(!achado){
                System.out.println("ERRO: Doação não encontrada.");
            }
                
            break;
        
        case 2: //PJ
            Iterator<PJ> n=doadoresPJ.iterator(); //Cria objeto iterador para escanear coleção
        
            while(n.hasNext()){
                PJ temp=n.next();
                if(temp.getNome().equals(nome)){
                   System.out.println("___________________________");
                   System.out.println(temp.toString());
                   
                   achado=true;
                }
            }
            
            if(!achado){
                System.out.println("ERRO: Doação não encontrada.");
            }
            
            break;
        }  
    }
}
