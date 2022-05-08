package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserControl{

    @Override
    public int add(int a,int b){
        return a+b;
    }

    @Override
    public int div(int a,int b){
        return a-b;
    }

    @Override
    public int mul(int a,int b){
        return a*b;
    }

    @Override
    public int sub(int a,int b){
        return a/b;
    }
}
