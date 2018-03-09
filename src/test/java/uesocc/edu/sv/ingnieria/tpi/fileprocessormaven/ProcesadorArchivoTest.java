/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingnieria.tpi.fileprocessormaven;

import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

/**
 *
 * @author zaldivar
 */
public class ProcesadorArchivoTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    
    public ProcesadorArchivoTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validarPath method, of class ProcesadorArchivo.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testValidarPath() throws IOException {
        System.out.println("validarPath");

        ProcesadorArchivo instance = new ProcesadorArchivo();

    }

    /**
     * Test of hasRequiredExtensions method, of class ProcesadorArchivo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testHasRequiredExtensions() throws Exception {
        System.out.println("hasRequiredExtensions-------------------------------------");
        File tmpFolder = folder.newFolder("nuevaCarpeta");
        File tmpFile1 = folder.newFile("nuevaCarpeta/Test.csv");
        ProcesadorArchivo instance = new ProcesadorArchivo();
        boolean existe = instance.hasRequiredExtensions("csv");
        assertEquals(true, existe);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of parser method, of class ProcesadorArchivo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testParser() throws Exception {
        System.out.println("parser---------------------------------------------------");
        boolean saltarLinea = false;
        String separador = ",";
        File tmpFile1 = folder.newFile("Test.csv");
//        System.out.println(tmpFile1.exists());
//        List<String> lines = Arrays.asList("Header1,Header2,Header3", "Dato1,Dato2,Dato3");
//        System.out.println(tmpFile1.toPath().toString());
//        Files.write(tmpFile1.toPath(), lines, Charset.forName("UTF-8"));

        ProcesadorArchivo instance = new ProcesadorArchivo();
        int size = instance.parser(tmpFile1.getName(), saltarLinea, separador).size();
        assertEquals(0,size);
    }

}
