package Ejercicio2;

public class Principal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.nuevaEntrada("123456789", "Juan Perez", "Calle Falsa 123");
        agenda.nuevaEntrada("987654321", "Maria Lopez", "Calle Prueba 456");

        // Buscar contacto por telefono
        Contacto contactoEncontradoTelefono = agenda.buscaContactoTelefono("123456789");
        if (contactoEncontradoTelefono != null) {
            System.out.println("Contacto encontrado:");
            System.out.println("Nombre: " + contactoEncontradoTelefono.getNombre());
            System.out.println("Telefono: " + contactoEncontradoTelefono.getTelefono().getNumero());
            System.out.println("Direccion: " + contactoEncontradoTelefono.getDireccion());
            System.out.println("--------------------");
        }

        // Buscar contacto por nombre
        Contacto contactoEncontradoNombre = agenda.buscaContactoNombre("Juan Perez");
        if (contactoEncontradoNombre != null) {
            System.out.println("Contacto encontrado:");
            System.out.println("Nombre: " + contactoEncontradoNombre.getNombre());
            System.out.println("Telefono: " + contactoEncontradoNombre.getTelefono().getNumero());
            System.out.println("Direccion: " + contactoEncontradoNombre.getDireccion());
            System.out.println("--------------------");
        }

        agenda.mostrarAgenda();

        // Imprimir agenda
        agenda.imprimirAgenda();
    }

}
