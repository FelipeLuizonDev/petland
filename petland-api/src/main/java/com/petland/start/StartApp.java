package com.petland.start;

import com.petland.model.Cadastro;
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
        felipe.setId(1);
        felipe.setNome("Felipe Luizon");
        cadastroRepository.save(felipe);
    }
}
