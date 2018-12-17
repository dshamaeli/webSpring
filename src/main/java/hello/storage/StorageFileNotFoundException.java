package hello.storage;

public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String messge) {
        super(messge);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
