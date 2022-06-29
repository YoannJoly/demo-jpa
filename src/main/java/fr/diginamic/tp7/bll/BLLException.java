package fr.diginamic.tp7.bll;

public class BLLException extends Exception {
    public BLLException(String message) {
        super(message);
    }

    public BLLException(String message, Throwable cause) {
        super(message, cause);
    }

    public BLLException(Throwable cause) {
        super(cause);
    }
}

