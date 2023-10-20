package org.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Credenciales.class)
public @interface Credencial {
    String usuario();
    String password();
}
