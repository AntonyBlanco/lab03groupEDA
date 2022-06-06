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

-   Ejecución:

Más arriba hacemos mencion de que solo necesita ejecutar el programa para poder tener una vision amplia de la resolución del ejercicio, y es verdad, pero podemos pasar a detallar un poco, y es que en la primera parte de la clase Main, declaramos 3 arreglos de tipo entero, ellos alamcenaran las alturas de cada cilindro, mas adelante con ayuda de metodos adicionales que implementamos es que llenamos de forma interactiva cada arreglo (imprimiendo las indicaciones del caso):

<div align="center">

![Ejecucion](Imagenes%20para%20informe//Ejercicio1-ejecuci%C3%B3n.png)
</div>

#
### Ejercicio 2: PILAS

Para pode entender este ejercicio debemos antes imaginar cual es el procedimiento que deberia la computadora cuando se tengan las tres pilas, entonces, para esto identificamos una factor importante, el saber que pila tiene la menor altura

#
### Ejercicio 3: COLAS

Para poder implementar una cola primeramente debemos crear nuestra clase Node que sera generica.
```sh
    public class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data,Node<E> next) {
                this.data=data;
                this.next=next;
        }
        public Node(E data) {
                this(data,null);
        }
        public E getData() {
                return this.data;
        }
        public void setData(E data) {
                this.data=data;
        }
        public Node<E> getNext() {
                return this.next;
        }
        public void setNext(Node<E> next) {
                this.next=next;
        }
        public String toString() {
                return this.data.toString();
        }

```

Como siguiente paso creamos nuestra Interfaz con los metodos a implementar de la cola.
```sh
    public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enqueue (E info);
    E dequeue();
    E front();
    E back();

   }

```
Seguidamente creamos una clase donde implementareamos cada uno de los metodos.
```sh
    public class QueueLink<E> implements Queue<E> {

        private Node<E> front;
        private Node<E> back;
        private int size;

        //Constructor de la cola
        public QueueLink() {
        this.front = this.back = null;
        this.size = 0;
        }

        //Comprueba si la cola esta vacia
        public boolean isEmpty() {
                return this.front == null;
        }

        //Retorna el tamaño de la cola
        public int size() {
                return size;
        }

        //Agregamos un elemento a la cola
        public void enqueue(E x) {
                // TODO Auto-generated method stub
                Node<E> n = new Node<E>(x, null);
        if (isEmpty()) {
            front = n;
        } else {
            back.setNext(n);
        }
        back= n;
        size++;
        }

        //Eliminamos el primer elemento de la cola
        public E dequeue() {
                 E x;
                if (!isEmpty()) {
                    x = front.getData();
                    front = front.getNext();
                    size--;
                    if (isEmpty()){
                        back = null;
                    }
                } else {
                    x = null;
                }
                return x;
        }
 //Retorna el primer elemento de la cola
        public E front() {
                E x;
        if (isEmpty()) {
            x = null;
        } else {
            x = front.getData();
        }
        return x;
        }

        //Retorna el ultimo elemento de la cola
        public E back() {
                E x;
        if (isEmpty()) {
            x = null;
        } else {
            x = back.getData();
        }
        return x;
        }

        public String toString(){
        String cadena = "[";
        Node<E> n = front;
        while (n != null){
            cadena += n.getData() +",";
            n = n.getNext();
        }
        return cadena +"]";
    }

}

```
Finalmente comprobaremos la funcionalidad de nuestra cola con cada uno de los metodos por medio de un test.
```sh
    public class Test {
	public static void main(String[] args){
        
		//Cola de numeros 
        QueueLink<Integer> test = new QueueLink<>();
        
        test.enqueue(4);
        test.enqueue(10);
        test.enqueue(15);
        test.enqueue(20);
        test.enqueue(25);
        test.enqueue(30);
        
        System.out.println("* TEST 1 *");
        System.out.println("");
        System.out.println("La cola esta vacia: "+test.isEmpty());
        System.out.println("El tamaño es: "+test.size());
        
        System.out.println(test); 
        
        System.out.println("Primero: "+test.front());
        System.out.println("Ultimo: "+test.back());
        
        System.out.println("Desencolar: "+test.dequeue());
        
        System.out.println(test);        
          
    }
}

```

#
<div align="center">
    <span style="font-weight:bold;"><h2>II. SOLUCIÓN DEL CUESTIONARIO </h2></span>
</div>

#

- ¿Qué similitudes hay entre una Lista Enlazada y una Pila?

    En general una lista enlazada requiere de una estructura de datos compleja, al contrario de las pilas que pueden operar con elementos simples o complejos. la forma en la que se agregan elemntos no difieren mucho en su implementación, sin embargo para la eliminación es donde tienen más diferencias, y esto basicamente es por donde las pilas pueden ejecutarse para tareas muy especificas que de hacerse con las listas enlazadas requewririan de más costo de memoria. 

- ¿En que casos seria favorable/desfavorable utilizar Pila/Cola?

    Favorable uso de las Pilas

    Haciendo el estudio bibliografico correspondiente, se nos señala que las pilas son útiles a la hora de implementar por ejemplo el muy comun retroceso de acciones (ctrl + z) de varias aplicaciones.
    Tambien los IDEs y derivados usan esta herramienta para determinar cuando una llave esta cerrada o no, por ejemplo en las estructuras de seleccion y iterativas anidadas.
    De la misma manera podemos usarlo para poder leer un lenguaje con una gramática que contiene reglas recursivas, por ejemplo el uso de los paréntesis y funciones en las expresiones matemáticas de las calculadoras, algo relacionado se refiere a los autómatas de pila.

    Desfavorable uso de las Pilas

    Las pilas a primera instancia podriamos usarlas para guardar información que no requiera de un orden, pero para ello ya tenemos las listas o arreglos dinámicos.

    Favorable uso de las Colas

    Las colas se utilizan en las computadoras cuando se ejecutan diversos procesos que deben ser realizados en orden.

    Desfavorable uso de las Colas

    ...

#
<div align="center">
    <span style="font-weight:bold;"><h2>III. CONCLUSIONES </h2></span>
</div>

#
-   Los conceptos solo teoricos de pilas ayudaron con la posibilidad de resolver la igualación de pilas.

-   Las colas y pilas se van a utilizar como una solución precisa para diversos problemas de administración de la información así como la ordenada ejecución de procesos

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
   
    
