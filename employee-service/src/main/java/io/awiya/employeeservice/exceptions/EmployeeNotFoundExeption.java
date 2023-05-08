package io.awiya.employeeservice.exceptions;

public class EmployeeNotFoundExeption extends RuntimeException {
    public EmployeeNotFoundExeption(String message) {
        super(message);
    }
}
