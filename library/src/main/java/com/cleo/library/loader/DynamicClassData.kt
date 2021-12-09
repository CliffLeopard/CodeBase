package com.cleo.library.loader

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:17:42
 * email:gaoguanling@360.cn
 * link:
 */
data class DynamicClassData(
    val placeHolderName: String,
    val targetName: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DynamicClassData

        if (placeHolderName != other.placeHolderName) return false
        if (targetName != other.targetName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = placeHolderName.hashCode()
        result = 31 * result + targetName.hashCode()
        return result
    }
}