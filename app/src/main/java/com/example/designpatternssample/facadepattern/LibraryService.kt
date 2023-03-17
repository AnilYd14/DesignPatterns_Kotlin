package com.example.designpatternssample.facadepattern

/**
 * Created by Anil Yadav on 17/03/23.
 */

enum class BookType {
    FICTION, NONFICTION, TECHNOLOGY
}

class LibraryService() {

    private var fiction: BookGenre? = null
    private var nonFiction: BookGenre? = null
    private var technology: BookGenre? = null

    init {
        fiction = Fiction()
        nonFiction = NonFiction()
        technology = Technology()
    }

    fun borrowBook(type: BookType?, name: String?) {
        val books: List<Book?>? = when (type) {
            BookType.FICTION -> fiction?.getBookList()
            BookType.NONFICTION -> nonFiction?.getBookList()
            else -> technology?.getBookList()
        }
        val book: Book? = BookService.findBookByName(books, name)

    }
}

object BookService {

    fun findBookByName(books: List<Book?>?, name: String?): Book?{

        books?.forEach {
            if(it?.name.equals(name,ignoreCase = true))
                return it
        }
        return null

    }

}
