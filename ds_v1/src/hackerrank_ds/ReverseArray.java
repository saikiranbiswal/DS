package hackerrank_ds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

	// Complete the reverseArray function below.
	static int[] reverseArray(int[] a) {
		int length = a.length;
		int[] reversedArr = new int[length];
		for(int i = 0; i < length; i++) {
			reversedArr[i] = a[length-1-i];
		}
		return reversedArr;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int arrCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[arrCount];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] res = reverseArray(arr);

		for (int i = 0; i < res.length; i++) {
			bufferedWriter.write(String.valueOf(res[i]));

			if (i != res.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
