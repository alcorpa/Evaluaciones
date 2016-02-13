package acp.giti7073s.interfacefigura;

import java.util.Scanner;

public class TestInterfaz {
	public void test(){
		Figura figura;
		Cuadrado cuadrado;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea la figura que deseas");
		int seleccion = scanner.nextInt();
		
		switch (seleccion){
		case 1:
		figura = new Cuadrado();
		break;
		case 2:
		figura = new Circulo();
		break;
		case 3:
		figura = new Triangulo();
		break;
		
		default:
		break;
		}
	}

}
