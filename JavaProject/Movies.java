package com.spring.moviecatalog.model;


public class Movies {
    private Integer id;
    private String Title;
    private String Type;
    private String imdbID;
    private String Year;
    private String Poster;
    private String category;

    public Integer getId()  {
        return id;
    }

    public void setId(Integer id){
        this.id  = id;
    }

    public String getTitle(){
        return Title;
    }

    public String setTitle(String title){
        this.Title = title;
    }

    public String getType(){
        return Type;
    }

    public void setType(String type){
        this.Type = type;
    }

    public String getImdbID(){
        return imdbId;
    }

    public void setImdbID(String imdbID){
        this.imdbID = imdbID;
    }

    public String getYear(){
        return Year;
    }

    public void setYear(String year){
        this.Year = year;
    }

    public String getPoster(){
        return Poster;
    }

    public void setPoster(String poster){
        this.Poster = poster;
    }

    public Movies(Integer id, String Title, String type, String imdvId, String Year, String poster, String category){
        this.id = id;
        this.Title = Title;
        this.Type = Type;
        this.imdbID = imdbID;
        this.Year = Year;
        this.Poster = Poster;
        this.category = category;
    }

    public Movies(){

    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

}