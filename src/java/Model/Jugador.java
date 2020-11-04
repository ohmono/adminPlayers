/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static org.eclipse.jdt.internal.compiler.parser.Parser.name;

/**
 *
 * @author Lenovo
 */
public class Jugador {
    private String lastName;
    private String idType;
    private String city;
    private String address;
    private String email;
    private String photo;
    private String phoneNumber;
    private String bornDate;
    private final String _id;
    private final String name;
    private final String club;
    private final String team;

    public Jugador(String names, String lastName, String id, String ciud, String address, String idType, String email, String photo, String phoneNumber,String bornDate, String club,String team) {
        this.name = names+" "+lastName;
        this.lastName=lastName;
        this._id = id;
        this.city = ciud;
        this.address = address;
        this.idType = idType;
        this.email = email;
        this.photo = photo;
        this.phoneNumber = phoneNumber;
        this.bornDate=bornDate;
        this.club=club;
        this.team=team;
    }

    public String getNames() {
        return name;
    }

    public String getId() {
        return _id;
    }
    
}
