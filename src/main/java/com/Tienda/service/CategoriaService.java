package com.Tienda.service;

import com.Tienda.domain.Categoría;
import java.util.List;

public interface CategoriaService {
    //Método de retorno de categorías 
    
    public List<Categoría> getcategorias(boolean activos);
    

}
