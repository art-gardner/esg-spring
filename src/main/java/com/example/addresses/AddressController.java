package com.example.addresses;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class AddressController {

    private final AddressRepository repository;

    AddressController(AddressRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/addresses")
    Address newAddress(@RequestBody Address newEmployee) {
        return repository.save(newEmployee);
    }

    // Single item

    @GetMapping("/address/{ref}")
    @ResponseBody
    Address one(@PathVariable Long ref) {

        return repository.findById(ref)
                .orElseThrow(() -> new AddressNotFoundException(ref));
    }

}