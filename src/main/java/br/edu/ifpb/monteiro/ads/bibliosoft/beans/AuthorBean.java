    package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Author;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.AuthorService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jefferson
 */
@Named(value = "authorBean")
@RequestScoped
public class AuthorBean implements Serializable {
    
    @EJB
    private AuthorService authorService;

    private List<Author> authors;
    
    
    private Author author = new Author();

    public AuthorBean() {
    }
    
    

    public AuthorService getAuthorService() {
        return authorService;
    }

    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    public List<Author> getAuthors() {
        authors = authorService.getAll();
        return authors;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String save() {
        authorService.save(author);
        return "authors";
    }

    public void remove() {
        
        authorService.remove(author);
    }

    public String update() {
        authorService.update(author);
        return "authors";
    }


    
    
}
