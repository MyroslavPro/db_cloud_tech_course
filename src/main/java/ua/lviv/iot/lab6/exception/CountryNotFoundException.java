package ua.lviv.iot.lab6.exception;

public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(Integer id) {
        super("Could not find 'country' with id=" + id);
    }
}
