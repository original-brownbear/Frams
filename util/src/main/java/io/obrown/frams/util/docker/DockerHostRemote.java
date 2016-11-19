/**
 * The MIT License.
 *
 * Copyright (c) 2016 Armin Braun.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the 'Software'), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.obrown.frams.util.docker;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Docker Host Interface to .
 * @author Armin Braun (me@obrown.io)
 * @version $Id$
 * @since 0.1
 */
public final class DockerHostRemote implements DockerHost {

    /**
     * Docker Socket Filesystem Path.
     */
    private final InetSocketAddress socket;

    /**
     * Ctor.
     * @param socket Docker Host Address
     */
    public DockerHostRemote(final InetSocketAddress socket) {
        this.socket = socket;
    }

    @Override
    public String request(final String body) throws IOException {
        try (final Socket client = new Socket()) {
            client.connect(this.socket);
            return "";
        }
    }

    @Override
    public InetAddress host() {
        return this.socket.getAddress();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException(
            "io.obrown.frams.util.docker.DockerHostLocalSocket.close"
        );
    }
}
