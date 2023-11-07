package src.giocattolaio;

public class Cliente {

    private static int idCounter = 1;

    private int id;
    private String nome;
    private String email;

    

    public Cliente(String nome, String email) {
        this.id = idCounter++;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }

    

    
}
