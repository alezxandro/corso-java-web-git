package src.Giocattolaio.controller;

import java.util.List;

import src.Giocattolaio.model.Cliente;
import src.Giocattolaio.model.Giocattolo;
import src.Giocattolaio.model.Vendita;

public abstract class RegistroVendite {
    public abstract void registraVendita(Giocattolo giocattolo, Cliente cliente);
    public abstract List<Vendita> getVendite();
}
