import java.net.*;  
import java.io.*;  

class MyClient{  
public static void main(String args[])

throws Exception{  
Socket s=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String strClient="",strServer="";  
while(!strClient.equals("STOP"))
{  
strClient=br.readLine();  
dout.writeUTF(strClient);  
dout.flush();  

strServer=din.readUTF();  
System.out.println("Server Says: "+strServer);  
}  
  
dout.close();  
s.close();  
}

}  