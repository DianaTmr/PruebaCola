package Models;

import java.util.Arrays;

public class Cola<T> {
	
	// Atributos
	private T[] array;
	private int index;
	
	// Constructor
	@SuppressWarnings("unchecked")
	public Cola(){
		this.array = (T[]) new Object[0];
		this.index = 0;
	}
	
	
	// Getters & Setters
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}


	// Metodos
	@SuppressWarnings("unchecked")
	public void add(T element){
		T[] aux = (T[]) new Object[this.array.length + 1];
		
		for (int i = 0; i < this.array.length; i++){
			aux[i] = this.array[i];
		}
		aux[aux.length - 1] = (T) element;
		this.array = aux;
	}

	@SuppressWarnings("unchecked")
	public void remove(T element){
		T[] aux = (T[]) new Object[this.array.length - 1];
		int id = 0;
		for (int i = 0; i < this.array.length; i++){		
			if(this.array[i] != element){
				aux[id] = this.array[i];			
				id++;	
			}	
			else if(this.array[i] == element){
				index = i-1;
			}
		}
		this.array = aux;
		System.out.println("El índice es: "+index);
	}
	
	@Override
	public String toString() {
		return "Array actual => " + Arrays.toString(array) + "";
	}
	
}