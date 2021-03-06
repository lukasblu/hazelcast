/*
 * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.cache.impl;

import com.hazelcast.nio.serialization.Data;
import com.hazelcast.nio.serialization.IdentifiedDataSerializable;

/**
 * Internal event data object used in publish - dispatch
 * All key value and oldValue are represented in {@link Data}
 *
 * @see com.hazelcast.cache.impl.CacheService#publishEvent(String, CacheEventSet, int)
 * @see com.hazelcast.cache.impl.CacheService#dispatchEvent(Object, CacheEventListener)
 */
public interface CacheEventData
        extends IdentifiedDataSerializable {

    CacheEventType getCacheEventType();

    String getName();

    Data getDataKey();

    Data getDataValue();

    Data getDataOldValue();

    boolean isOldValueAvailable();
}
