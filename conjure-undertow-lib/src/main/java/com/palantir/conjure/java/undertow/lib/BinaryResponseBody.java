/*
 * (c) Copyright 2018 Palantir Technologies Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.conjure.java.undertow.lib;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Streamed binary response data with Content-Type <code>application/octet-stream</code>.
 */
public interface BinaryResponseBody {

    /**
     * Invoked to write data to the response stream. Called exactly once.
     *
     * Implementations do not need to close the {@link OutputStream} parameter.
     *
     * Throwing an exception causes clients to fail in one of two ways:
     * If the response has not been committed (neither close nor flush has been
     * called and the buffer size has not been exceeded) a standard conjure
     * error is sent, otherwise the response is ended resulting in an I/O
     * failure on the client.
     */
    void write(OutputStream responseBody) throws IOException;

}
