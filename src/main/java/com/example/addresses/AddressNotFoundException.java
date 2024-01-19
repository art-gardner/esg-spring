package com.example.addresses;

public class AddressNotFoundException extends RuntimeException {

    AddressNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}