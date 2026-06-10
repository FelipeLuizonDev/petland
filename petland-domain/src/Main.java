import com.petland.domain.atendimento.Atendimento;
import com.petland.domain.atendimento.AtendimentoStatus;
import com.petland.domain.atendimento.AtendimentoTipo;
import com.petland.domain.cadastro.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.setId(1);
        cadastro.setNome("Felipe Luizon");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);
        cadastro.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua das Açucenas");
        endereco.setNumero("1234");
        cadastro.setEndereco(endereco);

        Animal animal = new Animal();
        animal.setId(1);
        animal.setNome("Malu");
        animal.setAniversario(LocalDate.of(2018, 06,  05));
        animal.setEspecie(Especie.CACHORRO);

        ProdutoServico serivco = new ProdutoServico();
        serivco.setId(1);
        serivco.setServico(true);
        serivco.setName("Tosa");
        serivco.setValor(60.0);

        Atendimento atendimento = new Atendimento();
        atendimento.setId(1);
        atendimento.setData(LocalDate.now());
        atendimento.setHora(LocalTime.now());
        atendimento.setDescricao(serivco.getName());
        atendimento.setValor(serivco.getValor());
        atendimento.setAtendimentoStatus(AtendimentoStatus.REALIZANDO);
        atendimento.setAtendimentoTipo(AtendimentoTipo.HIGIENIZACAO);
        atendimento.setSolicitante(cadastro);
        atendimento.setPaciente(animal);
        atendimento.setServico(serivco);
    }
}