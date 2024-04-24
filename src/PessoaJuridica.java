package zkd.codes;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    private String companyCompleteName;

    private String companyBirthDate;

    private String companySector;

    private String comercialAddress;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCompanyCompleteName() {
        return companyCompleteName;
    }

    public void setCompanyCompleteName(String companyCompleteName) {
        this.companyCompleteName = companyCompleteName;
    }

    public String getCompanyBirthDate() {
        return companyBirthDate;
    }

    public void setCompanyBirthDate(String companyBirthDate) {
        this.companyBirthDate = companyBirthDate;
    }

    public String getCompanySector() {
        return companySector;
    }

    public void setCompanySector(String companySector) {
        this.companySector = companySector;
    }

    public String getComercialAddress() {
        return comercialAddress;
    }

    public void setComercialAddress(String comercialAddress) {
        this.comercialAddress = comercialAddress;
    }
}
