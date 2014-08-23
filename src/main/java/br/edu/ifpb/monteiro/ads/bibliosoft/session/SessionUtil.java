package br.edu.ifpb.monteiro.ads.bibliosoft.session;

import javax.faces.context.FacesContext;

/**
 *
 * @author vanderlan
 */
public class SessionUtil {

    public static void addItem(String name, Object object) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(name, object);
    }

    /**
     * Returns the item from session by name
     *
     * @param name Item´s name
     * @return the object item if found, null otherwise
     */
    public static Object getItem(String name) {
        if (FacesContext.getCurrentInstance() == null) {
            return null;
        }
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(name);
    }

    /**
     * Remove item from session
     *
     * @param name
     */
    public static void removeItem(String name) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(name);
    }

}
