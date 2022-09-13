package assigment.practise;

import java.util.HashMap;

public class logicbased {

	public static void main(String[] args) {
		Long copy = 541543545584L;
		HashMap<Long, Integer> map = new HashMap<>();
		
		while (copy > 0) {
			Long r = copy % 10;

			if (map.containsKey(r) == false) {
				map.put(r, 1);

			} else {
				Integer v = map.get(r);
				v++;
				map.put(r, v);

			}
			copy = copy / 10;

		}
		System.out.print(map);
	}
}
