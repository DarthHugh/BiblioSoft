package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Author;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierAuthor;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.AuthorService;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.AuthorServiceIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jefferson
 */
@Named(value = "authorBean")
@RequestScoped
public class AuthorBean extends AbstractBean{
    
    @Inject
    private AuthorServiceIF authorService;

    private List<Author> authors;
    
    @Inject
    @QualifierAuthor
    private IdentifiableBiblio author;

    public AuthorBean() {
    }

    public AuthorServiceIF getAuthorService() {
        return authorService;
    }

    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    public List<Author> getAuthors() {
        authors = (List) authorService.findAll();
        return authors;
    }

    public IdentifiableBiblio getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String update() {
        authorService.update(author);
        return "authors";
    }

    @Override
    public InterfaceCrudService getService() {
        return this.authorService;
    }

    @Override
    public IdentifiableBiblio getIdentifiableBiblio() {
        return this.author;
    }
    
    @Override
    public void limparForm(){
        setAuthor(new Author());
    }
    
    
    
}
