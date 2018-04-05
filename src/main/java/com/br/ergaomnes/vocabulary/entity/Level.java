package com.br.ergaomnes.vocabulary.entity;

import java.util.List;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva@accurate.com.br>
 */
public class Level {
    
    private Long id;
    //Número 04
    private Integer number;
    //Básico
    private String stage;
    //Dentro de Um nível eu posso ter mais de uma unidade;
    private List<Unity> unity;
    
    
}
