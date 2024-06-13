<h1 align="center"> :euro: Challenge Conversor de Monedas :dollar: </h1>


Este es el primer challenge de la especialización Back-End con Java 17 de Alura Latam y Oracle Next Education. El proyecto consiste en un conversor de monedas que utiliza una API externa para obtener las tasas de cambio actualizadas.


## Tabla de Contenidos

- [Descripción](#descripción)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Estructura del Código](#estructura-del-código)
- [Uso](#uso)



## Descripción
El conversor de monedas es una aplicación desarrollada en Java que permite convertir diferentes monedas utilizando las tasas de cambio proporcionadas por el servicio ExchangeRate-API. Esta aplicación implementa conceptos de programación orientada a objetos y consumo de APIs.

## Requisitos

- Java 17 o superior
- Biblioteca externa: Gson
- Conexión a Internet

## Instalación

1. Clona este repositorio:
    ```bash
    git clone https://github.com/Cristhian-Larra/Challenge-Conversor-de-monedas.git
    ```

2. Navega al directorio del proyecto:
    ```bash
    cd Challenge-Conversor-de-monedas
    ```

3. Importa el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA, Eclipse).

4. Asegúrate de tener Java 17 instalado en tu sistema.
   
5. Incluye la biblioteca de Gson en tu proyecto. Puedes descargar el JAR desde [aquí](https://mvnrepository.com/artifact/com.google.code.gson/gson) o usar un gestor de dependencias como Maven o Gradle.


## Configuración
1. Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener una API key.
2. Reemplaza `PONER-TU-KEY-AQUI` en la clase `ConsultarTarifa` con tu clave de API

   
### Configuración de la biblioteca Gson
1. Abre tu proyecto en IntelliJ.
2. Haz clic derecho sobre la carpeta del proyecto en el panel izquierdo.
3. Selecciona "Open Module Settings" en el menú contextual.
4. En la ventana que se abre, ve a la pestaña "Dependencies".
5. Haz clic en el signo "+" en la esquina inferior izquierda y elige "Library".
6. Busca "gson" en el cuadro de búsqueda.
7. Selecciona la versión de Gson que desees utilizar.
8. Haz clic en "OK" para cerrar la ventana.

## Estructura del Código

### `Principal.java`

Este es el punto de entrada del programa. Proporciona un menú interactivo para que el usuario seleccione la operación deseada y maneja la entrada del usuario.

### `Tarifas.java`

Esta clase es un registro que almacena las tasas de conversión obtenidas de la API.

### `CalcularTarifa.java`

Contiene la lógica para calcular la conversión de monedas utilizando las tasas de cambio obtenidas.

### `ConsultarTarifa.java`

Realiza la solicitud HTTP a la API de ExchangeRate y convierte la respuesta JSON en un objeto `Tarifas`.

## Uso

1. Ejecuta el programa principal `Principal.java`.  
   Al ejecutar el programa, se mostrará un menú con las siguientes opciones:
    
   ![image](https://github.com/Cristhian-Larra/Challenge-Conversor-de-monedas/assets/141253906/cb0e640c-83da-4fb8-ac58-cd4e36987d02)

3. Sigue las instrucciones en pantalla para realizar una conversión de moneda:

    - Selecciona `1` para realizar una conversión.
    - Introduce el código de la moneda actual (ej. USD para Dólar Estadounidense).
    - Introduce el valor de la moneda actual.
    - Introduce el código de la moneda a la que quieres convertir (ej. EUR para Euro).
      
      ![image](https://github.com/Cristhian-Larra/Challenge-Conversor-de-monedas/assets/141253906/3a66ceab-2f93-4a08-984b-3042749dcaea)


4. Selecciona `0` para salir del programa.

### Códigos de países de ejemplos
Estos son algunos códigos de los países que están registrados en la API, [ExchangeRate-API - Supported Currency Codes and Countries](https://www.exchangerate-api.com/docs/supported-currencies)
 
ARS - Peso argentino
 
BOB - Boliviano boliviano
 
BRL - Real brasileño
 
CLP - Peso chileno
 
COP - Peso colombiano
 
USD - Dólar estadounidense

