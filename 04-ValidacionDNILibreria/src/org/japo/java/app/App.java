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

import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es
 */
public class App {

    public static final int DNI_NUM = 12345678;
    public static final char DNI_CTR = 'Z';
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    public static final String MSG_DNI = "DNI ......: ";
    public static final String MSG_VAL = "Validez ..: ";
    
    public void launchApp() {
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");
        
        System.out.printf("%s%08d%c%n", MSG_DNI, DNI_NUM, DNI_CTR);
        
        //Separador
        System.out.println("---");
        
        boolean validacionDni = UtilesPrimitivos.validar(DNI_NUM, DNI_CTR);
        
        switch (validacionDni) {
            case true:
                System.out.printf("%sCoreccto", MSG_VAL);
                break;
            case false:
                System.out.printf("%sIncorrecto", MSG_VAL);
        }
    }
    
}
