package com.bigdataXiang.regexp;

import com.bigdataXiang.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ZhouXiang on 2016/7/31.
 */
public class Regexp {
    public void test(){
        String test="0232323353465" ;
        Pattern p=Pattern.compile("[123]+");
        p.split(test);
        Matcher m=p.matcher(test);
        while (m.find()){
            Log.v("\t"+m.group());
        }
    }
}
