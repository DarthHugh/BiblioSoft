package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.UserBiblioSoftService;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author jefferson
 */
@Named(value = "userBean")
@RequestScoped
public class UserBean implements Serializable {

    @EJB
    private UserBiblioSoftService userService;

    private List<UserBibliosoft> usersList;

    private UserBibliosoft userbibliosoft = new UserBibliosoft();

    public UserBean() {
    }

    public UserBibliosoft getUserbibliosoft() {
        return userbibliosoft;
    }

    public void setUserbibliosoft(UserBibliosoft userbibliosoft) {
        this.userbibliosoft = userbibliosoft;
    }

    public List<UserBibliosoft> getUsersList() {
        usersList = userService.getAll();
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
