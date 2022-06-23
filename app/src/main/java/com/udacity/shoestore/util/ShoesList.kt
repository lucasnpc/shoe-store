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
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed aliquet risus. Morbi " +
                            "egestas lectus nisi, in sagittis ex egestas ut. Sed ornare lorem ut diam feugiat molestie. " +
                            "Duis sodales neque velit, ut pellentesque velit sagittis non. Sed sed mauris ut lorem aliquam " +
                            "ornare in eu felis. Etiam ac finibus risus. Proin pretium volutpat ligula, in scelerisque lectus porttitor et",
                    images = listOf(
                        "https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MnwxMj" +
                                "A3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80"
                    )
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed aliquet risus. " +
                            "Morbi egestas lectus nisi, in sagittis ex egestas ut. Sed ornare lorem ut diam feugiat " +
                            "molestie. Duis sodales neque velit, ut pellentesque velit sagittis non. Sed sed mauris ut " +
                            "lorem aliquam ornare in eu felis. Etiam ac finibus risus. Proin pretium volutpat ligula, in " +
                            "scelerisque lectus porttitor et",
                    images = listOf(
                        "https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=Mnwx" +
                                "MjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80"
                    )
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                            "Donec sed aliquet risus. Morbi egestas lectus nisi, in sagittis ex egestas ut." +
                            " Sed ornare lorem ut diam feugiat molestie. Duis sodales neque velit, ut " +
                            "pellentesque velit sagittis non. Sed sed mauris ut lorem aliquam ornare in eu felis." +
                            " Etiam ac finibus risus. Proin pretium volutpat ligula, in scelerisque lectus porttitor et",
                    images = listOf(
                        "https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ix" +
                                "id=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80"
                    )
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed aliquet " +
                            "risus. Morbi egestas lectus nisi, in sagittis ex egestas ut. Sed ornare lorem ut diam" +
                            " feugiat molestie. Duis sodales neque velit, ut pellentesque velit sagittis non. Sed" +
                            " sed mauris ut lorem aliquam ornare in eu felis. Etiam ac finibus risus. Proin pretium " +
                            "volutpat ligula, in scelerisque lectus porttitor et",
                    images = listOf(
                        "https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=M" +
                                "nwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80"
                    )
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed aliquet risus. " +
                            "Morbi egestas lectus nisi, in sagittis ex egestas ut. Sed ornare lorem ut diam feugiat " +
                            "molestie. Duis sodales neque velit, ut pellentesque velit sagittis non. Sed sed mauris " +
                            "ut lorem aliquam ornare in eu felis. Etiam ac finibus risus. Proin pretium volutpat " +
                            "ligula, in scelerisque lectus porttitor et",
                    images = listOf(
                        "https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&" +
                                "ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80"
                    )
                ),
                Shoe(
                    name = "ABCD",
                    size = 38.0,
                    company = "Nike",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed aliquet " +
                            "risus. Morbi egestas lectus nisi, in sagittis ex egestas ut. Sed ornare lorem ut diam " +
                            "feugiat molestie. Duis sodales neque velit, ut pellentesque velit sagittis non. Sed sed " +
                            "mauris ut lorem aliquam ornare in eu felis. Etiam ac finibus risus. Proin pretium volutpat " +
                            "ligula, in scelerisque lectus porttitor et",
                    images = listOf(
                        "https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MnwxMj" +
                                "A3fDB8MHxzZWFyY2h8MXx8c2hvZXxlbnwwfHwwfHw%3D&w=1000&q=80"
                    )
                )
            )
        )
        return shoes
    }
}
