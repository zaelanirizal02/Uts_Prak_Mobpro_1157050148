package com.example.utsrecycler;

public class Model {
    private String tittle, description;
    private int img;

    public String getTittle(){
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg(){
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
