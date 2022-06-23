package com.udacity.shoestore.util

import com.udacity.shoestore.domain.models.Shoe

object ShoesList {
    fun getShoes(): ArrayList<Shoe> {
        val shoes: ArrayList<Shoe> = ArrayList()
        shoes.addAll(
            listOf(
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Air Jordan",
                    images = listOf("https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80")
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Air Jordan",
                    images = listOf("https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80")
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Air Jordan",
                    images = listOf("https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80")
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Air Jordan",
                    images = listOf("https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80")
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Air Jordan",
                    images = listOf("https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80")
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Air Jordan",
                    images = listOf("https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80")
                )
            )
        )
        return shoes
    }
}
