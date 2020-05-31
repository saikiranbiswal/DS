package hackerrank_ds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArray {

	// Complete the matchingStrings function below.
	static int[] matchingStrings(String[] strings, String[] queries) {
		int n = strings.length;
		int m = queries.length;

		Map<String, Integer> hash = new HashMap<String, Integer>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (hash.get(strings[i]) == null) {
				hash.put(strings[i], 1);
			} else {
				count = hash.get(strings[i]);
				count++;
				hash.put(strings[i], count);
			}
		}

		int[] frequency = new int[m];

		for (int i = 0; i < m; i++) {
			if (hash.get(queries[i]) == null) {
				frequency[i] = 0;
			} else {
				frequency[i] = hash.get(queries[i]);
			}
		}
		return frequency;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int stringsCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] strings = new String[stringsCount];

		for (int i = 0; i < stringsCount; i++) {
			String stringsItem = scanner.nextLine();
			strings[i] = stringsItem;
		}

		int queriesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] queries = new String[queriesCount];

		for (int i = 0; i < queriesCount; i++) {
			String queriesItem = scanner.nextLine();
			queries[i] = queriesItem;
		}

		int[] res = matchingStrings(strings, queries);

		for (int i = 0; i < res.length; i++) {
			bufferedWriter.write(String.valueOf(res[i]));

			if (i != res.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
