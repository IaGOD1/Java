public class Produto {
    private String nome;
    private double peso;
    private double preco;
    
    // Construtor padrão
    public Produto() {
        this.nome = "";
        this.peso = 0.0;
        this.preco = 0.0;
    }
    
    // Construtor com parâmetros
    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }
    
    // Getter para o nome
    public String getNome() {
        return nome;
    }
    
    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter para o peso
    public double getPeso() {
        return peso;
    }
    
    // Setter para o peso
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    // Getter para o preço
    public double getPreco() {
        return preco;
    }
    
    // Setter para o preço
    public void setPreco(double preco) {
        this.preco = preco;
    }
}