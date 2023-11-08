package src.Giocattolaio.model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Giocattolo> giocattoli;

    public Inventario() {
        this.giocattoli = new ArrayList<>();
    }

    public Giocattolo getById(int id) {
        for (Giocattolo giocattolo : giocattoli) {
            if (giocattolo.getId() == id) {
                return giocattolo;
            }
        }

        return null;
    }

    public Giocattolo getByName(String name) {
        for (Giocattolo giocattolo : giocattoli) {
            if (giocattolo.getNome().equals(name)) {
                return giocattolo;
            }
        }

        return null;
    }

    public void addGiocattolo(Giocattolo giocattolo) {
        giocattoli.add(giocattolo);
    } 

    public boolean removeGiocattolo (int id) {
        return giocattoli.removeIf(g -> g.getId() == id);
    }

    public List<Giocattolo> getGiocattoli() {
        return giocattoli;
    }

    
}
