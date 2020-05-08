package one.block.eosiojava.error.serializationProvider;

import org.jetbrains.annotations.NotNull;

/**
 * Error class is used when there is an exception while attempting to call deserializeAbi() of
 * Serialization Provider
 */
public class SerializeContextFreeDataError extends SerializationProviderError {

    public SerializeContextFreeDataError() {
    }

    public SerializeContextFreeDataError(@NotNull String message) {
        super(message);
    }

    public SerializeContextFreeDataError(@NotNull String message,
            @NotNull Exception exception) {
        super(message, exception);
    }

    public SerializeContextFreeDataError(@NotNull Exception exception) {
        super(exception);
    }
}