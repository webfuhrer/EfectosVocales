/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.efectosvocales;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
       String texto=AccesoFichero.devolverTexto();
       String texto_limpio=tratarTexto(texto);
       String[] lista_palabras=texto_limpio.split(" ");
       char letra=EntradaSalida.pedirLetra();
       char[] vocales={'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};
       for(int i=0; i<lista_palabras.length;i++)
       {
        int numero_vocales=0;
        String p=lista_palabras[i];  
        if (p.contains(String.valueOf(letra)))
        {
           for(int indice_vocal=0; indice_vocal<vocales.length-5; indice_vocal++)
           {
               char vocal=vocales[indice_vocal];
               char vocal_acentuada=vocales[indice_vocal+5];
               if (p.contains(String.valueOf(vocal))  ||   p.contains(String.valueOf(vocal_acentuada)))
               {
                   //contiene esa vocal
                   numero_vocales++;
                   if (numero_vocales>1){break;}
               }
               
           }
           //Condicional para ver cual vale y cual no
           if (numero_vocales==1)
           {
               System.out.println(p);
           }
        }
       }
       
        
    }
      private static String tratarTexto(String texto) {
        char[] caracteres_eliminables={'"','(',')', '.', ',', ';', '?', '¿', '!','¡', ':'};
        for(char x: caracteres_eliminables)
        {
            texto=texto.replace(String.valueOf(x),"" );
        }
        //
        return texto.toLowerCase();
    }
}
