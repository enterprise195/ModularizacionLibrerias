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
package org.japo.java.app;

import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author José A. Pacheco Ondoño - japolabs@gmail.com
 */
public class App {

    // Opciones Disponibles
    public static final String OPC1 = "Candidato 1";
    public static final String OPC2 = "Candidato 2";
    public static final String OPC3 = "Candidato 3";
    public static final String OPCB = "Votos en Blanco";
    public static final String OPCN = "Votos Nulos";

    // Mensajes
    public static final String MSG_USR = "Voto actual .....: ";
    public static final String MSG_ERR = "ERROR: Entrada Incorrecta";

    public void launchApp() {
        // Variables
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votosB = 0;
        int votosN = 0;

        // Bucle
        char opcAct;
        do {
            System.out.println("Elección Candidatos");
            System.out.println("===================");
            System.out.printf("[ 1 ] %s - %02d votos%n", OPC1, votos1);
            System.out.printf("[ 2 ] %s - %02d votos%n", OPC2, votos2);
            System.out.printf("[ 3 ] %s - %02d votos%n", OPC3, votos3);
            System.out.println("---");
            System.out.printf("[ B ] %s - %02d votos%n", OPCB, votosB);
            System.out.printf("[ N ] %s - %02d votos%n", OPCN, votosN);
            System.out.println("---");
            System.out.println("[ 0 ] Fin Elección");
            System.out.println("---");

            // Voto actual
            opcAct = UtilesEntrada.obtenerCaracter(MSG_USR, MSG_ERR);

            // Discriminación
            switch (opcAct) {
                case '1':
                    votos1++;
                    break;
                case '2':
                    votos2++;
                    break;
                case '3':
                    votos3++;
                    break;
                case 'b':
                case 'B':
                    votosB++;
                    break;
                case 'n':
                case 'N':
                    votosN++;
            }
        } while (opcAct == '0');

        // Candidato Elegido
        String canEle;

        // Selección
        if (votos1 > votos2) {
            if (votos1 > votos3) {
                canEle = OPC1;
            } else {
                canEle = OPC3;
            }
        } else {
            if (votos2 > votos3) {
                canEle = OPC2;
            } else {
                canEle = OPC3;
            }
        }

        // Resultado
        System.out.printf("El candidato elegido es: %s%n", canEle);
    }
}
