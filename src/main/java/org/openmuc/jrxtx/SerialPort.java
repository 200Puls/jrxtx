package org.openmuc.jrxtx;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface SerialPort extends AutoCloseable {

    InputStream getInputStream();

    OutputStream getOututStream();

    @Override
    void close() throws IOException;

}
