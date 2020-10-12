package entities;

public class HanoiTower {

	Stack stackOrig;
	Stack stackAux;
	Stack stackDest;
	
	public static int quantityOfMovements = 0;
	

	
	public HanoiTower(int n) {
		 stackOrig = new Stack();
		 stackAux = new Stack();
		 stackDest = new Stack();
	}


	public static void move(int n, Stack stackOrig, Stack stackAux, Stack stackDest) {
	
		if(n>=1) { 
			quantityOfMovements++;
			move(n-1, stackOrig, stackDest, stackAux);
			System.out.println("----------------");
			stackDest.push(stackOrig.pop());
			System.out.print("Original: ");
			stackOrig.printStack();
			System.out.print("Auxiliar: ");
			stackAux.printStack();
			System.out.print("Destino:  ");
			stackDest.printStack();
			
			move(n-1, stackAux, stackOrig, stackDest);
			
		}
	}
	
	
	
	
}
