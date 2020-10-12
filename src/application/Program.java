package application;


import java.util.Scanner;

import entities.HanoiTower;
import entities.Stack;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Defina a quantidade de discos contidos na torre de Hanoi: ");
		int n = sc.nextInt();
		
		Stack stack = new Stack(n);
		
		for(int i = 0; i < n; i++)
		stack.push(i+1);
			
		System.out.println("\n\nMovimentos: ");
			
		HanoiTower.move(n, stack, new Stack(n), new Stack(n));
		
		System.out.println("\n\nQuantidade mínima de movimentos: "+HanoiTower.quantityOfMovements);
		
		sc.close();
	}
	
}
