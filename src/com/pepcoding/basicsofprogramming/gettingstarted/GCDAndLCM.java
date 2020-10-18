package com.pepcoding.basicsofprogramming.gettingstarted;


import java.io.*;
import java.util.*;

public class GCDAndLCM
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
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        System.out.println(findGCD(num1,num2));
        System.out.println(findLCM(num1,num2));
    }


    public static int findGCD(int num1,int num2)
    {
        int gcd=0, i=1;

        while(i<num1 && i<num2)
        {
            if(num1%i==0 && num2%i==0)
            {
                if(i > gcd)
                {
                    gcd = i;
                }
            }
            i=i+1;
        }
        return gcd;
    }


    public static int findLCM(int num1, int num2)
    {
        boolean status=false;
        int lcm=1;
        int table1 , table2;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int max=num1;
        if(num2 > max)
        {
            max = num2;
        }

        for(int i=1; i<max; i++)
        {
            table1 = num1*i;
            list1.add(table1);
            table2 = num2*i;
            list2.add(table2);
        }

        for(int a: list1)
        {
            for(int b: list2)
            {
                if(a == b)
                {
                    status = true;
                    lcm = a;
                    break;
                }

                else if(a < b)
                {
                    break;
                }
            }

            if(status==true)
            {
                break;
            }
        }

        return lcm;
    }
}

