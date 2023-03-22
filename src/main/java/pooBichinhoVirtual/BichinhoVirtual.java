package pooBichinhoVirtual;


public class BichinhoVirtual {
    private String nome;
    private float fome;
    private int saude;
    private int idade;
    
    public BichinhoVirtual(String nome, float fome, int saude, int idade){
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getFome() {
        return fome;
    }

    public void setFome(float fome) {
        this.fome = fome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float humor (){
        return getFome() * getSaude();
    }
    public void alimenta(float quantidade){
        if((quantidade >= 0) && (quantidade <= 100)){
        this.fome = this.fome - (this.fome * (quantidade/100.0f));
        }
    }
    public void brincar(int quantidade){
        if((quantidade >= 0) && (quantidade <= 100)){
            this.saude += this.saude * (quantidade/100.0f);
        }
    }
    public String str(){
        return "Bichinho[nome = " +nome+ ", fome = " +fome+ ", saúde = " +saude+ ", idade = " +idade+ "]";
    }

    void bricar(int brinquedo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

