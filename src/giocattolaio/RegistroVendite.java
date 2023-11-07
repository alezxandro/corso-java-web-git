package src.giocattolaio;

import java.util.List;

public abstract class RegistroVendite {
    public abstract void registraVendita(Giocattolo giocattolo, Cliente cliente);
    public abstract List<Vendita> getVendite();
}
