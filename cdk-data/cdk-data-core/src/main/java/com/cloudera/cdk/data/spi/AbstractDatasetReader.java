/*
 * Copyright 2013 Cloudera.
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
package com.cloudera.cdk.data.spi;

import com.cloudera.cdk.data.DatasetReader;
import java.util.Iterator;

/**
 * A common DatasetReader base class to simplify implementations.
 *
 * @param <E> The type of entities returned by this DatasetReader.
 */
public abstract class AbstractDatasetReader<E> implements DatasetReader<E> {

  @Override
  public void remove() {
    throw new UnsupportedOperationException(
            "This Dataset does not support remove.");
  }

  @Override
  public Iterator<E> iterator() {
    return this;
  }
}
