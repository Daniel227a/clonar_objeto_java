import java.util.Calendar;
import java.util.Date;

public class Pessoa
{
    private String nome;
    private int idade;

    Calendar hoje = Calendar.getInstance();//iniciando calendario
     private int ano =hoje.get(Calendar.YEAR);//pegando o ano
     private int mes=hoje.get(Calendar.MONTH)+1;//mes começa pelo 0
     private int dia_do_mes=hoje.get(Calendar.DAY_OF_MONTH);//dia do mes

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia_do_mes() {
        return dia_do_mes;
    }

    public void setDia_do_mes(int dia_do_mes) {
        this.dia_do_mes = dia_do_mes;
    }

    public Pessoa(int idade, String nome)
    {
        this.setIdade(idade);
        this.setNome(nome);
      this.setAno(0);
      this.setDia_do_mes(0);
      this.setMes(0);
    }
    public Pessoa(Pessoa copia)
    {
        this.setIdade(copia.getIdade());
        this.setNome(copia.getNome());
        this.setAno(getAno());
        this.setDia_do_mes(getDia_do_mes());
        this.setMes(getMes());



    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ano=" + ano +
                ", mes=" + mes +
                ", dia_do_mes=" + dia_do_mes +
                '}';
    }
}
