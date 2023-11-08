package src.Giocattolaio.main;

import src.Giocattolaio.controller.RegistroVenditeGiocattoli;
import src.Giocattolaio.controller.UserController;
import src.Giocattolaio.model.Cliente;
import src.Giocattolaio.model.Giocattolo;
import src.Giocattolaio.model.Inventario;
import src.Giocattolaio.model.Vendita;

public class Test {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        RegistroVenditeGiocattoli registroVendite = new RegistroVenditeGiocattoli(inventario);

        Giocattolo giocattolo1 = new Giocattolo("12345","Lego", 20.0, 5);
        Giocattolo giocattolo2 = new Giocattolo("67890", "Puzzle", 15.0, 8);
        inventario.addGiocattolo(giocattolo1);
        inventario.addGiocattolo(giocattolo2);

        UserController controller = new UserController(inventario, registroVendite);
        controller.menu();
    }
}
