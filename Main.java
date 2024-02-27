import java.util.Scanner;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de instancias de diferentes personas
        Estudiante estudiante = new Estudiante("Juan", 20, "Masculino", "Colombiana");
        Docente docente = new Docente("María", 35, "Femenino", "Mexicana");
        Administrativo administrativo = new Administrativo("Pedro", 25, "Masculino", "Argentina");

        // Mostrar información de las personas
        System.out.println("Información de las personas:");

        // Mostrar información del estudiante
        System.out.println("\nInformación del estudiante:");
        mostrarInformacionYEdad(estudiante);

        // Mostrar información del docente
        System.out.println("\nInformación del docente:");
        mostrarInformacionYEdad(docente);

        // Mostrar información del administrativo
        System.out.println("\nInformación del administrativo:");
        mostrarInformacionYEdad(administrativo);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para mostrar la información de una persona y verificar si es mayor de edad
    public static void mostrarInformacionYEdad(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Ocupación: " + persona.getOcupacion());
        System.out.println("Nacionalidad: " + persona.getNacionalidad());
        if (persona.esMayorEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

    // Clase base para representar una persona
    public static class Persona {
        private String nombre;
        private int edad;
        private String genero;
        private String ocupacion;
        private String nacionalidad;

        // Constructor de la clase Persona
        public Persona(String nombre, int edad, String genero, String ocupacion, String nacionalidad) {
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
            this.ocupacion = ocupacion;
            this.nacionalidad = nacionalidad;
        }

        // Métodos getters para obtener los atributos de la persona
        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public String getGenero() {
            return genero;
        }

        public String getOcupacion() {
            return ocupacion;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }

        // Método para verificar si la persona es mayor de edad
        public boolean esMayorEdad() {
            return edad >= 18;
        }
    }

    // Clase que representa a un estudiante, que hereda de Persona
    public static class Estudiante extends Persona {
        // Constructor de la clase Estudiante
        public Estudiante(String nombre, int edad, String genero, String nacionalidad) {
            // Llamada al constructor de la clase base (Persona)
            super(nombre, edad, genero, "Estudiante", nacionalidad);
        }
    }

    // Clase que representa a un docente, que hereda de Persona
    public static class Docente extends Persona {
        // Constructor de la clase Docente
        public Docente(String nombre, int edad, String genero, String nacionalidad) {
            // Llamada al constructor de la clase base (Persona)
            super(nombre, edad, genero, "Docente", nacionalidad);
        }
    }

    // Clase que representa a un administrativo, que hereda de Persona
    public static class Administrativo extends Persona {
        // Constructor de la clase Administrativo
        public Administrativo(String nombre, int edad, String genero, String nacionalidad) {
            // Llamada al constructor de la clase base (Persona)
            super(nombre, edad, genero, "Administrativo", nacionalidad);
        }
    }
}
