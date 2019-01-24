package com.example.sureoa;

import org.junit.Test;

import java.util.Hashtable;

public class ListInfo {
     @Test
      public void MapTest(){
        String str = "200-http://localhost/20190116/20190116124126797125275962.jpg";
        String s = str.substring(0,str.indexOf("-"));
         System.out.println(s);
    }

}
