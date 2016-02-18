package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public int add(String text) {
		if (isBlank(text)) {
			return 0;
		}

		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if (m.find()) {
			return sum(toInt(splitCustomDelimeter(m)));
		}

		return sum(toInt(split(text)));
	}

	private String[] splitCustomDelimeter(Matcher m) {
		String customDelimeter = m.group(1);
		String[] tokens = m.group(2).split(customDelimeter);
		return tokens;
	}

	private boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}

	private String[] split(String text) {
		return text.split(",|:");
	}

	private int[] toInt(String[] values) {
		int[] numbers = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			numbers[i] = toPositive(values[i]);
		}
		return numbers;
	}

	private int toPositive(String value) {
		int number = Integer.parseInt(value);
		if (number < 0) {
			throw new RuntimeException();
		}
		return number;
	}

	private int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
