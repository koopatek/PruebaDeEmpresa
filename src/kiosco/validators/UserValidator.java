package kiosco.validators;
public class UserValidator {
    private String usuario;
    private String contrasena;

    public UserValidator(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public UserValidator() {
    }

    @Override
    public String toString() {
        return "UserValidator{" + "usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String ValidarUsuario(){
        
        if(usuario.equalsIgnoreCase("admin") && contrasena.equalsIgnoreCase("admin")){
            usuario = usuario + " bienvenido.";
        } else {
            usuario = "Acceso denegado, usuario no conocido.";
        }
        return usuario;
    }
}
