package com.amdocs.customerapi;

class CustomerNotFoundException extends RuntimeException {

    CustomerNotFoundException(Long id) {
      super("Could not find customer " + id);
    }
  }
