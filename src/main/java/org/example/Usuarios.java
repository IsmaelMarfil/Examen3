package org.example;

import java.util.HashSet;
import java.util.Set;

@Credencial(usuario = "usuario1", password ="1234")
@Credencial(usuario = "usuario2", password = "admin.1")
public class Usuarios {
    private Set<Login> logins = new HashSet<>();
    public Usuarios(){}

    public Set<Login> getLogins() {
        return logins;
    }

    public void setLogins(Set<Login> logins) {
        this.logins = logins;
    }
}
