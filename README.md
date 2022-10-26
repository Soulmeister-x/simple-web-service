# simple-web-service
i created this RESTful web service for university 

To get all possible REST endpoints do:  
GET "localhost:8080/rest/"

You can list all books or a single book:  
GET "localhost:8080/rest/books"  
GET "localhost:8080/rest/books/{bookId}"  

To receive details about a book, you can query the wanted details:  
GET "localhost:8080/rest/books/{bookId}?q=name&q=author&q=link"  


Order one or more books to add them to the basket:  
POST "localhost:8080/rest/orders/"  
and use JSON format in the request body:  
```JSON
[
    {
        "bookId":2,
        "amount":34
    },
    {
        "bookId":3
    }
]
```

List all orders or just a single one:  
GET "localhost:8080/rest/orders"  
GET "localhost:8080/rest/books/{bookId}"  
