package com.pepcoding.basicsofprogramming.patterns;

import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
public class Pattern6
{
	static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
	
	public static void main(String args[]) throws IOException
	{
		Reader read = new Reader();
		int n = read.nextInt();
		
		int newN = n+2;

        double result = Double.valueOf(String.valueOf(newN))/2;
        
        result = result+0.5;
        
        int midPoint = (int)result;	
        
        int counter = midPoint-1;
        
        int noOfEmptySpaces = 1;
        
        boolean status = false;
        
        for(int i=1; i<=n; i++)
        {
        	//Print the asteriks
        	for(int j=1; j<=counter; j++)
        	{
        		System.out.print("*	");
        	}
        
        	
        	//Print the empty-spaces
        	for(int k=1; k<=noOfEmptySpaces; k++)
        	{
        		System.out.print("	");
        	}
        
        
        	//Print the asterics again
        	for(int j=1; j<=counter; j++)
        	{
        		System.out.print("*	");
        	}
        
        
        	if(noOfEmptySpaces < n && status == false)
        	{
        		counter = counter-1;
        		noOfEmptySpaces = noOfEmptySpaces+2;
        
        		if(counter < 1)
        		{
        			counter = counter+1;
        		}
        
        		if(noOfEmptySpaces == n)
        		{
        			status = true;
        		}
        	}
        
        	else 
        	{
        		counter = counter+1;
        		noOfEmptySpaces = noOfEmptySpaces-2;
        	}
                
                System.out.println("");
        }
	}
}
