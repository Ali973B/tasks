package exceptions;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class UrlNotFound extends RuntimeException{
    private String message;

    public UrlNotFound(String message) {
        this.message = message;
    }

    public UrlNotFound() {
    }
}
