public class Aluno {
   private String nome;
    private int R_A;
    private double nProva1;
    private double nProva2;
    private double nTrabalho;

    public Aluno() {
        this.nome = nome;
        this.R_A = R_A;
        this.nProva1 = nProva1;
        this.nProva2 = nProva2;
        this.nTrabalho = nTrabalho;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getR_A() {
        return R_A;
    }

    public void setR_A(int R_A) {
        this.R_A = R_A;
    }

    public double getnProva1() {
        return nProva1;
    }

    public void setnProva1(double nProva1) {
        this.nProva1 = nProva1;
    }

    public double getnProva2() {
        return nProva2;
    }

    public void setnProva2(double nProva2) {
        this.nProva2 = nProva2;
    }

    public double getnTrabalho() {
        return nTrabalho;
    }

    public void setnTrabalho(double nTrabalho) {
        this.nTrabalho = nTrabalho;
    }

    public double calcularMedia(){
       return ( (nProva1 * 3.5 + nProva2 * 3.5 + nTrabalho * 3)/10);
    }
    public String situacao(){
        double notaMedia = calcularMedia();
        if(calcularMedia() >= 70.0){
           return(" Parabéns, Aprovado");
        }else{
            return (" Você foi para Exame");
        }

    }
    @Override
    public String toString(){
        return ("RA: " +getR_A() + " Nome: " +getNome() + " Média: " + calcularMedia() + " Situacao: " + situacao());
    }
}
