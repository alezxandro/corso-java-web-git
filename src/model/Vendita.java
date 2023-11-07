package src.model;

public class Vendita {


    private static int idCounter = 1;

    private int id;
    private int idGiocattolo;
    private int idCliente;
    
    public Vendita(int idGiocattolo, int idCliente) {
        this.id = idCounter++;
        this.idGiocattolo = idGiocattolo;
        this.idCliente = idCliente;
    }

    public int getIdGiocattolo() {
        return idGiocattolo;
    }

    public void setIdGiocattolo(int idGiocattolo) {
        this.idGiocattolo = idGiocattolo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Vendita [idGiocattolo=" + idGiocattolo + ", idCliente=" + idCliente + "]";
    }

    
    
    
    
    

    
    
}
