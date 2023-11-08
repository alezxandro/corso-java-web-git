package src.Giocattolaio.controller;

import java.util.Scanner;

import src.Giocattolaio.model.Cliente;
import src.Giocattolaio.model.Giocattolo;
import src.Giocattolaio.model.Inventario;
import src.Giocattolaio.model.Vendita;

public class UserController {
    private Inventario inventario;
    private RegistroVendite registroVendite;
    private static Scanner scanner = new Scanner(System.in);

    public UserController(Inventario inventario, RegistroVendite registroVendite) {
        this.inventario = inventario;
        this.registroVendite = registroVendite;
    }

    public void menu() {
        int scelta;

        do {
            scelta = userInterfaceOption();

            switch (scelta) {
                case 1:
                    aggiungiGiocattolo();
                    break;
                case 2:
                    registraVendita();
                    break;
                case 3:
                    visualizzaVendite();
                    break;
                case 4:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 4);
    }

    private int userInterfaceOption() {
        int scelta;

        do {
            System.out.println("Menu utente:");
            System.out.println("1. Aggiungi giocattolo all'inventario");
            System.out.println("2. Registra vendita");
            System.out.println("3. Visualizza vendite");
            System.out.println("4. Uscita");
            System.out.print("Inserisci scelta: ");

            scelta = scanner.nextInt();
        } while (scelta < 1 || scelta > 4);

        return scelta;
    }

    private void aggiungiGiocattolo() {

        scanner.nextLine(); // clear buffer


        System.out.println("Inserisci il codice del modello del giocattolo: ");
        String codiceModello = scanner.nextLine();
        System.out.println("Inserisci il nome del giocattolo:");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il prezzo del giocattolo:");
        double prezzo = scanner.nextDouble();
        System.out.println("Inserisci l'età consigliata per il giocattolo:");
        int etaConsigliata = scanner.nextInt();

        Giocattolo nuovoGiocattolo = new Giocattolo(codiceModello, nome, prezzo, etaConsigliata);
        inventario.addGiocattolo(nuovoGiocattolo);

        System.out.println("Giocattolo aggiunto all'inventario con successo.");
    }

    private void registraVendita() {

        scanner.nextLine(); // clear buffer

        System.out.println("Inserisci il nome del giocattolo venduto:");
        String nomeGiocattolo = scanner.nextLine();
        Giocattolo giocattolo = inventario.getByName(nomeGiocattolo);

        if (giocattolo == null) {
            System.out.println("Il giocattolo non è disponibile nell'inventario.");
            return;
        }

        System.out.println("Inserisci il nome del cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Inserisci l'indirizzo email del cliente:");
        String emailCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, emailCliente);

        registroVendite.registraVendita(giocattolo, cliente);
        System.out.println("Vendita registrata con successo.");
    }

    public void visualizzaVendite() {
        System.out.println("Vendite: ");

        for (Vendita vendita : registroVendite.getVendite()) {
            System.out.println(vendita);
        }
    }
}
