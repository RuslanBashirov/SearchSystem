package networking;

import java.io.IOException;

public interface OnRequestCallback {
    byte[] handleRequest(byte[] requestPayload) throws IOException;

    String getEndpoint();
}
