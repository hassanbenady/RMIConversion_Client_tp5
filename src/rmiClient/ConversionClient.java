package rmiClient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            // ii. chercher la reference de l'objet distant dans le RMIRegistry
            IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/ConversionService");

            // iii. invoquer convertirMontant(500)
            double resultat = stub.convertirMontant(500);
            System.out.println("500 EUR = " + resultat + " TND");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
