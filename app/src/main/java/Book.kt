
interface LibraryItem {
    fun checkOut(): Boolean
    fun returnItem(): Boolean
    fun isAvailable(): Boolean
}
class Book
    (
    val author : String ,
    val tittle : String ,
    val publicationYear : Int,
    private var isCheckedOut : Boolean = false) : LibraryItem
    {
    override fun checkOut(): Boolean
    {
        if (!isCheckedOut) {
            return true
        } else {
            return false
        }
    }

    override fun returnItem(): Boolean {
        if (isCheckedOut)
        {
           isCheckedOut = false
           return true
        }
        else
        {
            return false
        }
    }
    override fun isAvailable(): Boolean = !isCheckedOut
}

class Patron( val name : String){
    val checkedOutBook: MutableList<Book> = mutableListOf() //newList
}

class Library {
    private val books: MutableList<Book> = mutableListOf()


        fun addBook(book: Book) {
            books.add(book)
        }

        fun removeBook(book: Book) {
            books.remove(book)
        }

        fun checkOutBook(patron: Patron, book: Book): Boolean {
            if (book.isAvailable()) {
                book.checkOut()
                patron.checkedOutBook.add(book)
                return true
            }

            return false
        }

        fun returnBook(patron: Patron, book: Book): Boolean {
            if (patron.checkedOutBook.contains(book)) {
                book.returnItem()
                patron.checkedOutBook.remove(book)
                return true
            }
            return false
        }
    }




