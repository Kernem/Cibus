package com.example.cibus

class Greeting {
    fun greeting(): String {
        return "Cibus says hello from ${Platform().platform}!"
    }
}