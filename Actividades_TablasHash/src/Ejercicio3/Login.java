package Ejercicio3;

public class Login {

    private Usuario nombreUsuario;
    private Contrasena contrasena;

    public Login (String nombreUsuario, String contrasena) {
        this.nombreUsuario = new Usuario(nombreUsuario);
        this.contrasena = new Contrasena(contrasena);
    }

    @Override
    public String toString() {
        return "Login [nombreUsuario=" + nombreUsuario.getValor() + ", contrasena=" + contrasena.getValorContraseña()+ "]";
    }

    public Usuario getNombreUsuario() {
        return nombreUsuario;
    }

    public Contrasena getContrasena() {
        return contrasena;
    }

    public void nuevoRegistro (String nombreUsuario, String contrasena){
        if (Usuario.comprobarNombreUsuario(nombreUsuario)) {
            this.nombreUsuario = new Usuario(nombreUsuario);
            this.contrasena = new Contrasena(contrasena);
            System.out.println("Nuevo registro creado: " + this);
        } else {
            System.out.println("Nombre de usuario no válido. Debe tener entre 4 y 6 caracteres y contener solo letras.");
        }
    }

    public void login (String nombreUsuario, String contrasena){
        if(this.nombreUsuario.getValor().equals(nombreUsuario) && this.contrasena.getValorContraseña().equals(contrasena)){
            System.out.println("Login correcto");
        }else{
            System.out.println("Nombre de usuario o contraseña incorrecto");
        }
    }

    public void modificarContraseña (String nombreUsuario, String contrasenaActual, String contrasenaNueva) {
        if(this.nombreUsuario.getValor().equals(nombreUsuario) && this.contrasena.getValorContraseña().equals(contrasenaActual)){
            this.contrasena = new Contrasena(contrasenaNueva);
            System.out.println("Contraseña modificada correctamente");
        } else {
            System.out.println("Nombre o contraseña actual incorrectos");
        }
    }
}
