package src.Giocattolaio.model;

public class Giocattolo {

    private static int idCounter = 1;

    private int id;
    private String codiceModello;
    private String nome;
    private double prezzo;
    private int etaConsigliata;
    private boolean disponibile;

    

    public Giocattolo(String codiceModello, String nome, double prezzo, int etaConsigliata) {
        this.codiceModello = codiceModello;
        this.id = idCounter++;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
        this.disponibile = true;
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
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public int getEtaConsigliata() {
        return etaConsigliata;
    }
    public void setEtaConsigliata(int etaConsigliata) {
        this.etaConsigliata = etaConsigliata;
    }
    public boolean isDisponibile() {
        return disponibile;
    }
    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
    public String getCodiceModello() {
        return codiceModello;
    }
    public void setCodiceModello(String codiceModello) {
        this.codiceModello = codiceModello;
    }

    @Override
    public String toString() {
        return "Giocattolo [id=" + id + ", codiceModello=" + codiceModello + ", nome=" + nome + ", prezzo=" + prezzo
                + ", etaConsigliata=" + etaConsigliata + ", disponibile=" + disponibile + "]";
    }

    

    

}
