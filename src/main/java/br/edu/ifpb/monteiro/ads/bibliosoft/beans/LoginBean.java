package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.login.AuthenticRemote;
import br.edu.ifpb.monteiro.ads.bibliosoft.session.SessionUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vanderlan Gomes
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean implements Serializable {

    private String login;
    private String password;

    @EJB
    private AuthenticRemote loginEjb;
    private boolean logged = false;

    public LoginBean() {

    }

    public String verify() {

        if (loginEjb.authentic(login, password)) {

            setLogged(true);
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("begin/index.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            SessionUtil.addItem("Usuário", login);
            return "login.xhtml";

        } else {

            FacesContext context = FacesContext.getCurrentInstance();

            context.addMessage(null, new FacesMessage("Falha na autenticação ", "Login e/ou senha inválidos"));

            return null;
        }

    }

    /**
     * Logout method
     */
    public void loguot() {

        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        session.invalidate();
        
        System.err.println("LOGOUT");
    
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

}
