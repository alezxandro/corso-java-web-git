package src.controller;

import java.util.List;

import src.model.Cliente;
import src.model.Giocattolo;
import src.model.Vendita;

public abstract class RegistroVendite {
    public abstract void registraVendita(Giocattolo giocattolo, Cliente cliente);
    public abstract List<Vendita> getVendite();
}
