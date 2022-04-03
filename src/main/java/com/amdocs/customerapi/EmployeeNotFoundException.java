package com.amdocs.customerapi;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
      super("Could not find employee " + id);
    }
  }