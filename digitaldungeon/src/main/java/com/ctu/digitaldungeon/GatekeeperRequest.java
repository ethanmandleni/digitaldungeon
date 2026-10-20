/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ctu.digitaldungeon;

/**
 *
 * @author ethan
 */

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

//holds the data sent to the API
public class GatekeeperRequest {

    @NotBlank(message = "Spell name cannot be empty")
    private String spellName;

    @Min(value = 10, message = "Mana cost must be at least 10")
    @Max(value = 100, message = "Mana cost cannot exceed 100")
    private int manaCost;

    @Pattern(
        regexp = "^(?=.*\\d).{8,}$",
        message = "Passphrase must be at least 8 characters and contain a number"
    )
    private String secretPassphrase;

    //getters
    public String getSpellName() {
        return spellName;
    }
    
    public int getManaCost() {
        return manaCost;
    }
    
    public String getSecretPassphrase() {
        return secretPassphrase;
    }

    //setters
    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }
    
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
    
    public void setSecretPassphrase(String secretPassphrase) {
        this.secretPassphrase = secretPassphrase;
        }

}