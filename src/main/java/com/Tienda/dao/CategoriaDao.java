package com.Tienda.dao;

import com.Tienda.domain.Categoría;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoría, Long> {
    //Mas adelante, vamos a tener metodos ampliados
}
