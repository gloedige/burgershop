package de.iav.burgershop.exception;

import java.util.NoSuchElementException;

public class MenuIsEmptyException extends NoSuchElementException {

    public MenuIsEmptyException() {super("Content is empty!");}
}
