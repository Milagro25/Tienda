package com.Tienda.service.impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoría;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoría> getcategorias(boolean activos) {
       List<Categoría> lista = categoriaDao.findAll();
       
       if(activos) {
           //Para remover las categorias donde activo = faalso
           lista.removeIf(x-> x.isActivo());
       }
       
       return lista;
    }
    
}
