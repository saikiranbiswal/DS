package hackerrank_ds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {

	private static int[] doLeftRotaion(int[] a, int d) {

		int n = a.length;
		int[] tempArray = new int[n];

		for (int i = 0; i < n; i++) {
			tempArray[i] = a[i];
		}

		for (int i = 0; i < n; i++) {
			a[(i + n - d) % n] = tempArray[i];
		}

		return a;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] leftRotaionArray = doLeftRotaion(a, d);

		for (int i = 0; i < leftRotaionArray.length; i++) {
			bufferedWriter.write(String.valueOf(leftRotaionArray[i]));

			if (i != leftRotaionArray.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
