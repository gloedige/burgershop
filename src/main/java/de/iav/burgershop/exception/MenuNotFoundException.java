package de.iav.burgershop.exception;

import java.util.NoSuchElementException;

public class MenuNotFoundException extends NoSuchElementException {

    public MenuNotFoundException(String id){
        super("Menu with ID: " + id + " could not be found!");
    }

}


