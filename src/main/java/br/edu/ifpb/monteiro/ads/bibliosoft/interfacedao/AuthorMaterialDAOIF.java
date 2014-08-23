/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.AuthorMaterial;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface AuthorMaterialDAOIF {

    public void create(AuthorMaterial authorMaterial);

    public void edit(AuthorMaterial authorMaterial);

    public void remove(AuthorMaterial authorMaterial);

    public AuthorMaterial find(Object id);

    public List<AuthorMaterial> findAll();

    public List<AuthorMaterial> findRange(int[] range);

    public int count();
}
