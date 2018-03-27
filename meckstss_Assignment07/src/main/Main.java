/**Steve Meckstroth and Jennifer Palazzolo
 * Assignment07
 * Due Date: 03/06/2018
 * Computer Programming 2 IT 2045C/001/Spring2018
 * Citations: N/A
 * Calculates various statistics on a text file
 */
package main;

import java.io.IOException;

import fileReader.textFileReader;

public class Main {

	public static void main(String[] args) throws IOException {

		textFileReader tf = new textFileReader("C:\\Users\\meckstss\\git\\meckstss_Assignment07\\meckstss_Assignment07\\src\\words.txt");
		tf.readTextFile();
		System.out.println("Most common letter: " + tf.getStrMostCommonLetter() + " = " + tf.getIntMostCommonLetterCnt());
		System.out.println("Least common letter: " + tf.getStrLeastCommonLetter() + " = " + tf.getIntLeastCommonLetterCnt());
		System.out.println("Average word length: " + tf.getAvgWordLength());
		System.out.println("Longest word: " + tf.getStrLongestWord() + " = "+ tf.getIntLongestWord());

	}

}
