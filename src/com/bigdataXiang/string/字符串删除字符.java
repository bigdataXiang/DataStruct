package com.bigdataXiang.string;/**
 * Created by timeloveboy on 17-2-21.
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class 字符串删除字符 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CharSequence S="ABCDEAFDWEAAFWEFAEFAWFAWFAWEFWGAWBVDVCDAGWECEDVWEGBAAWEFAWEBWAE";

    }
    public static char[]  Delete(char[] src,char c){
        int n=0;
        for(int i=0;i<src.length;i++){
            if(src[i]!=c){
                src[n++]=src[i];
            }
        }
        return src;
    }
}
