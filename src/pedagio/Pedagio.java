/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedagio;

import br.newtonpaiva.Veiculo;

/**
 *
 * @author Klecia
 */
public class Pedagio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ctrl + Shift + I
        Veiculo v1 = new Veiculo("HDX6628", 2);
        //v1.setPlaca("HDX6628");
        //v1.setEixos(2);
        Double valor = v1.calcularPedagio();

        System.out.println("Informações do veículo: " + v1);
        System.out.println("Valor cobrado: " + valor);

    }
}
