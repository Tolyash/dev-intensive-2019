package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        return if( fullName.isNullOrBlank()){
            null to null
        } else {
            val parts: List<String>? = fullName?.split(" ")
            val firstName = parts?.getOrNull(0)
            val lastName = parts?.getOrNull(1)
            firstName to lastName
        }
    }

    fun transliteration(payload: String, divider: String = " "):String {
return ""
    }

    fun toInitials(firstName: String?, lastName: String?):String {
        val name = firstName?.trim()
        val surName = lastName?.trim()
        return when{
        !name.isNullOrEmpty() && !surName.isNullOrEmpty() -> name[0].toUpperCase().toString() + surName[0].toUpperCase().toString()

            else -> "null"
        }
    }
}