package com.example.versionchecker;

import java.io.IOException;

public class Installer {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Installer <type> <path>");
            System.out.println("Where <type> is 'exe' or 'msi' and <path> is the path to the installer.");
            return;
        }

        String installerType = args[0];
        String installerPath = args[1];

        try {
            if ("exe".equalsIgnoreCase(installerType)) {
                installExe(installerPath);
            } else if ("msi".equalsIgnoreCase(installerType)) {
                installMsi(installerPath);
            } else {
                System.out.println("Unsupported installer type: " + installerType);
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error during installation: " + ex.getMessage());
        }
    }

    private static void installExe(String installerPath) throws IOException, InterruptedException {
        // This assumes a silent installation. Modify as needed.
        String command = installerPath + " /S";

        Process process = Runtime.getRuntime().exec(command);
        process.waitFor();

        System.out.println("EXE installation completed.");
    }

    private static void installMsi(String installerPath) throws IOException, InterruptedException {
        // This assumes a silent installation. Modify as needed.
        String command = "msiexec /i \"" + installerPath + "\" /quiet";

        Process process = Runtime.getRuntime().exec(command);
        process.waitFor();

        System.out.println("MSI installation completed.");
    }
}
