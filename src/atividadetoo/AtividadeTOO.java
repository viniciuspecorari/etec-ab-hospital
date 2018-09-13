package atividadetoo;

public class AtividadeTOO {

    public static void main(String[] args) {
        
        /*p.getNome();
        p.getCpf();
        p.getRG();
         p.logar("senha");
        p.getSobrenome();
       */
        
        
        Enfermeiro e = new Enfermeiro();
        e.getCorem();
        e.getSenhaEnfermeiro();
        e.logar("senha");

        Medico m = new Medico();
        m.getCrm();
        m.getEspecialidades();
        m.getSenhaMedico();
        m.logar("senha");

        Paciente a = new Paciente();
        a.getCodPaciente();
        a.getSenhaFuncionario();        
        a.logar("senha");

    }

}
