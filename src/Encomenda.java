public class Encomenda {
    private String data;
    private Automovel preco;


    public Encomenda(Utilizador nif, Automovel matricula, Automovel preco) {
        this.data = "";
        this.preco = preco;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setPreco(Automovel preco) {
        this.preco = preco;
    }
    public Automovel getPreco() {
        return preco;
    }
}
