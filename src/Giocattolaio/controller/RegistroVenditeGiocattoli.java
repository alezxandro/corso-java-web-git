package src.Giocattolaio.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import src.Giocattolaio.model.Cliente;
import src.Giocattolaio.model.Giocattolo;
import src.Giocattolaio.model.Inventario;
import src.Giocattolaio.model.Vendita;

public class RegistroVenditeGiocattoli extends RegistroVendite{

    private List<Vendita> vendite;
    private Inventario inventario;

    public RegistroVenditeGiocattoli(Inventario inventario) {
        this.inventario = inventario;
        this.vendite = new ArrayList<>();
    }

    @Override
    public void registraVendita(Giocattolo giocattolo, Cliente cliente) {
        if (giocattolo != null && cliente != null && giocattolo.isDisponibile()) {
            int giocattoloId = giocattolo.getId();
            int clienteId = cliente.getId();
            if (inventario.getById(giocattoloId) != null) {
                vendite.add(new Vendita(giocattoloId, clienteId));
                giocattolo.setDisponibile(false);
            }
            else {
                System.out.println("Giocattolo non disponibile nell'inventario");
            }
        }
    }

    @Override
    public List<Vendita> getVendite() {
        return vendite;
    }

    public List<Vendita> getVenditeCliente(Cliente cliente) {
        List<Vendita> venditeCliente = new ArrayList<>();
        for (Vendita vendita : vendite) {
            if (vendita.getIdCliente() == cliente.getId()) {
                venditeCliente.add(vendita);
            }
        }
        return venditeCliente;
    }

    public void registraGiocattolo(Giocattolo giocattolo) {
        if (giocattolo != null) {
            inventario.addGiocattolo(giocattolo);
        }
    }
    
    public void registraGiocattolo (String codiceModello, String nome, double prezzo, int etaConsigliata) {
        Giocattolo giocattolo = new Giocattolo(codiceModello, nome, prezzo, etaConsigliata);
        registraGiocattolo(giocattolo);
        
    }


}
