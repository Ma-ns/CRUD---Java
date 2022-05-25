package newpackage;


public class PF extends Pessoa{
    private String cpf;

    //Método Construtor
    public PF(String nome, String email, String cpf, float valor) {
        super(nome, email, valor);
        this.cpf = cpf;
    }
    
    //GET E SET
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return(super.toString()+"|CPF: "+cpf);
    }
    
}
