/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModels;

/**
 *
 * @author Lenovo
 */
public class Jugador {

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }
    private String lastName;
    private String idType;
    private String city;
    private String address;
    private String email;
    private String photo;
    private String phoneNumber;
    private String bornDate;
    private String _id;
    private String name;
    private String delegacion;
    private String categoria;
    private String rama;
    private String codUni;

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Jugador(String name, String lastName, String id, String ciud, String address, String idType, String email, String photo, String phoneNumber,String bornDate, String delegacion,String categoria, String rama) {
        this.name=name;
        this.lastName=lastName;
        this._id = id;
        this.city = ciud;
        this.address = address;
        this.idType = idType;
        this.email = email;;
        this.phoneNumber = phoneNumber;
        this.bornDate=bornDate;
        this.delegacion=delegacion;
        this.categoria=categoria;
        this.rama = rama;
        this.codUni=_id+phoneNumber+ciud;
        if(this.photo==""){
            this.photo = codUni;
        }
    }

    public String getNames() {
        return name+" "+lastName;
    }
    public String getName(){
        return name;
    }

    public String getId() {
        return _id;
    }
    public String[] jugString(){
        String ret []=new String[13];
        ret[0]=categoria;
        ret[1]=_id;
        ret[2]=city;
        ret[3]=address;
        ret[4]=idType;
        ret[5]=email;
        ret[6]=photo;
        ret[7]=phoneNumber;
        ret[8]=bornDate;
        ret[9]=delegacion;
        ret[10]=name;
        ret[11]=lastName;
        ret[12]=rama;
        return ret;
    }

    public void edit(String[] atrs) {
        name=atrs[0];
        lastName=atrs[1];
        idType=atrs[2];
        _id=atrs[3];
        bornDate=atrs[4];
        email=atrs[5];
        city=atrs[6];
        address=atrs[7];
        phoneNumber=atrs[8];
        delegacion=atrs[9];
        rama=atrs[10];
        categoria=atrs[11];
        
    }

    public void setPhoto(String toString) {
        photo=toString;
    }
}

