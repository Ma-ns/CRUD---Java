package newpackage;


public class Pessoa {
    private String nome;
    private String email;
    private float valor; //Valor monetário da doação

    //Método Construtor
    public Pessoa(String nome, String email, float valor) {
        this.nome = nome;
        this.email = email;
        this.valor = valor;
    }

    //GETS E SETS
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "|Email: " + email + "| Valor: " + valor;
    }
    
    
    
    
}
