package com.example.designpatternssample.facadepattern

/**
 * Created by Anil Yadav on 17/03/23.
 */
class Technology: BookGenre {
    override fun getBookList(): List<Book> {
        //will return books of technology
        return emptyList()
    }
}