## Tabla de Conductores
El código que has proporcionado es una clase Java llamada DriverResultRepository que se utiliza para consultar una base de datos PostgreSQL y obtener información sobre los resultados de los conductores en un año específico. La información obtenida se almacena en una lista de objetos DriverResult.

![Captura de pantalla (197)](https://github.com/AlvaradoTrivino/TablaView_Conductores/assets/168314661/5d46fcee-40aa-4bcf-a80d-8435342f2f22)
![Captura de pantalla (199)](https://github.com/AlvaradoTrivino/TablaView_Conductores/assets/168314661/93463a9c-4283-4863-a904-f45f8011b868)
![Captura de pantalla (200)](https://github.com/AlvaradoTrivino/TablaView_Conductores/assets/168314661/0b2823d3-5169-4960-a3ae-1af8e0df22f9)

## Descripsion
Componentes Principales
Conexión a la Base de Datos: Se establece una conexión a la base de datos PostgreSQL utilizando una clase de conexión llamada conexion.
Consulta SQL: La consulta SQL recupera el año, el nombre y apellido del conductor, el número de victorias, el total de puntos y el ranking de la temporada para cada conductor en el año especificado.
Procesamiento de Resultados: Los resultados de la consulta se procesan y se almacenan en una lista de objetos DriverResult.
Método Main: Un método principal (main) para ejecutar la consulta para el año 2009 y mostrar los resultados en formato tabular.
Uso
Obtener Resultados: El método getResultByYear(int year) se utiliza para obtener una lista de resultados de conductores para un año específico.
Mostrar Resultados: El método main demuestra cómo usar la clase para obtener y mostrar los resultados en la consola.
