package com.example.designpatternssample

/**
 * Created by Anil Yadav on 16/03/23.
 */
class Humburger private constructor(
    val cheese: Boolean,
    val onion: Boolean,
    val whiteSauce: Boolean
) {

    class Builder() {
        private var cheese: Boolean = false
        private var onion: Boolean = false
        private var whiteSauce: Boolean = false

        fun cheese(value: Boolean) = apply { cheese = value }
        fun onion(value: Boolean) = apply { onion = value }
        fun whiteSauce(value: Boolean) = apply { whiteSauce = value }

        fun build() = Humburger(cheese = cheese, onion = onion, whiteSauce = whiteSauce)

    }
}