/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.united.states.presidential.election;

/**
 *
 * @author ghandour
 */
public class President {
    
    private String name;
    private String popular;
    private String electoral;

    public President(final String name, final String popular, final String electoral) {
        this.name = name;
        this.popular = popular;
        this.electoral = electoral;
    }

    public String getName() {
        return this.name;
    }

    public String getPopularNum() {
        return this.popular;
    }

    public String getElectoralNum() {
        return this.electoral;
    }
}
