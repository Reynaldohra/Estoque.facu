package mercadorias;

public class Mercadorias {

    private int estoque;
    private String mercadorias;
    private String quantidade;
    private String localizaçao;

    public Mercadorias(String mercadorias, String quantidade, String localizaçao) {

        this.mercadorias = mercadorias;
        this.quantidade = quantidade;
        this.localizaçao = localizaçao;

    }
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(String mercadoria) {
        this.mercadorias = mercadoria;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getLocalizaçao() {
        return localizaçao;
    }

    public void setLocalizaçao(String localizaçao) {
        this.localizaçao = localizaçao;
    }
    

}
