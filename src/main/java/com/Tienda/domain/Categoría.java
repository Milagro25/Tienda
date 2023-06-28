package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoría implements Serializable { 

    //Versión de serialización
    private static final long serialVersionUID =1L;
    
    
    @Id
    @GeneratedValue( strategy =GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoriaDisponible; //Transforma en id_categoría
    private String descripcion;
    private String rutaImagen; 
    private boolean activo;

    public Categoría() {
    }

    public Categoría(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}

