/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ctu.digitaldungeon;

/**
 *
 * @author ethan
 */
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//handles dungeon API requests
@RestController
@RequestMapping("/api/dungeon")
public class DungeonController {

    //check the submitted data and unlock the gate
    @PostMapping("/unlock")
    public ResponseEntity<String> unlockGate(
            @Valid @RequestBody GatekeeperRequest request) {

        return ResponseEntity.ok(
            "The gate swings open! You advanced to the next level."
        );
    }
}
