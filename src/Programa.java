package zkd.codes;

public class Programa {

    public static void main(String[] args){

        PessoaFisica normalPerson = new PessoaFisica();
        normalPerson.setPersonCompleteName("Letícia Almeida");
        normalPerson.setBirthDate("08/03/1995");
        normalPerson.setPersonAddress("Rua JavaScript Front-end, Bairro Java Back-end, Casa 57");
        normalPerson.setCpf("111.222.333-44");
        normalPerson.setRg("12345678910");
        normalPerson.setCtps("1234567");
        normalPerson.setElectoralTitle("121110987654");

        PessoaJuridica corporatePerson = new PessoaJuridica();
        corporatePerson.setPersonCompleteName("Fernando da Silva Machado");
        corporatePerson.setBirthDate("22/09/2000");
        corporatePerson.setPersonAddress("Rua HTML Front-end, Bairro CSS Front-end, Casa 1412");
        corporatePerson.setCnpj("12345678911234");
        corporatePerson.setComercialAddress("Rua React Front-end, Bairro IntellJ IDE, Númeração 777");
        corporatePerson.setCompanyCompleteName("Tonhão Transportes");
        corporatePerson.setCompanyBirthDate("17/01/2023");
        corporatePerson.setCompanySector("Transporte");

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Pessoa Física:");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Dados de Pessoa:");
        System.out.println("NOME: " + normalPerson.getPersonCompleteName());
        System.out.println("DATA DE NASCIMENTO: " + normalPerson.getBirthDate());
        System.out.println("ENDEREÇO PESSOAL: " + normalPerson.getPersonAddress());
        System.out.println("TÍTULO ELEITORAL: " + normalPerson.getElectoralTitle());
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Acréscimos de PessoaFisica:");
        System.out.println("CPF: " + normalPerson.getCpf());
        System.out.println("RG: " + normalPerson.getRg());
        System.out.println("CTPS: " + normalPerson.getCtps());
        System.out.println("-------------------------------------------------------------------------------------------------------");

        System.out.println("");

        System.out.println("*******************************************************************************************************");
        System.out.println("Pessoa Jurídica:");
        System.out.println("*******************************************************************************************************");
        System.out.println("Dados de Pessoa:");
        System.out.println("NOME: " + corporatePerson.getPersonCompleteName());
        System.out.println("DATA DE NASCIMENTO: " + corporatePerson.getBirthDate());
        System.out.println("ENDEREÇO PESSOAL: " + corporatePerson.getPersonAddress());
        System.out.println("TÍTULO ELEITORAL: " + corporatePerson.getElectoralTitle());
        System.out.println("*******************************************************************************************************");
        System.out.println("Acréscimos de PessoaJuridica:");
        System.out.println("CNPJ: " + corporatePerson.getCnpj());
        System.out.println("NOME DA EMPRESA: " + corporatePerson.getCompanyCompleteName());
        System.out.println("FUNDAÇÃO DA EMPRESA: " + corporatePerson.getCompanyBirthDate());
        System.out.println("ENDEREÇO COMERCIAL: " + corporatePerson.getComercialAddress());
        System.out.println("SETOR: " + corporatePerson.getCompanySector());
        System.out.println("*******************************************************************************************************");



    }
}
