/*******************************************************************************
 * Copyright (c) 2013-2015 CWI All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 * * Michael Steindorfer - Michael.Steindorfer@cwi.nl - CWI
 *******************************************************************************/
package io.usethesource.capsule;

import java.util.Collection;
import java.util.Iterator;

public interface Set<K> extends Iterable<K> {

  boolean containsAll(final Collection<?> c);

  K get(final Object o);

  boolean contains(final Object o);

  Iterator<K> iterator();
  
  

  public static interface Immutable<K> extends Set<K> {

    boolean isTransientSupported();

    Set.Transient<K> asTransient();

    Set.Immutable<K> insert(final K key);

    Set.Immutable<K> insertAll(final java.util.Set<? extends K> set);

    Set.Immutable<K> remove(final K key);

    Set.Immutable<K> removeAll(final java.util.Set<? extends K> set);

    Set.Immutable<K> retainAll(final java.util.Set<? extends K> set);

  }

  public static interface Transient<K> extends Set<K> {

    Set.Immutable<K> asImmutable();

    boolean insert(final K key);

    boolean insertAll(final java.util.Set<? extends K> set);

    boolean remove(final K key);

    boolean removeAll(final java.util.Set<? extends K> set);

    boolean retainAll(final java.util.Set<? extends K> set);

  }

}