/**
 * Copyright (c) Michael Steindorfer <Centrum Wiskunde & Informatica> and Contributors.
 * All rights reserved.
 *
 * This file is licensed under the BSD 2-Clause License, which accompanies this project
 * and is available under https://opensource.org/licenses/BSD-2-Clause.
 */
package io.usethesource.capsule;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import io.usethesource.capsule.api.deprecated.ImmutableSetMultimap;

@RunWith(JUnitQuickcheck.class)
public class SetMultimapPropertiesTest extends
    AbstractSetMultimapProperties<Integer, Integer, ImmutableSetMultimap<Integer, Integer>> {

  public SetMultimapPropertiesTest() {
    super(ImmutableSetMultimap.class);
  }

}