import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Automovel {
    private String matricula;
    private int ano;
    private float preco;
    private float kms;
    private String estado; //colocar como enumeração (acho que com a nova atualização deixou de existir)
    private HashMap<Object, Automovel> automovel;

    public Automovel(String matricula) {
        this.matricula = matricula;
        this.ano = 0;
        this.preco = 0;
        this.kms = 0;
        this.estado = "Disponível";
    }

    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public float getPreco() {
        return this.preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getKms() {
        return kms;
    }
    public void setKms(float kms) {
        this.kms = kms;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Procura se já existe algum veiculo com essa matricula, se sim dá erro, senão adiciona
    public void adicionarAutomovel(Automovel automovel) throws AutomovelException{
        boolean existe = false;
        for (Automovel car: this.automovel.values()){
            if (automovel.getMatricula() == car.getMatricula()){
                existe = true;
            }
        }
        if (existe == false){
            this.automovel.put(automovel.getMatricula(), automovel);
        }
        else {
            throw new AutomovelException("Esse veículo já existe!");
        }
    }

    // Procurar o veiculo com determinada matrícula, se essa matricula nao existir dá erro, senão altera o estado do automovel para desativo
    public void eliminarAutomovel(Automovel automovel) throws AutomovelException{
        boolean existe = false;
        for (Automovel car: this.automovel.values()){
            if (automovel.getMatricula() == car.getMatricula()){
                existe = true;
            }
        }
        if (existe == false){
            throw new AutomovelException("Esse veículo não existe!");
        }
        else {
            this.automovel.replace(automovel.getEstado(), automovel);
        }
    }
}