package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Animal;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Animal> animalList = new ArrayList<>();

		do {
			JOptionPane.showMessageDialog(null, "Pense em um animal");
			String water = JOptionPane.showInputDialog(null, "O animal que você pensou vive na água ?");
			int yes = 0;

			if (animalList.size() != 0) {
				for (int i = 0; i < animalList.size(); i++) {
					String noiseTest = JOptionPane.showInputDialog(null,
							"O animal que você pensou " + animalList.get(i).getNoise() + " ?");

					if (noiseTest.equals("sim")) {
						String s = JOptionPane.showInputDialog(null,
								"O animal que você pensou é: " + animalList.get(i).getName() + " ?");
						if (s.equals("sim")) {
							JOptionPane.showMessageDialog(null, "Acertei !");
							String n = JOptionPane.showInputDialog(null, "Deseja continuar jogando ?");

							if (n.equals("nao") || n.equals("não")) {
								System.exit(0);
							} else {
								yes = 1;
								JOptionPane.showMessageDialog(null, "--- Iniciando novamente o ciclo.");
								break;
							}

						}
					}
				}
			}

			if (yes == 0) {
				String name = JOptionPane.showInputDialog(null, "Qual animal você pensou ?");
				String noise = JOptionPane.showInputDialog(null,
						"Um(a) " + name + " _____ mas uma baleia não.");
				animalList.add(new Animal(name, noise, water));
			}

		} while (animalList.size() < 75);
		sc.close();

	}
}
