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

    public static final double N1 = 3.6;
    public static final double N2 = 7.4;
    
    public void launchApp() {
        System.out.println("CÁLCULO MEDIA ARITMÉTICA");
        System.out.println("========================");
        
        System.out.printf(Locale.ENGLISH, "Número 1 .........: %.1f%n", N1);
        System.out.printf(Locale.ENGLISH, "Número 2 .........: %.1f%n", N2);
        
        //Separador
        System.out.println("---");
        
        //Llamada al metodo para calcular la media
        double media = UtilesPrimitivos.calcularMedia(N1, N2);
        
        //Resultado media
        System.out.printf(Locale.ENGLISH, "Media aritmética .: %.1f%n", media);
    }
    
}
