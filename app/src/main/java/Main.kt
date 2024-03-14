fun main()
{
    val library= Library()
    val patron1=Patron("Fatma Rabei")
    val book1 = Book("John Gray","Men Are from Mars, Women Are from Venus",1992,false)
    val book2 = Book("Harry Potter and the Philosopher's Stone","J.K. Rowling", 1997)
    val book3=Book("naguib mahfouz","Al-Sukkaria",1998)

    println("Patron Name: ${patron1.name}")
    library.addBook(book1)
    println("Book added: ${book1.tittle}")
    library.addBook(book2)
    println("Book added: ${book2.tittle}")
    library.addBook(book3)
    println("Book added: ${book3.tittle}")

    val checkOutSuccess = library.checkOutBook(patron1, book1)
     println("book is avaliable: ${book1.isAvailable()}")
    println("book is avaliable: ${book2.isAvailable()}")
    println("book is avaliable: ${book3.isAvailable()}")
    println("Book checked out: $checkOutSuccess")

    val returnSuccess = library.returnBook(patron1, book1)
    println("Book returned: $returnSuccess")
}


