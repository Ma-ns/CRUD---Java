package newpackage;


public class PJ extends Pessoa{
    private String cnpj;

    //Método Construtor
    public PJ(String nome, String email, String cnpj, float valor) {
        super(nome, email, valor);
        this.cnpj = cnpj;
    }

    //GET E SET
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return(super.toString()+"|CNPJ: "+cnpj);
    }
    
    
    
    
    
}
