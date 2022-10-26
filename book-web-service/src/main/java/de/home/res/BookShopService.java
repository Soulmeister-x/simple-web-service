package de.home.res;

import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import de.home.oehler.Book;
import de.home.oehler.Books;

/**
* Root resource (exposed at "books" path)
*/

@Path("/books")
public class BookShopService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() 
    {
        return Books.getInstance().getBookList();
    }

    
    @Path("{bookId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getBookDetail(@PathParam("bookId") int id, @QueryParam("q") List<String> q)
    {
        Book b = Books.getInstance().getBookById(id);

        if (q.isEmpty())
            return b.toJsonObject();

        JsonObjectBuilder j = Json.createObjectBuilder();

        for (String d : q) {            
            switch(d) {
                case "id":
                    j.add(d, b.getId());
                    break;
                case "name": 
                    j.add(d, b.getName());
                    break;
                case "author": 
                    j.add(d, b.getAuthor());
                    break;
                case "link":
                    j.add(d, b.getLink());
                    break;
                default: break;
            }
        }
        
        return j.build();

    }
    
}
