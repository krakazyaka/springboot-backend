package com.rybakov.springbootbackend.payload.test;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.Serializable;


public class QuestionPayload implements Serializable {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    private String imgUrl;

    public QuestionPayload(String text, String file) {
        this.text = text;
        this.imgUrl = file;
    }


    public String getImgUrl() {
        return imgUrl;
    }

    public void setImg(String file) {
        this.imgUrl = file;
    }

    public QuestionPayload() {
    }
}
