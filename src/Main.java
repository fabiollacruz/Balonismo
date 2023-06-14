public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nomePessoa = "Leonardo";
        p1.cpfPessoa = "92840389547";
        p1.edndereco = "Rua Bartolomeu 402";
        p1.rg = "094719349-x";
        p1.telefoneFamiliar = "(11)952207126";

        p2.nomePessoa = "Thiago";
        p2.cpfPessoa = "83904788304";
        p2.endereco = "Rua Antônio Fernandes Prado 47";
        p2.rg = "63486746-x";
        p2.telefoneFamiliar = "(11)952213443";

        p1.assinarTermo();
        p2.assinarTermo();

        Piloto piloto = new Piloto();

        piloto.nomePiloto = "Carlos";
        piloto.cpfPiloto = "094379589343";
        piloto.registroANAC = "578475HKL";

        piloto.pilotarBalao();

        balao.identificacao = "7498357894";
        balao.registroRegularidade = "475787SJD";

        balao.voar();

        p1.vooPasseio();
        p2.,vooPasseio();
    }
}