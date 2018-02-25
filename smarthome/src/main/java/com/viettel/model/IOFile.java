package com.viettel.model;

import java.io.*;

public class IOFile {
    public void outFile(Response ob, String s) {
        try {
            ObjectOutputStream ofs = new ObjectOutputStream(new FileOutputStream(s));
            ofs.writeObject(ob);
            ofs.close();
        } catch (IOException e) {

        }
    }

    public Object inFile(Object ob, String s) throws IOException, ClassNotFoundException {
        ObjectInputStream ifs = new ObjectInputStream(new FileInputStream(s));
        ob = ifs.readObject();
        ifs.close();
        return ob;
    }
}
