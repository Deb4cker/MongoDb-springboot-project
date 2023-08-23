package com.br.mongodblrng_application.Exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(){
        super("User Not found");
    }
}
