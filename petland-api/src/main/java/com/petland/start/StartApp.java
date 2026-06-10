package com.petland.start;

import com.petland.model.Cadastro;
import com.petland.model.Endereco;
import com.petland.model.Perfil;
import com.petland.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements ApplicationRunner {
    @Autowired
    private CadastroRepository cadastroRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cadastro felipe = new Cadastro();
        felipe.setNome("Felipe Pagotti");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);
        felipe.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua das Flores");
        endereco.setNumero("1234");
        felipe.setEndereco(endereco);

        cadastroRepository.save(felipe);
    }
}
