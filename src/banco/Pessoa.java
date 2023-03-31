import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
     String nome;
     String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.parse(this.dataNascimento, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period periodo = Period.between(nascimento, hoje);
        return periodo.getYears();
    }
}
