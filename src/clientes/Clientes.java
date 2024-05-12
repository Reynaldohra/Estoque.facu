package clientes;

public class Clientes {

    private int clientes;
    private String nome;
    private String sobreNome;
    private String whatsapp;
    private String endereço;
    private String cpf;

    public Clientes(String nome, String sobreNome, String whatsapp, String endereço, String cpf){

    this.nome = nome;
    this.sobreNome = sobreNome;
    this.whatsapp = whatsapp;
    this.endereço = endereço;
    this.cpf = cpf;
}

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public int getClientes() {
        return clientes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}

