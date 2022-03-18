package com.example.coddingchallengelab5;

import java.util.HashMap;

public class ShopList {
    public HashMap<String,Integer> list=new HashMap<>();
    
    public void addItem(String k) {
        if(list.containsKey(k)){
            list.put(k, list.get(k)+1);
        }else{
            list.put(k,1);
        }
    }
    public HashMap<String,Integer> getItems(){
        return list;
    }
}
