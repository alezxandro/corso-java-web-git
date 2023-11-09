package src.Giocattolaio.model;

public class User {
    private static int idCounter = 1;

    private int id;
    private String nome;
    private String email;

    public User(String nome, String email) {
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

    
    

    
}
