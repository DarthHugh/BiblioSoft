/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Material;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface MaterialDAOIF {

    public void create(Material material);

    public void edit(Material material);

    public void remove(Material material);

    public Material find(Object id);

    public List<Material> findAll();

    public List<Material> findRange(int[] range);

    public int count();
}
