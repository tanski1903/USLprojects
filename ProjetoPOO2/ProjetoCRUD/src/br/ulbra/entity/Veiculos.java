/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.entity;

/**
 *
 * @author s.lucas
 */
public class Veiculos {
    private int codVeic;
    private String tipoVeic;
    private String marcaVeic;
    private String modeloVeic;
    private int anoFabVeic;
    private String corVeic;
    private String placaVeic;
    private int kmVeic;
    
public Veiculos() {
}
public Veiculos(int codVeic, String tipoVeic, String marcaVeic,
String modeloVeic, int anoFabVeic, String corVeic, String placaVeic, int kmVeic) {
this.codVeic = codVeic;
this.tipoVeic = tipoVeic;
this.marcaVeic = marcaVeic;
this.modeloVeic = modeloVeic;
this.anoFabVeic = anoFabVeic;
this.corVeic = corVeic;
this.placaVeic = placaVeic;
this.kmVeic = kmVeic;
}
public String toString(){
return " COD: "+this.codVeic
+" Tipo: "+this.tipoVeic
+" Marca: "+this.marcaVeic
+" Modelo: "+this.modeloVeic
+" Ano de Fabricação: "+this.anoFabVeic
+" Sexo: "+this.corVeic
+" Placa: "+this.placaVeic
+" KM's: "+this.kmVeic;
}
public int getcodVeic() {
return codVeic;
}
public void setcodVeic(int codVeic) {
this.codVeic = codVeic;
}
public String gettipoVeic() {
return tipoVeic;
}
public void settipoVeic(String tipoVeic) {
this.tipoVeic = tipoVeic;
}
public String getmarcaVeic() {
return marcaVeic;
}
public void setmarcaVeic(String marcaVeic) {
this.marcaVeic = marcaVeic;
}
public String getmodeloVeic() {
return modeloVeic;
}
public void setmodeloVeic(String modeloVeic) {
this.modeloVeic = modeloVeic;
}
public int getanoFabVeic() {
return anoFabVeic;
}
public void setanoFabVeic(int anoFabVeic) {
this.anoFabVeic = anoFabVeic;
}
public String getcorVeic() {
return corVeic;
}
public void setcorVeic(String corVeic) {
this.corVeic = corVeic;
}
public String getplacaVeic() {
return placaVeic;
}
public void setplacaVeic (String placaVeic) {
this.placaVeic = placaVeic;
}
public int getkmVeic () {
return kmVeic;
}
public void setkmVeic (int kmVeic) {
this.kmVeic = kmVeic;
}
}
