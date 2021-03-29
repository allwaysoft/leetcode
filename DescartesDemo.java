import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DescartesDemo {

	public static void main(String[] args) {
		List<String> colorList = Arrays.asList("红色", "黑色", "金色");
		List<String> sizeList = Arrays.asList("32G", "64G");
		List<String> placeList = Arrays.asList("国产", "进口");

		List<String> descartesList = descartes(colorList, sizeList, placeList);
		descartesList.forEach(System.out::println);

	}

	public static List<String> descartes(List<String>... lists) {
		List<String> tempList = new ArrayList<>();
		for (List<String> list : lists) {
			if (tempList.isEmpty()) {
				tempList = list;
			} else {
				// java8新特性，stream流
				tempList = tempList.stream().flatMap(item -> list.stream().map(item2 -> item + " " + item2))
						.collect(Collectors.toList());
			}
		}
		return tempList;
	}
}