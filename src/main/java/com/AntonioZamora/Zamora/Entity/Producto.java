package com.AntonioZamora.Zamora.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author etham
 */

@Entity
@Data
@Table(name = "producto")
public class Producto {
    
    @Id
    @Column(name = "pro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proId;
    
    @Column(name = "pro_nombre")
    private String proNombre;
    
    @Column(name = "pro_descripcion")
    private String proDescripcion;
    
    @Column(name = "pro_precio")
    private int proPrecio;
    
    @Column (name = "pro_stock")
    private String stock;
    
    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Categoria categoria;   
    
}
