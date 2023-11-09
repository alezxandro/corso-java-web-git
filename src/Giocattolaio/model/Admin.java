package src.Giocattolaio.model;

public class Admin extends User {
    private String password;

    
    public Admin(String nome, String email, String password) {
        super(nome, email);
        this.password = password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin [id=" + getId() + ", nome=" + getNome() + ", email=" + getEmail() + "]";
    }
    
}
