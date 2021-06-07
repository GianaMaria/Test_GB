package com.example.test_gb

class MyClassMethodForTest {
    companion object {
        fun getArray() = arrayOf(5,6,2,4,7,1)

        fun factorial(number: Int): Int {
            var cur = 1;
            for (i in 1..number) {
                cur *= i
            }
            return cur
        }

        fun getCats(name: String): List<Cat>? {
            val cats = arrayListOf<Cat>(
                Cat("Barsik", 3),
                Cat("Pushok", 1),
                Cat("Lily", 7),
                Cat("Train", 13),
            )
            val cat = cats.filter { it.name.equals(name, ignoreCase = true) }
            if (cat.isEmpty()) {
                return null
            }
            return cat
        }
    }
}

data class Cat(
    var name: String,
    var age: Int,
)
