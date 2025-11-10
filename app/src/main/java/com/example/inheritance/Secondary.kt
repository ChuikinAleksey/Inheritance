package com.example.inheritance

open class Secondary: BaseClass() {
    override fun role() {
        println("Knight of the House of BaseClass")
    }
}