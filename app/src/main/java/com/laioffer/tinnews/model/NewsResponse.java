package com.laioffer.tinnews.model;

import java.util.List;

public class NewsResponse {
    public Integer totalResults;
    public List<Article> articles;
    public String code;
    public String message;
    public String status;

    @Override
    public String toString() {
        return "NewsResponse{" +
                "totalResults=" + totalResults +
                ", articles=" + articles +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
