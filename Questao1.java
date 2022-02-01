import java.util.*;
import java.time.*;

class Questao1 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa("Luka", 24, 2.02);
        agenda.armazenaPessoa("James", 38, 2.07);
        System.out.println(agenda.buscaPessoa("Luka"));
        agenda.imprimeAgenda();
        agenda.imprimePessoa(1);
        agenda.removePessoa("Luka");
        agenda.imprimeAgenda();
    }
}

class Pessoa {
    private String n = "";
    private Date Data;
    private Double A;
    private int Idade;

    public void setN(String n) {
        this.n = n;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public void setTamanho(Double tamanho) {
        this.A = tamanho;
    }

    public void setIdade(int Year) {
        this.Idade = Year;
    }

    public String getN() {
        return n;
    }

    public Date getData() {
        return Data;
    }

    public Double getTamanho() {
        return A;
    }

    public int getIdade() {
        return Idade;
    }

    public void imprimi() {
        System.out.println("N: " + n);
        System.out.println("Data: " + Data);
        System.out.println("A: " + A);
    }

    public int calculaIdade() {
        Calendar dN = new GreogorianCalendar();
        dN.setTime(Data);
        Calendar today = Calendar.getInstance();
        int idade = today.get(Calendar.YEAR) - dN.get(Calendar.YEAR);
        this.Idade = idade;
        return idade;
    }
}

class Agenda {
    private Pessoa pessoas[] = new Pessoa[10];

    public Agenda() {
        for (int i = 0; i <= 9; i++) {
            pessoas[i] = new Pessoa();
        }
    }

    public void armazenaPessoa(String n, int idade, double a) {
        for (int i = 0; i < 10; i++) {
            if (pessoas[i].getN() == "") {
                pessoas[i].setN(n);
                pessoas[i].setTamanho(a);
                pessoas[i].setIdade(idade);
                i = 10;
            }
        }
    }

    public void removePessoa(String n) {
        for (int i = 0; i < 10; i++) {
            if (pessoas[i].getN() == n) {
                pessoas[i].setN("");
                pessoas[i].setTamanho(0.0);
                pessoas[i].setIdade(0);
                i = 10;
            }
        }
    }

    public int buscaPessoa(String n) {
        for (int i = 0; i < 10; i++) {
            if (pessoas[i].getN() == n) {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        for (int i = 0; i < 10; i++) {
            pessoas[i].imprimi();
            System.out.println("");
        }
    }

    public void imprimePessoa(int x) {
        pessoas[x].imprimi();
    }
}
