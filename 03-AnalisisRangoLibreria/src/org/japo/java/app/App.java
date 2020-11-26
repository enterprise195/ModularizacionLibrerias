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
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es
 */
public class App {

    public static final int RANGE_IN = 0;
    public static final int RANGE_BELOW = 1;
    public static final int RANGE_ABOVE = 2;
    
    public static final double NUM = 51.0;
    public static final double MIN = 1;
    public static final double MAX = 10;
    
    public static final String MSG_NUM = "Número ......: ";
    public static final String MSG_MIN = "Mínimo ......: ";
    public static final String MSG_MAX = "Máximo ......: ";
    public static final String MSG_FIN = "Análisis ....: ";
    
    public static final String MSG_BELOW = "FUERA ( Abajo )";
    public static final String MSG_ABOVE = "FUERA ( Arriba )";
    public static final String MSG_IN = "DENTRO";

    public void launchApp() {
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");

        System.out.printf(Locale.ENGLISH, "%s%4.1f%n", MSG_NUM, NUM);
        
        //Separador
        System.out.println("---");
        
        System.out.printf(Locale.ENGLISH, "%s%4.1f%n", MSG_MIN, MIN);
        System.out.printf(Locale.ENGLISH, "%s%4.1f%n", MSG_MAX, MAX);
        
        //Separador
        System.out.println("---");
        
        //Llamada metodo
        int rango = UtilesPrimitivos.analizarRango(NUM, MIN, MAX);
        
        switch (rango) {
            case RANGE_BELOW:
                System.out.printf("%s%s%n", MSG_FIN, MSG_BELOW);
                break;
            case RANGE_ABOVE:
                System.out.printf("%s%s%n", MSG_FIN, MSG_ABOVE);
                break;
            default:
                System.out.printf("%s%s%n", MSG_FIN, MSG_IN);
        }
    }

}
