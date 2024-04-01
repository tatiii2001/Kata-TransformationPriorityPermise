package com.kata

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainInOrder

class ObtainUppercaseShould : FunSpec({
    /*
    *   Return the indexes belonging to the position of the uppercase letter
     */

    test("return the index for kAtA"){
        val word = ObtainUppercase()
        val result = word.indexOfUppercase("kAtA")
        result.shouldContainInOrder(1,3)
    }

    test("return the index for UmpaLumPA"){
        val word = ObtainUppercase()
        val result = word.indexOfUppercase("UmpaLumPA")
        result.shouldContainInOrder(0,4,7,8)
    }

    test("return the index for HOLA"){
        val word = ObtainUppercase()
        val result = word.indexOfUppercase("HOLA")
        result.shouldContainInOrder(0,1,2,3)
    }

    test("return the index for HoLA CocaCOLA"){
        val word = ObtainUppercase()
        val result = word.indexOfUppercase("HoLA CocaCOLA")
        result.shouldContainInOrder(0,2,3,5,9,10,11,12)
    }
})