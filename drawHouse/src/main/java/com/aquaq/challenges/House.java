package com.aquaq.challenges;

public class House {

    final int height;

    public House(final int height){
        this.height = height;
    }

    public void drawHouse(){
        drawRoof();
        drawStructure();
    }

    private void drawRoof() {
        for (int i=1; i<=height; i++) {
            for(int j=0; j<height*2; j++){
                if(j==height-i){
                    System.out.print("/");
                } else if (j==height+i-1){
                    System.out.print("\\");
                }
                else {
                    if (i==height) {
                        System.out.print("_");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    private void drawStructure() {
        for (int i=height; i>0; i--) {
            for(int j=0; j<height*2; j++){
                if(j==0 || j==(height*2)-1){
                    System.out.print("|");
                } else {
                    if (i==1) {
                        System.out.print("_");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
