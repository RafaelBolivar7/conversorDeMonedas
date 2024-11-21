<h1>Conversor de Monedas 💵🔄💶</h1>

![Static Badge](https://img.shields.io/badge/ESTADO%20-EN%20DESARROLLO%20-%20GREEN)
![Static Badge](https://img.shields.io/badge/JAVA%20-%20JDK%2017-%20blue)
![Static Badge](https://img.shields.io/badge/GSON%20-%202.10.1%20-%20gray)

### Descripción 📝
<h3>Challenge de Conversor de Monedas en el Programa Alura - ONE </h3>
<p>Este proyecto permite convertir diferentes divisas utilizando una API de tasas de cambio en tiempo real. 
  El "conversor de monedas" permite realizar solicitudes a la API, analizar la respuesta JSON, filtrar las monedas de interés y mostrar los resultados a los usuarios de manera clara. 
  Adicionalmente se realiza ub guardado del historial de conversiones e incluye la marca temporal de la solicitud con el fin de realizar un seguimiento de sus conversiones anteriores y mostrar en que fecha y hora se realizaron.</p>

## Tecnologías Utilizadas🖥️
- **`Lenguaje de Programación:`** Java - JDK 17
- **`Entorno de Desarrollo Integrado (IDE)`**: IntelliJ IDEA 
- **`API de Tasas de Cambio`**: ExchangeRate API: permite obtener las tasas de conversión entre diferentes divisas
- **`Librería GSON`**: Gson JAR 2.10.1, permite analizar las respuestas JSON de la API, y convertirla en objetos en JAVA para manipularlos.
-  **`Control de Versiones`**: Git / GitHub

## Funcionalidad del Proyecto 🛠️
- **`Interfaz`**: El proyecto incialmente presenta una interfaz por la consola del IDE, en la que se presenta un menú de operaciones y se puede introducir la información para la solicitud de cambio de moneda.
- **`Operación`**: Se pueden realizar las operaciones predefinidas en el menú, para verificar el cambio de las divisas. 
- **`Archivo de Texto`**: La información del cambio de las divisas calculadas, es guardado en un documento .txt, en el se muestra la marca temporal el monto inicial de cambio, la moneda de origen y su equivalencia en la moneda destino. Este documento permanece estático hasta que se ejecuta nuevamente el proyectoy se reinicializa desde cero.

## Clases 🧰
- **`Main.java`**: Permite inicializar el programa. En ella se realiza la interacción con el usuario a través de la consola, mostrando un menú de opciones y gestionando las conversiones de moneda.
- **`Calculo.java`**: Maneja la lógica relacionada con las conversiones de moneda. En ella se definen métodos para almacenar valores de moneda, realizar conversiones y obtener mensajes de respuesta.
- **`SolicitudDeCambio.java`**: Realiza las solicitudes o consultas a una xchange Rate API (en este caso)para obtener las tasas de cambio entre diferentes monedas.
- **`GeneradorArchivos.java`**: Crea, y sobreescribe el archivo .txt, que permite guardar el historial de las solicitudes de conversión de moneda realizadas en la ejecución del programa.

## Alcances Futuros ⏱️
- **`Desarrollo de interfaz`**: generar una interfaz gráfica ejecutable en el navegador, que permita la interacción del usuario con el programa y haga más dinamica la experiencia con él. Pudiendose implementar menus desplegables, que permitan seleccionar tanto la moneda de origen como la moneda destino.
- **`Cuentas de Usuario`**: permitir que los usuarios puedan crear su perfil en el que puedan guardar la información de las solicitudes de cambio de divisas realizadas.
- **`Persistencia de datos`**: aumentar la persistencia de los datos, guardando la información despues de cada ejecución del programa y no que se borre la información de ejecuciones anteriores. 
- **`Integrar otras API`**: aumentar la confianza y veracidad de los resultados integrando en el funcionamiento otras APIs de cambio de divisas en tiempo real, y que el usuario pueda seleccionar a que api realizar la solictud de cambio de divisas.
