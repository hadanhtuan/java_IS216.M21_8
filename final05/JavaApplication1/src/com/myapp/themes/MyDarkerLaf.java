/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.themes;

import com.formdev.flatlaf.FlatDarkLaf;
/**
 *
 * @author phamq
 */
public class MyDarkerLaf  extends FlatDarkLaf {
    public static boolean setup() {
        return setup( new MyDarkerLaf() );
    }

    @Override
    public String getName() {
        return "MyDarkerLaf";
    }
}
