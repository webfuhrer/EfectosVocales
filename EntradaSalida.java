/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.efectosvocales;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
class EntradaSalida {

    static char pedirLetra() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introsuzca la vocal");
        String letra=sc.nextLine();
        char caracter_letra=letra.charAt(0);
        return caracter_letra;
    }
    
}
