package com.cleo.library

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:17:42
 * email:gaoguanling@360.cn
 * link:
 */
data class DynamicClassData(
    val name: String,
    val data: ByteArray,
    val off: Int,
    val len: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DynamicClassData

        if (name != other.name) return false
        if (off != other.off) return false
        if (len != other.len) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + off
        result = 31 * result + len
        return result
    }
}