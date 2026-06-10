import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.Endereco;
import com.petland.domain.cadastro.Perfil;

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

        System.out.println("Cadastro criado\nNome: " + cadastro.getNome());
        System.out.println("Endereço: " + cadastro.getEndereco().getLogradouro() + ", " + cadastro.getEndereco().getNumero());

        System.out.println(cadastro);
    }
}