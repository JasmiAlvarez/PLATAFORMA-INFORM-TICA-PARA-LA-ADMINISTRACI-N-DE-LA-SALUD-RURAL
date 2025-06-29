
package MODELO;

public class Usuario {
    private int idusuario;
    private String nombre;
    private String email;
    private String contraseña;
    private String tipoUsuario;

    public Usuario() {}

    public Usuario(int idusuario, String nombre, String email, String contraseña, String tipoUsuario) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdusuario() { return idusuario; }
    public void setIdusuario(int idusuario) { this.idusuario = idusuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public String getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }
}
