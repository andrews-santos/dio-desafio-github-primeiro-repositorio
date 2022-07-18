package mysql;

public class clifor {

 

    private String clifor_id;
    private String clifor_razao;
    private String clifor_fantasia;
    private String clifor_cnpj;

    public clifor(String clifor_id, String clifor_razao, String clifor_fantasia, String clifor_cnpj) {
        this.clifor_id = clifor_id;
        this.clifor_razao = clifor_razao;
        this.clifor_fantasia = clifor_fantasia;
        this.clifor_cnpj = clifor_cnpj;
    }

    public clifor(String clifor_razao, String clifor_fantasia, String clifor_cnpj) {
        this.clifor_razao = clifor_razao;
        this.clifor_fantasia = clifor_fantasia;
        this.clifor_cnpj = clifor_cnpj;
    }

    public clifor() { }

    public String get_id() {
        return clifor_id;
    }

    public void setclifor_id(String clifor_id) {
        this.clifor_id = clifor_id;
    }

    public String getclifor_razao() {
        return clifor_razao;
    }

    public void setclifor_razao(String clifor_razao) {
        this.clifor_razao = clifor_razao;
    }

    public String getclifor_fantasia() {
        return clifor_fantasia;
    }

    public void setclifor_fantasia(String clifor_fantasia) {
        this.clifor_fantasia = clifor_fantasia;
    }

    public String getclifor_cnpj() {
        return clifor_cnpj;
    }

    public void setclifor_cnpj(String clifor_cnpj) {
        this.clifor_cnpj = clifor_cnpj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("clifor{");
        sb.append("clifor_id=").append(clifor_id);
        sb.append(", clifor_razao='").append(clifor_razao).append('\'');
        sb.append(", clifor_fantasia=").append(clifor_fantasia);
        sb.append(", clifor_cnpj='").append(clifor_cnpj).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
