/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class ArchivoEnv {
    public static void agregarBytesAlArchivo(int numero, byte[] bytes, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(numero).append(",");
            for (byte b : bytes) {
                stringBuilder.append(b).append(",");
            }
            stringBuilder.setLength(stringBuilder.length() - 1);
            fileWriter.write(stringBuilder.toString() + System.lineSeparator());
            System.out.println("Bytes agregados al archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] buscarBytesEnArchivo(int numero, String filePath) {
        byte[] bytes = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 1 && Integer.parseInt(parts[0]) == numero) {
                    bytes = new byte[parts.length - 1];
                    for (int i = 1; i < parts.length; i++) {
                        bytes[i - 1] = Byte.parseByte(parts[i]);
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
