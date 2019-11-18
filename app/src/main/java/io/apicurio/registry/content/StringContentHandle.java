/*
 * Copyright 2019 Red Hat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apicurio.registry.content;

import java.nio.charset.StandardCharsets;

/**
 * @author Ales Justin
 */
class StringContentHandle extends AbstractContentHandle {

    StringContentHandle(String content) {
        this.content = content;
    }

    @Override
    public byte[] bytes() {
        if (bytes == null) {
            bytes = content.getBytes(StandardCharsets.UTF_8);
        }
        return bytes;
    }

    @Override
    public String content() {
        return content;
    }
}
