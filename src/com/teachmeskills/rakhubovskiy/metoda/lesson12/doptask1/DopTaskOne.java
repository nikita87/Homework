package com.teachmeskills.rakhubovskiy.metoda.lesson12.doptask1;


import java.io.*;

/*В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только палиндромы.
*/

public class DopTaskOne {
    public static void main(String[] args) throws IOException {

        FileReader fileReader;
        try {
            fileReader = new FileReader("fileDopTask1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        FileWriter fileWriter;
        fileWriter = new FileWriter("fileDopTask1Palindrom.txt");

        BufferedWriter bw = new BufferedWriter(fileWriter);
        BufferedReader br = new BufferedReader(fileReader);

        String line;

        while ((line = br.readLine()) != null){
            int count = 0;
            char[] word = line.toCharArray();
            for (int i = 0; i < word.length/2; i++){
                if (word[i] != word[word.length - i - 1]){
                    break;
                }
                count++;
            }
            if (count == word.length/2){
                bw.write(line + "\n");
            }
        }
        bw.flush();
        fileReader.close();
        fileWriter.close();
    }
}
