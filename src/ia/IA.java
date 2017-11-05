package ia;

import ia.vehicle.Plane;
import ia.vehicle.Vehicle;
import repository.Repository;

public class IA {

	public static void main(String[] args) {
		Repository repo = Repository.getInstance();
		
		for (int i = 0; i < 15; i ++) {
			Vehicle v = repo.generate();
			if (v != null) {
				System.out.println(v.getClass());
			} else {
				System.out.println("Vehicle NULL");
			}
		}
		

	}

}
