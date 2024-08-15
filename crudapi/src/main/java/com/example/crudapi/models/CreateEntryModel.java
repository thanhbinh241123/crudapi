package com.example.crudapi.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateEntryModel {
    private String title;
    private String content;
    private Integer rate;
    private String author;
}