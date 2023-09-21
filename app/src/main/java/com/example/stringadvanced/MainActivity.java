package com.example.stringadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String nameString ="A,B,C,D,F";
//        String[] names = nameString.split(", ");
//        for (String name : names){
//            Log.i("Name",name);
//        }
//------------------------------------------------------------
//        String geometry = "Геометрия";
//        String meter = geometry.substring(3,6);
//        Log.i("Name",meter);
// ------------------------------------------------------------
//        String river = "Gsdoejaspw";
//        Pattern pattern = Pattern.compile("Gs(.*?)pw");
//        Matcher matcher = pattern.matcher(river);
//        while (matcher.find()) {
//            Log.i("Name",matcher.group(1));
//        }
// ------------------------------------------------------------
        String url = "<div class=\"planter-block__image\">\n" +
                "\t\t\t\t<a href=\"/rasteniya/limonnoe-derevo/\">\n" +
                "\t\t\t\t\t<img \n" +
                "\t\t\t\t\t\t\tsrc=\"/upload/resize_cache/iblock/af8/300_300_14bd9de518dfe6e8e138a6a8540ab5874/af8df1c3637d937d0889e5b509e31bdc.jpg\" \n" +
                "\t\t\t\t\t\t\talt=\"Лимонное дерево\"\n" +
                "\t\t\t\t\t\t\ttitle=\"Лимонное дерево\">\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</div>";
        Pattern patternImg = Pattern.compile("<img \\n\" +\n" +
                "                \"\\t\\t\\t\\t\\t\\t\\tsrc=\\\"(.*?)\\\" \\n\"");
        Pattern patternName = Pattern.compile("title=\"(.*?)\\\">\\n\"");
        Matcher matcherImg = patternImg.matcher(url);
        Matcher matcherName = patternName.matcher(url);
        while (matcherImg.find()) {
            Log.i("Img", matcherImg.group(1));
        }
        while (matcherName.find()) {
            Log.i("Name", matcherName.group(1));
        }
    }
}