/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface UserBibliosoftDAOIF {

    public void create(UserBibliosoft userBibliosoft);

    public void edit(UserBibliosoft userBibliosoft);

    public void remove(UserBibliosoft userBibliosoft);

    public UserBibliosoft find(Object id);

    public List<UserBibliosoft> findAll();

    public List<UserBibliosoft> findRange(int[] range);

    public int count();
}
