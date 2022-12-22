import java.util.ArrayList;
import java.util.Scanner;

public class Utilizador {
    private String nome;
    private String apelido;
    private int nif;
    private boolean login;
    private String username;
    private String password;
    private String cidade;
    private int telemovel;
    private String tipoUser;

    public Utilizador(String nome, String apelido, String username, String password, int nif, int telemovel, String cidade, String tipoUser){
        this.nome = nome;
        this.apelido = apelido;
        this.username = username;
        this.password = password;
        this.nif = nif;
        this.telemovel = telemovel;
        this.cidade = cidade;
        this.tipoUser = tipoUser;
    }

    public Utilizador(){
        this.nome = "";
        this.apelido = "";
        this.nif = 0;
        this.username = "";
        this.password = "";
        this.cidade = "";
        this.telemovel = 0;
        this.tipoUser = "";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { this.nome = nome; }
    public String getApelido(){ return apelido; }
    public void setApelido(String apelido) { this.apelido = apelido; }
    public int getNif() { return nif; }
    public void setNif(int nif) { this.nif = nif; }
    public boolean isLogin() { return login; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public void setLogin(boolean login) {
        this.login = login;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getTipoUser() {
        return tipoUser;
    }
    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }
    public int getTelemovel() {
        return telemovel;
    }
    public void setTelemovel(int telemovel) { this.telemovel = telemovel; }

@Override
    public String toString(){

        System.out.println("\n\n*****       Informações do Perfil          *****");
        System.out.println("\n*************************************************");
        String str = "\n\t\t Tipo de User: " +tipoUser;
        str += "\n\t\t Nome: " +nome;
        str += "\n\t\t Apelido: " +apelido;
        str += "\n\t\t Username: " +username;
        str += "\n\t\t Password: " +password;
        str += "\n\t\t Cidade:   " +cidade;
        str += "\n\t\t Telemóvel: " +telemovel;
        str += "\n\t\t NIF: " +nif;

        return str;
    }
}
