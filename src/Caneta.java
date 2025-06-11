public class Caneta {
    private String marca;
    private double ponta;
    private String cor;
    private boolean tampada;

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void rabiscar(boolean tampada){
        if (tampada == false){
            System.out.println("rabiscando");
        } else {
            System.out.println("destampe a caneta primeiro");
        }

    }

    public Caneta(String cor, String marca, double ponta, boolean tampada) {
        this.cor = cor;
        this.marca = marca;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    @Override
    public String toString() {
        return
                " cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", ponta=" + ponta +
                ", tampada=" + tampada;
    }
}
