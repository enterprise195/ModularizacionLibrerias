/*
 * Copyright 2020 José A. Pacheco Ondoño - japolabs@gmail.com.
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
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author José A. Pacheco Ondoño - japolabs@gmail.com
 */
public class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final double obtenerDouble(String msgUsr, String msgErr) {
        double numero = 0;
        boolean entradaOK = false;
        
        do {
            try {
                System.out.print(msgUsr);
                numero = SCN.nextDouble();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return numero;
    }

    public static final int obtenerEntero(String msgUsr, String msgErr) {
        return (int) obtenerDouble(msgUsr, msgErr);
    }

    public static char obtenerCaracter(String MSG_USR, String MSG_ERR) {
    }
}
