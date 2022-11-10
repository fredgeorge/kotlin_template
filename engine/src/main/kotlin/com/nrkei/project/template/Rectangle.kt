/*
 * Copyright (c) 2022 by Fred George
 * May be used freely except for training; license required for training.
 * @author Fred George  fredgeorge@acm.org
 */

package com.nrkei.project.template

// Understands a four-sided polygon with sides at right angles
class Rectangle(private val length: Double, private val width: Double) {
    fun area() = length * width
}
