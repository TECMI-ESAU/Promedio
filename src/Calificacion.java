public class Calificacion {

    // Nombre del participante
    private String nombreParticipante;

    // 5 valores numéricos
    private double[] calificaciones;

    public Calificacion(String nombreParticipante, double[] calificaciones) {
        this.nombreParticipante = nombreParticipante;
        this.calificaciones = calificaciones;
    }

    /**
     * Primer método: PROMEDIO
     */
    public double calcularPromedio(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    /**
     * Segundo método: CALIFICACION
     */
    public char obtenerCalificacionLetra(double promedio) {
        char calificacionFinal;

        if (promedio <= 50) {
            calificacionFinal = 'F';
        } else if (promedio <= 60) {
            calificacionFinal = 'E';
        } else if (promedio <= 70) {
            calificacionFinal = 'D';
        } else if (promedio <= 80) {
            calificacionFinal = 'C';
        } else if (promedio <= 90) {
            calificacionFinal = 'B';
        } else {
            calificacionFinal = 'A';
        }

        return calificacionFinal;
    }

    /**
     * Tercer método: IMPRESION
     * Recibe como parámetros el nombre, promedio y calificación.
     */
    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + this.calificaciones[0]);
        System.out.println("Calificación 2: " + this.calificaciones[1]);
        System.out.println("Calificación 3: " + this.calificaciones[2]);
        System.out.println("Calificación 4: " + this.calificaciones[3]);
        System.out.println("Calificación 5: " + this.calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método principal (main) para la ejecución de la prueba
    public static void main(String[] args) {
        // Datos
        String nombre = "Manuel Noriega";
        double[] notas = {85.0, 90.0, 78.0, 92.0, 88.0};

        // Instancia
        Calificacion alumno = new Calificacion(nombre, notas);

        // Ejecución
        double promedioCalculado = alumno.calcularPromedio(alumno.calificaciones);
        char letraCalificacion = alumno.obtenerCalificacionLetra(promedioCalculado);

        // Impresión
        alumno.imprimirResultados(alumno.nombreParticipante, promedioCalculado, letraCalificacion);
    }
}