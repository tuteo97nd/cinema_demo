package com.dts.cinema_demo.Domain.Reponse;

public class Reponse {
    private  int rc;
    private String rd;
    public  Reponse(){
        this.rc=0;
        this.rd="OK";
    }
    public void ServerErr(){
        this.rc=-1;
        this.rd="Server Err";
    }
}
