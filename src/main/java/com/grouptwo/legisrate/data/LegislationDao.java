package com.grouptwo.legisrate.data;

import com.grouptwo.legisrate.model.Legislation;

import java.util.List;

/**
 * LegisRate
 * Final Group Project
 * C65 Java Full-Stack with React
 * The Software Guild
 *
 * @author Russell Taylor, Rosalinda Powell, Derek Roberts, John Michael Rondello, Abdulrasaq Saliu
 * Date: January 15, 2021
 *
 * LegislationDao
 * The legislation data-access-object interface
 */
public interface LegislationDao {

    /**
     * Adds new legislation to the `Legislation` table in the database
     * @param legislation the new legislation
     * @return the new legislation updated with an auto-generated legislationID
     */
    Legislation add(Legislation legislation);

    /**
     * Gets a list of all legislation from the `Legislation` table in the database
     * @return a list of all legislation
     */
    List<Legislation> getAllLegislation();

    /**
     * Gets specified legislation from the `Legislation` table in the database
     * @param legislationID the ID of the specified legislation
     * @return the specified legislation
     */
    Legislation getLegislation(int legislationID);

    /**
     * Updates a specified legislation in the `Legislation` table in the database
     * @param legislation the specified legislation
     * @return true if the specified legislation exists and is updated
     */
    boolean update(Legislation legislation);

    /**
     * Deletes a specified legislation from the `Legislation` table in the database
     * @param legislationID the ID of the specified legislation
     * @return true if the specified legislation exists and is deleted
     */
    boolean delete(int legislationID);

}
