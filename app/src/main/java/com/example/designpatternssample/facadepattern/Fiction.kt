package com.example.designpatternssample.facadepattern

/**
 * Created by Anil Yadav on 17/03/23.
 */
class Fiction: BookGenre {
    override fun getBookList(): List<Book> {
       return emptyList()
    }
}