package com.example.annchih.classplanner;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by AnnChih on 11/16/15.
 */
@ParseClassName("classplanner")
public class ClassPlanner extends ParseObject{

    public String get_class_id(){

        return getString("class_id");
    }
    public void set_class_id(String id){

        put("class_id",id);
    }
    public String get_class_name(){
        return getString("class_name");
    }
    public void set_class_name(String name){
        put("class_name",name);
    }
    @Override
    public String toString(){
        return getString("class_id") + "\n" + getString("class_name");
    }
    /*public boolean get_taken(){
        return getBoolean("taken");
    }
    public void set_taken(boolean taken){
        put("taken",taken);
    }
    public int get_plan_to_take(){
        return getInt("plan_to_take");
    }
    public void set_plan_to_take(int plan_to_take){
        put("plan_to_take",plan_to_take);
    }*/



}

/*public class Classplan
{
    String id;
    String name;

    public set_string( String id)


}*/
