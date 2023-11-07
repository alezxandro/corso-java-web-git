package src.model;

import java.util.ArrayList;
import java.util.List;

public class RegistroVenditeGiocattoli extends RegistroVendite{

    private List<Vendita> vendite;

    

    public RegistroVenditeGiocattoli() {
        this.vendite = new ArrayList<>();
    }

    @Override
    public void registraVendita(Giocattolo giocattolo, Cliente cliente) {
        if (giocattolo != null && cliente != null) {
            vendite.add(new Vendita(giocattolo.getId(), cliente.getId()));
        }
    }

    @Override
    public List<Vendita> getVendite() {
        return vendite;
    }


}
