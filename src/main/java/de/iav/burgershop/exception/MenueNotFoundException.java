package de.iav.burgershop.exception;

import java.util.NoSuchElementException;

public class MenueNotFoundException extends NoSuchElementException {

    public MenueNotFoundException(String id){
        super("Menu with ID: " + id + " could not be found!");
    }

}


