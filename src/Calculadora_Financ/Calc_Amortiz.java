/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora_Financ;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Calc_Amortiz extends Calculo_Juros {
    
    
    protected double juros;
    protected double vrparc;
    protected double amortiz;
    protected double saldofim;
    protected int numparc;
    
    
   
    public void CalcSac(){
        
            if (this.vrpres == 0 | this.taxa == 0 | this.tempo == 0) {
            JOptionPane.showMessageDialog(null, "Valores não podem estar zerados");
        } else{
              
            this.numparc++;
            //this.juros = this.vrpres * (this.taxa / 100);
            this.juros = this.vrpres * (this.taxa / 100);
            this.vrparc = this.juros + this.amortiz;
            this.saldofim = this.vrpres - this.amortiz;  
                
                
                
            }
        
        
        
    }

    @Override
    public double getVrpres() {
        return vrpres;
    }

    public void setVrpres(double vrpres) {
        this.vrpres = vrpres;
    }

    @Override
    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getVrparc() {
        return vrparc;
    }

    public void setVrparc(double vrparc) {
        this.vrparc = vrparc;
    }

    public double getSaldofim() {
        return saldofim;
    }

    public void setSaldofim(double saldofim) {
        this.saldofim = saldofim;
    }

    public double getAmortiz() {
        return amortiz;
    }

    public void setAmortiz(double amortiz) {
        this.amortiz = amortiz;
    }

    public int getNumparc() {
        return numparc;
    }

    public void setNumparc(int numparc) {
        this.numparc = numparc;
    }

    
    
    
    
    
    
    
    
}
