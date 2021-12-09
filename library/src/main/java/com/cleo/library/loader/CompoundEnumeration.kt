package com.cleo.library.loader

import java.util.*

class CompoundEnumeration<E>(private val enums: Array<Enumeration<E>?>) : Enumeration<E> {
    private var index = 0
    private operator fun next(): Boolean {
        while (index < enums.size) {
            if (enums[index] != null && enums[index]!!.hasMoreElements()) {
                return true
            }
            index++
        }
        return false
    }

    override fun hasMoreElements(): Boolean {
        return next()
    }

    override fun nextElement(): E {
        if (!next()) {
            throw NoSuchElementException()
        }
        return enums[index]!!.nextElement()
    }
}