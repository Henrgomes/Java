
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String codigo;
    private String nomeDonoPosto;
    private String emailDonoPosto;
    private String codigoDonoPosto;
    private String caminhoFoto;
    private double precoGasolinaComum;
    private double precoDiesel;
    private double precoGasolinaAditivada;
    private double precoEtanol;
    private double precoDieselS10;

    public Usuario(String nome, String email, String senha, String codigo,String emailDonoPosto,String nomeDonoPosto, String codigoDonoPosto,
     String caminhoFoto, double precoGasolinaComum, double precoDiesel, double precoGasolinaAditivada, double precoEtanol, double precoDieselS10 ) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.codigo = codigo;
        this.nomeDonoPosto = nomeDonoPosto;
        this.emailDonoPosto = emailDonoPosto;
        this.codigoDonoPosto = codigoDonoPosto;
        this.precoDiesel = precoDiesel;
        this.precoDieselS10 = precoDieselS10;
        this.precoGasolinaAditivada = precoGasolinaAditivada;
        this.precoGasolinaComum = precoGasolinaComum;
        this.precoEtanol = precoEtanol;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeDonoPosto() {
        return nomeDonoPosto;
    }

    public void setNomeDonoPosto(String nomeDonoPosto) {
        this.nomeDonoPosto = nomeDonoPosto;
    }

    public String getEmailDonoPosto() {
        return emailDonoPosto;
    }

    public void setEmailDonoPosto(String emailDonoPosto) {
        this.emailDonoPosto = emailDonoPosto;
    }

    public String getCodigoDonoPosto() {
        return codigoDonoPosto;
    }

    public void setCodigoDonoPosto(String codigoDonoPosto) {
        this.codigoDonoPosto = codigoDonoPosto;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    public double getPrecoGasolinaComum() {
        return precoGasolinaComum;
    }

    public void setPrecoGasolinaComum(double precoGasolinaComum) {
        this.precoGasolinaComum = precoGasolinaComum;
    }

    public double getPrecoDiesel() {
        return precoDiesel;
    }

    public void setPrecoDiesel(double precoDiesel) {
        this.precoDiesel = precoDiesel;
    }

    public double getPrecoGasolinaAditivada() {
        return precoGasolinaAditivada;
    }

    public void setPrecoGasolinaAditivada(double precoGasolinaAditivada) {
        this.precoGasolinaAditivada = precoGasolinaAditivada;
    }

    public double getPrecoEtanol() {
        return precoEtanol;
    }

    public void setPrecoEtanol(double precoEtanol) {
        this.precoEtanol = precoEtanol;
    }

    public double getPrecoDieselS10() {
        return precoDieselS10;
    }

    public void setPrecoDieselS10(double precoDieselS10) {
        this.precoDieselS10 = precoDieselS10;
    }
}

