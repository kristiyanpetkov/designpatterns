package com.clouway.pool;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class NoFreeResource extends RuntimeException {
    private String message = "No free resource";

    public NoFreeResource() {
    }

    public NoFreeResource(String message) {
        message = message;
    }


    public String getMessage() {
        return this.message;
    }
}
