package com.AntonioZamora.Zamora.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author etham
 */

@Entity
@Data
@Table(name = "categoria")
public class Categoria {
    
    @Id
    @Column(name = "cat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catId;
    
    @Column(name = "cat_nombre")
    private String catNombre;
    
    @Column(name = "cat_descripcion")
    private String catDescripcion;     
    
}
