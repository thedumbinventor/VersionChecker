package com.example.versionchecker;

public class VersionComparator {
    public static int compareVersions(String version1, String version2) {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");

        int maxLength = Math.max(parts1.length, parts2.length);

        for (int i = 0; i < maxLength; i++) {
            int v1 = (i < parts1.length) ? Integer.parseInt(parts1[i]) : 0;
            int v2 = (i < parts2.length) ? Integer.parseInt(parts2[i]) : 0;

            if (v1 > v2) {
                return 1; // version1 is greater
            } else if (v1 < v2) {
                return -1; // version2 is greater
            }
        }

        // If we've reached this point, then the versions are equal
        return 0;
    }

    public static void main(String[] args) {
        String v1 = "1.2.3";
        String v2 = "1.2.4";

        int result = compareVersions(v1, v2);
        if (result > 0) {
            System.out.println(v1 + " is greater than " + v2);
        } else if (result < 0) {
            System.out.println(v2 + " is greater than " + v1);
        } else {
            System.out.println(v1 + " and " + v2 + " are equal.");
        }
    }
}
