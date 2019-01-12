/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xstream.demo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.File;
import java.io.FileNotFoundException;
import xstream.model.Call;
import xstream.model.Calls;

/**
 *
 * @author nguye
 */
public class XStreamDemo {
    private static final String PATH = "calls-20190111142237.xml";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File(PATH);
        XStream xStream = new XStream(new StaxDriver(new NoNameCoder()));
        xStream.processAnnotations(Call.class);
        xStream.processAnnotations(Calls.class);
        Calls calls = (Calls) xStream.fromXML(file);
        System.out.println(calls.getCall().get(0).toString());
    }
}
