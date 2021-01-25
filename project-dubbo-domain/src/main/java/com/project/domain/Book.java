package com.project.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * book
 * @author 
 */
@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

}