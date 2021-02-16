package edu.escuelaing.arep.Services;

import edu.escuelaing.arep.model.BubbleSort;

import java.util.List;

public class Control {
    private List<Double> lista;
    private BubbleSort bSort;
    private List<Double> ordenado;

    public Control(List<Double> elementos){
        lista = elementos;
        bSort = new BubbleSort();
    }

    public List<Double> bubbleSort(){
        ordenado = bSort.bubblesort(lista);
        return ordenado;
    }

    public double sumatoria(){
        double suma = 0.0;
        for(double a:ordenado){
            suma+=a;
        }
        return suma;
    }

    public double mean(){
        double cont = 0;
        for(int i =0; i<ordenado.size(); i++){
            cont += ordenado.get(i);
        }
        return cont / ordenado.size();
    }

    public List<Double> getOrdenado() {
        return ordenado;
    }

    public void setOrdenado(List<Double> ordenado) {
        this.ordenado = ordenado;
    }
}
