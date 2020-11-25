package com.example.helloWorld.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author ：louzhengjie
 * @date ：Created in 2020/11/19 3:33 下午
 */
@Data
public class DateDTO {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date thisDay;

}
