package com.gagro.backend.repository;

import com.gagro.backend.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //criar query SQL específica para otimizar a consulta e diminuir a dependência no framework
    //Sugestão: SELECT campos desejados FROM tabela
    Usuario findByEmail(String email);
}
