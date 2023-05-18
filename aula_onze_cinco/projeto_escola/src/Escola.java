
public class Escola {
    public static void main(String [] args){
        
        Aluno felipe = new Aluno();
        Aluno Ana = new Aluno();

        felipe.setNome("Felipe");
        felipe.setIdade(15);

        felipe.setNome("ana");
        felipe.setIdade(12);

        System.out.println("O aluno "+felipe.getNome() +" tem "+felipe.getIdade());
        System.out.println("O aluno "+Ana.getNome() +" tem "+Ana.getIdade());

    }
    }

