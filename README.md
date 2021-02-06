# La herramienta Maven 

- mayor utilidad: simplificar los procesos de construccion en el proyecto
- fases de maven: 1.validar / 2.compilar / 3.ejecuta los test  /  4.empaquetar / 5.verificar / 6.instalar /  7.desplegar 
- ciclo de vida de la construccion: default / clean / site 
- Para qué sirven los plugins: creación y generacion de informes 
- Qué es y para que sirve el repositorio central de Maven: es un repositorio donde se contribuye para compilar o agregar versiones de proyectos mediante datos especificos

# Compilar y ejecutar 

-objetivo del parametro package: tomar el código compilado y empaquetarlo en su formato distribuible, como un JAR.

# Esqueleto de la aplicacion

instrucciones
- sin parametros: se muestra mensaje de "Parameter of type RegularShapeType is required" 
- Parametro qwerty: no es un parametro valido de RegularShapeType
- Parametro pentagon: a pesar de ser una de las figuras permitidas al no tener una sintaxis exacta, en este caso no empezar con mayuscula (Pentagon)
- Parametro Hexagon: esta instruccion si se ejecuta correctamente y coincide la sintaxis y el numero de lados 

# Gitignore

GITIGNORE
Un gitignore archivo especifica archivos sin seguimiento intencional que Git debe ignorar. Los archivos ya rastreados por Git no se ven afectados.

Cada línea de un gitignore archivo especifica un patrón. Al decidir si ignorar una ruta, Git normalmente verifica gitignore patrones de múltiples fuentes, con el siguiente orden de precedencia, de mayor a menor (dentro de un nivel de precedencia, el último patrón coincidente decide el resultado):

* Los patrones se leen desde la línea de comandos para aquellos comandos que los admiten.

* Los patrones leen desde un .gitignore archivo en el mismo directorio que la ruta, o en cualquier directorio padre, con patrones en los archivos de nivel superior (hasta el nivel superior del árbol de trabajo) siendo anulados por aquellos en archivos de nivel inferior hasta el directorio que contiene el archivo. Estos patrones coinciden en relación con la ubicación del .gitignorearchivo. Un proyecto normalmente incluye dichos .gitignorearchivos en su repositorio, que contienen patrones para archivos generados como parte de la construcción del proyecto.

* Lectura de patrones $GIT_DIR/info/exclude.

* Los patrones leen del archivo especificado por la variable de configuración core.excludesFile.

En qué archivo colocar un patrón depende de cómo se vaya a utilizar el patrón.

* Los patrones que deben ser controlados por versiones y distribuidos a otros repositorios a través de un clon (es decir, archivos que todos los desarrolladores querrán ignorar) deben ir a un .gitignorearchivo.

* Los patrones que son específicos de un repositorio en particular pero que no necesitan ser compartidos con otros repositorios relacionados (por ejemplo, archivos auxiliares que viven dentro del repositorio pero son específicos del flujo de trabajo de un usuario) deben ir al $GIT_DIR/info/excludearchivo.

* Los patrones que un usuario quiere que Git ignore en todas las situaciones (por ejemplo, copias de seguridad o archivos temporales generados por el editor de elección del usuario) generalmente van a un archivo especificado por core.excludesFileen el usuario ~/.gitconfig. Su valor predeterminado es $ XDG_CONFIG_HOME / git / ignore. Si $ XDG_CONFIG_HOME no está configurado o está vacío, se usa $ HOME / .config / git / ignore en su lugar.

Las herramientas de plomería de Git subyacentes, como git ls-files y git read-tree , leen gitignorepatrones especificados por las opciones de la línea de comandos o de archivos especificados por las opciones de la línea de comandos. Las herramientas de Git de nivel superior, como git status y git add , usan patrones de las fuentes especificadas anteriormente.

El no usar archivos .gitignore provocaría un desperdicio de espacio en disco. Y lo que es peor, al tenerlos todos listados, podría distraernos de los cambios que realmente importan.
