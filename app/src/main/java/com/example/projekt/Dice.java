package com.example.projekt;

import java.util.ArrayList;

public class Dice {
    private int value;
    private int IdImage;
    private boolean isClicked;
    private ArrayList<Integer> allImage = new ArrayList<>();

    public Dice()
    {
        this.value= (int) (Math.random()*5);
        this.isClicked= false;
        this.IdImage = allImage.get(value-1);
    }
    private void ImageArray()
    {
        allImage.add(R.drawable.dice_1);
        allImage.add(R.drawable.dice_2);
        allImage.add(R.drawable.dice_3);
        allImage.add(R.drawable.dice_4);
        allImage.add(R.drawable.dice_5);
        allImage.add(R.drawable.dice_6);
    }

    public int getValue() {
        return value;
    }

    public int getIdImage() {
        return IdImage;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public ArrayList<Integer> getAllImage() {
        return allImage;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setIdImage(int idImage) {
        IdImage = idImage;
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }
}
