package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      Usuarios usuarios = new Usuarios();
      UtilContexto.cargadorContexto(usuarios);
        System.out.println("Introduzca el usuario");
        String usuario = sc.nextLine();
        System.out.println("Introduzca la contraseña");
        String password = sc.nextLine();
        boolean correcto = false;
        for (Login login: usuarios.getLogins()
             ) {
            if (login.password.equals(password) && login.usuario.equals(usuario)){
                correcto = true;
            }

        }
        if(correcto){
            System.out.println("ACCEDO CONCEDIDO");
        }else{
            System.out.println("ACCESO DENEGADO");
        }
    }
}