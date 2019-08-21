package com.casco.pojo;

import java.io.Serializable;
import  lombok.Data;
/**
 * @author 
 */
@Data
public class TAll implements Serializable {
    private Long id;

    private Integer absnumber;

    private String absname;

    private Integer absdirection;

    private Integer fromstaid;

    private String fromstaname;

    private Integer inentry;

    private Integer tostaid;

    private String tostaname;

    private Integer outentry;

    private String stoptime;

    private String starttime;

    private String runtime;

    private Integer runtimedirection;

    private Integer traintype;

    private static final long serialVersionUID = 1L;


}