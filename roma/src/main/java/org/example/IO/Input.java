package org.example.IO;

import java.util.Scanner;
import org.example.dto.RomaDto;

public class Input {

    public static RomaDto InputRoma() {
        Scanner scanner = new Scanner(System.in);
        return new RomaDto(scanner.next());
    }
}
