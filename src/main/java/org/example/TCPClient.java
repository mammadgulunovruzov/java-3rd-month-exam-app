package org.example;

import org.example.service.FileService;
import org.example.service.LoginService;
import org.example.utility.InputUtility;
import org.example.utility.IpAndPortUtility;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) {
        LoginService.checkLogin();
        while (true) {


            try {
                String filePath = InputUtility.askString("Zəhmət olmasa göndərmək istədiyiniz faylın yerləşdiyi keçidi qeyd edin");
                String ipAndPortNumber = InputUtility.askString("Zəhmət olmasa bu faylin göndərmək istədiyiniz şəxsin(serverin) ip və portunu daxil edin");
                IpAndPortUtility.setIpAndPort(ipAndPortNumber);

                Socket socket = new Socket(IpAndPortUtility.getIp(), IpAndPortUtility.getPort());
                OutputStream outputStream = socket.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

                byte[] bytes = FileService.readFile(filePath);
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                socket.close();
                System.out.println("Yeeeeees");
              Integer menu = InputUtility.askInt("Do you want to continue?\n" +
                        "1.Yes \n" +
                        "2.No");
              if (menu==1){
                  continue;
              } else if (menu==2) {
                  dataOutputStream.close();
                  System.out.println("Unconnected");
                  System.exit(0);


              }


            } catch (Exception e) {
                System.out.println("Wrong Input");
            }


        }
    }


}
