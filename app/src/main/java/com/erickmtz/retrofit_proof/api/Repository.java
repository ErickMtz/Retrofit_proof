package com.erickmtz.retrofit_proof.api;

/**
 * Created by erick on 31/10/16.
 */
public class Repository {
    private String id;
    private String name;

    @Override
    public String toString(){
        return id + "/" + name;
    }
}
