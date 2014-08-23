/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.dao.MaterialDAO;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Material;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author jefferson
 */
@Stateless
@LocalBean
public class MaterialService implements InterfaceCrudService<Material> {

    @EJB
    private MaterialDAO materialDAO;

    /**
     *
     * @return
     */
    @Override
    public List<Material> getAll() {
        return materialDAO.findAll();
    }

    /**
     *
     * @param material
     */
    @Override
    public void save(Material material) {
        materialDAO.create(material);
    }

    /**
     *
     * @param material
     */
    @Override
    public void remove(Material material) {
        materialDAO.remove(material);
    }

    @Override
    public void update(Material material) {
        materialDAO.edit(material);
    }

}
