package hello.storage;

public class StorageException extends RuntimeException {

    public StorageException(String messge) {
        super(messge);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
