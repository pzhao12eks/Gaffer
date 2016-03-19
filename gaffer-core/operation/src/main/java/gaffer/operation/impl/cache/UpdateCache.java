/*
 * Copyright 2016 Crown Copyright
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

package gaffer.operation.impl.cache;

import gaffer.operation.AbstractGetOperation;
import gaffer.operation.AbstractOperation;
import gaffer.operation.cache.CacheOperation;

public class UpdateCache extends AbstractGetOperation<Object, Object> implements CacheOperation {
    public static final String ALL = "ALL";
    private String key;

    public UpdateCache() {
        this(ALL);
    }

    public UpdateCache(final String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public static class Builder extends AbstractOperation.Builder<UpdateCache, Iterable<Object>, Iterable<Object>> {
        public Builder() {
            super(new UpdateCache());
        }

        public Builder key(final String key) {
            getOp().setKey(key);
            return this;
        }

        @Override
        public Builder option(final String name, final String value) {
            super.option(name, value);
            return this;
        }
    }
}
