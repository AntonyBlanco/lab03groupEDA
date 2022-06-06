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

Para pode entender este ejercicio debemos antes imaginar cual es el procedimiento que deberia la computadora cuando se tengan las tres pilas, entonces, para esto identificamos una factor importante, el saber que pila tiene la menor altura

```sh 
    public int[] rotarIzquierdaArray(int[] A){
    /** */
    //Procedimiento para rotar la matriz
    /** */
    return Aiz;
    }
```

Blalalallaa mas explicación de ejercicio1

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

    Basicamente ambas estan basadas en un a 

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
   
    
