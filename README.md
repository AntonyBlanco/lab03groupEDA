# lab03groupEDA
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Estructuras de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Pilas y Colas</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>03</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN:</td><td>05-Jun-2022</td><td colspan="2">HORA DE PRESENTACIÓN:</td><td>11:55</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Blanco Trujillo, Antony Jacob</li>
        <li>Checalla Soto, Edisson Franklin</li>
        <li>Vilca Suelo, Gionvanni Gabriel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</table>

#
<div align="center">
    <span style="font-weight:bold;"><h2>I. SOLUCIÓN Y RESULTADOS </h2></span>
</div>

#
## SOLUCIÓN DE EJERCICIOS/PROBLEMAS

#
### Ejercicio 1: PILAS IGUALES

-   ¿Como puedo compilar este ejercicio correctamente en mi pc?

Despúes de clonar este repositorio, para poder ejecutar este ejercicio en particular es recomendable que se ejecute desde el IDE eclipse, pues su desarrollo se dio en este,y por ello mismo es que se subieron tambien los archivos necesarios para ejecutarse ahí. habiendo cumplido estas instrucciones solo necesita ejecutar el archivo "PilasIguales.java". Iniciada la compilación es bastante intuitiva de seguir, ya que el programa le indicara que es lo que tiene que hacer.

-   Enlace a código en GitHub (solo código): https://github.com/AntonyBlanco/lab03groupEDA/blob/main/Ejercicio1/src/PilasIguales.java

-   Introducción a la Resolución

Basicamente para este ejercicio haremos uso de vectores unidimensionales para tomar nota (listar) de los elementos que agregaremos a las pilas, esto es beneficioso porque así lograremos tener un mejor manejo de las alturas de los cilindros, ya que las pilas (stacks de Java) por si solas no ayudan con ese proposito, esto, siempre y cuando solo usemos sus metodos netos, porque si usásemos metodos que hereda de la clase vector de Java no requeriríamos de arreglos.

-   Parte 1:

Bien, para empezar vamos a instanciar objetos de la clase pila, tres para ser precisos, en estos se apilaran los cilindros (lineas 11 a 13).

```sh 
	static  Stack<Integer> pila1 = new Stack<Integer>(); //Primera pila de cilindros
	static Stack<Integer> pila2 = new Stack<Integer>(); //Segunda pila de cilindros
	static Stack<Integer> pila3 = new Stack<Integer>(); //Tercera pila de cilindros
```
Las pilas se declararon con el tipo de variable static para un mejor manejo más adelante.

Partimos de una base de metodo propuesto:

```sh 
public static int equalStack(int h1[] , int h2[], int h3[]){
    ...
} 
``` 

-   Parte 2:

Ahora, vamos a ir llenando (con el metodo push) cada pila(linea 24 a 37)

```sh 
    //Llenamos la pila1 con los elementos del arreglo 1
    for (int i = 0;i<=h1.length-1; i++) {
        pila1.push(h1[i]);
        htotal1= htotal1+ h1[i];
    }
```
En esta parte hicimos uso de un bucle for, en donde vamos a recuperar la información de los arreglos (h1) que almacenan las altura de cada cilindro. y este procedimiento se repite para con los otros arreglos (h2 y h3) Este procedimiento podría parecer repetitivo, pero como aclaramos antes, es necesario debido a que usaremos solo los metodos netamente de un Stack.

-   Parte 3:

Las pilas solo estaran igualadas cuando las alturas de todas estas sean iguales, por ello es que usaremos un bucle while que hará cómparaciones de las alturas, y no se terminará hasta que se logre la igualdad mendionada. entonces tenemos:

```sh
    while(htotal1 != htotal2 || htotal1 != htotal3) {
        ....
    return pilaMinima;
    }
```
htotal1, htotal2 y htotal3, son las alturas totales de cada pila de cilindros y fueron inicializadas con 0, 

Antes de esto es necesario declarar una variable (pilaMinima)la que almacenara la altura minima de entre todas las pilas (ver lineas 21 y 39):

```sh 
pilaMinima = Math.min(htotal1,Math.min(htotal2,htotal3))
```

Ahora, dentro del bucle while, vamos tambien a iniciar tambien bucles while cuya funcion es determinar cuando una pila tiene una altura mayor a la minima y asi eliminar el elemento de más arriba, tenemos:

```sh 
    //Retira los cilindros de la pila 1 hasta que su altura sea <= a la más pequeña
    while(htotal1 > pilaMinima){
        htotal1 -= pila1.pop();
    }
    pilaMinima = Math.min(htotal1,Math.min(htotal2,htotal3)); //Actualizamos minimo
```

En esa sección hicimos la comparacion con htotal1 y pilaMinima, y este procedimiento se repetirá con htotal2, htotal3 para compararse con pilaMinima

Con esta serie de bucles logramos obtener la altura minima en donde sean igualas todas las pilas.

#
### Ejercicio 2: PILAS

Para pode entender este ejercicio debemos antes imaginar cual es el procedimiento que deberia la computadora cuando se tengan las tres pilas, entonces, para esto identificamos una factor importante, el saber que pila tiene la menor altura

#
### Ejercicio 1: COLAS

Para pode entender este ejercicio debemos antes imaginar cual es el procedimiento que deberia la computadora cuando se tengan las tres pilas, entonces, para esto identificamos una factor importante, el saber que pila tiene la menor altura

#
<div align="center">
    <span style="font-weight:bold;"><h2>II. SOLUCIÓN DEL CUESTIONARIO </h2></span>
</div>

#

- ¿Qué similitudes hay entre una Lista Enlazada y una Pila?

    En general una lista enlazada requiere de una estructura de datos compleja, al contrario de las pilas que pueden operar con elementos simples o complejos. la forma en la que se agregan elemntos no difieren mucho en su implementación, sin embargo para la eliminación es donde tienen más diferencias, y esto basicamente es por donde las pilas pueden ejecutarse para tareas muy especificas que de hacerse con las listas enlazadas requewririan de más costo de memoria. 

- ¿En que casos seria favorable/desfavorable utilizar Pila/Cola?

    Bueno, haciendo el estudio bibliografico correspondiente, se nos señala que las pilas son útiles a la hora de implementar por ejemplo el muy comun retroceso de acciones (ctrl +z) de varias apliacaciones, asi como tambien los ides y derivados usan esta herramienta para determinar cuando una llave esta cerrada o no.

#
<div align="center">
    <span style="font-weight:bold;"><h2>III. CONCLUSIONES </h2></span>
</div>

#
-   Los conceptos solo teoricos de pilas ayudaron con la posibilidad de resolver la igulación de pilas.

-   blala

-   dfdfs

#
<div align="center">
    <span style="font-weight:bold;"><h2>RETROALIMENTACIÓN </h2></span>
</div>

#

-   

#
<div align="center">
    <span style="font-weight:bold;"><h2>REFERENCIAS Y BIBLIOGRAFÍA </h2></span>
</div>

#

-   https://www.w3schools.com/java/
-   https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
-   https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
-   https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
   
    