package com.kata

class ObtainUppercase {
    fun indexOfUppercase(word: String): List<Int> {
        val listOfIndexes : MutableList<Int> = mutableListOf()
        val chars = word.toCharArray()
        println(chars)
        for ((index, char) in chars.withIndex()){
            if(char.isUpperCase()){
                listOfIndexes.add(index)
            }
        }
        return listOfIndexes.toList()
    }

}
