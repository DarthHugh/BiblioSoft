package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.UserBiblioSoftServiceIF;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jefferson
 */
@Named(value = "userBean")
@RequestScoped
public class UserBean implements Serializable {

    @Inject
    private UserBiblioSoftServiceIF userService;

    private List<UserBibliosoft> usersList;

    private IdentifiableBiblio userbibliosoft = new UserBibliosoft();

    public UserBean() {
    }

    public IdentifiableBiblio getUserbibliosoft() {
        return userbibliosoft;
    }

    public void setUserbibliosoft(UserBibliosoft userbibliosoft) {
        this.userbibliosoft = userbibliosoft;
    }

    public List<UserBibliosoft> getUsersList() {
        usersList = (List) userService.getAll();
        return usersList;
    }

    public String saveUserbibliosoft() {
        userService.save(userbibliosoft);
        return "users";
    }
    
    public void dellUserbibliosoft() {
        userService.remove(userbibliosoft);
    }
    
  public void remove() {
      userService.remove(userbibliosoft);
  }
  
  public void update () {
      userService.update(userbibliosoft);
  }
  
}
