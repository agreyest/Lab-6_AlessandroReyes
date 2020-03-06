package lab.pkg6_alessandroreyes;



public class Usuario {
    private String nomcC, usuario, contraseña;
    private String nat;

    public Usuario(String nomcC, String usuario, String contraseña, String nat) {
        this.nomcC = nomcC;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nat = nat;
    }

    public String getNomcC() {
        return nomcC;
    }

    public void setNomcC(String nomcC) {
        this.nomcC = nomcC;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    @Override
    public String toString() {
        return nomcC;
    }
    
    
}
