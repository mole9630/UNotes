package com.mole9630;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Email {
    private String title;
    private String content;

    public Email() {
    }

    public String getTitle() {
        return toString(title);
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return toString(content);
    }
    public void setContent(String content) {
        this.content = content;
    }


    public String toString(String str){
        String text = "";
        if (str != null && ! str.equals("")){
            try {
                text = new String(str.getBytes("ISO-8859-1"),"utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return text;
    }
}
