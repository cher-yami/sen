package com.ccstudent.gcccusuarioservice.repository;

import com.ccstudent.gcccusuarioservice.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
