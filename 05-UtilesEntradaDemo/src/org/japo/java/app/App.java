/*
 * Copyright 2020 Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

//Imports

import java.util.Locale;
import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es
 */
public class App {
    
    public static final String MSG_USR_INT = "Entero .....: ";
    public static final String MSG_USR_REA = "Real .......: ";
    public static final String MSG_USR_LOG = "Logico .....: ";
    public static final String MSG_USR_CHAR = "Caracter ...: ";
    public static final String MSG_USR_TXT = "Texto ......: ";
    public static final String MSG_ERR = "ERROR: Entrada Incorrecta";

    public void launchApp() {
        System.out.println("Utiles Entrada Demo");
        System.out.println("===================");
        
        int n = UtilesEntrada.obtenerEntero(MSG_USR_INT, MSG_ERR);
        System.out.printf("%s%d%n", MSG_USR_INT, n);
        
        System.out.println("---");
        
        double d = UtilesEntrada.obtenerReal(MSG_USR_REA, MSG_ERR);
        System.out.printf(Locale.ENGLISH, "%s%.2f%n", MSG_USR_REA, d);
        
        System.out.println("---");
        
        boolean b = UtilesEntrada.obtenerLogico(MSG_USR_LOG, MSG_ERR);
        System.out.printf("%s%b%n", MSG_USR_LOG, b);
        
        System.out.println("---");
        
        char c = UtilesEntrada.obtenerCaracter(MSG_USR_CHAR, MSG_ERR);
        System.out.printf("%s%c%n", MSG_USR_CHAR, c);
        
        System.out.println("---");
        
        String s = UtilesEntrada.obtenerTexto(MSG_USR_TXT);
        System.out.printf("%s%s%n", MSG_USR_TXT, s);
    }
    
}
