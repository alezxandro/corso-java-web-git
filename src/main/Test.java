package src.main;

import src.controller.UserController;
import src.model.Inventario;
import src.controller.RegistroVenditeGiocattoli;
import src.model.Giocattolo;
import src.model.Cliente;
import src.model.Vendita;

public class Test {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        RegistroVenditeGiocattoli registroVendite = new RegistroVenditeGiocattoli(inventario);

        Giocattolo giocattolo1 = new Giocattolo("Lego", 20.0, 5);
        Giocattolo giocattolo2 = new Giocattolo("Puzzle", 15.0, 8);
        inventario.addGiocattolo(giocattolo1);
        inventario.addGiocattolo(giocattolo2);

        UserController controller = new UserController(inventario, registroVendite);
        controller.avviaInterfacciaUtente();
    }
}
