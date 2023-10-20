package org.example;


public class UtilContexto {
    public static void cargadorContexto(Usuarios usuarios){
        Credenciales CredencialesPadre = usuarios.getClass().getAnnotation(Credenciales.class);
        Credencial[] CredencialesHijo = CredencialesPadre.value();
        for (Credencial credencial: CredencialesHijo
        ) {
            String usuario = credencial.usuario();
            String password = credencial.password();

            usuarios.getLogins().add(new Login(usuario, password));
        }
    }
}
