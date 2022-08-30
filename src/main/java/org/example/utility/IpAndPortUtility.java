package org.example.utility;

public class IpAndPortUtility {
    public static String ip;
    public static int port;

    public static void setIpAndPort(String ipAndPortNumber){


        String[] arr = ipAndPortNumber.split(":");
        ip = arr[0];
        port = Integer.parseInt(arr[1]);
    }


    public static String getIp() {
        return ip;
    }

    public static int getPort() {
        return port;
    }
}
