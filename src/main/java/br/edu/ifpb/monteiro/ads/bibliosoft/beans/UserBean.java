package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierUserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.UserBiblioSoftServiceIF;
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
public class UserBean extends AbstractBean {

    @Inject
    private UserBiblioSoftServiceIF userService;

    private List<UserBibliosoft> usersList;
    @Inject
    @QualifierUserBibliosoft
    private IdentifiableBiblio userbibliosoft;

    public UserBean() {
    }

    public IdentifiableBiblio getUserbibliosoft() {
        return userbibliosoft;
    }

    public void setUserbibliosoft(UserBibliosoft userbibliosoft) {
        this.userbibliosoft = userbibliosoft;
    }

    public List<UserBibliosoft> getUsersList() {
        usersList = (List) userService.findAll();
        return usersList;
    }

    public void update() {
        userService.update(userbibliosoft);
    }

    @Override
    public InterfaceCrudService getService() {
        return this.userService;
    }

    @Override
    public IdentifiableBiblio getIdentifiableBiblio() {
        return this.userbibliosoft;
    }

    @Override
    public void limparForm() {
        setUserbibliosoft(new UserBibliosoft());
    }

}
