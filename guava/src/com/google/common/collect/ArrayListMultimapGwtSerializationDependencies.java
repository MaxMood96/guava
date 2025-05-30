/*
 * Copyright (C) 2016 The Guava Authors
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

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A dummy superclass to support GWT serialization of the element types of an {@link
 * ArrayListMultimap}. The GWT supersource for this class contains a field for each type.
 *
 * <p>For details about this hack, see {@code GwtSerializationDependencies}, which takes the same
 * approach but with a subclass rather than a superclass.
 *
 * <p>TODO(cpovirk): Consider applying this subclass approach to our other types.
 */
@GwtCompatible(emulated = true)
abstract class ArrayListMultimapGwtSerializationDependencies<
        K extends @Nullable Object, V extends @Nullable Object>
    extends AbstractListMultimap<K, V> {
  ArrayListMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
    super(map);
  }
  // TODO(cpovirk): Maybe I should have just one shared superclass for AbstractMultimap itself?
}
