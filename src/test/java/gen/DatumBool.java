// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../templates/Test.java
package gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.gen.exc.*;
import com.rethinkdb.gen.ast.*;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Instant;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.Collections;
import java.nio.charset.StandardCharsets;

import static gen.TestingCommon.*;
import gen.TestingFramework;

public class DatumBool {
    Logger logger = LoggerFactory.getLogger(DatumBool.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection<?> conn;
    public String hostname = TestingFramework.getConfig().getHostName();
    public int port = TestingFramework.getConfig().getPort();

    @Before
    public void setUp() throws Exception {
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down.");
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        r.db("rethinkdb").table("_debug_scratch").delete();
        conn.close(false);
    }

    // Autogenerated tests below

        @Test(timeout=120000)
    public void test() throws Exception {
                
        {
            // datum/bool.yaml #1
            /* True */
            Boolean expected_ = true;
            /* r.expr(True) */
            System.out.println("About to run #1: r.expr(true)");
            Object obtained = runOrCatch(r.expr(true),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #1");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #1");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #1:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // datum/bool.yaml #2
            /* False */
            Boolean expected_ = false;
            /* r.expr(False) */
            System.out.println("About to run #2: r.expr(false)");
            Object obtained = runOrCatch(r.expr(false),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #2");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #2");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #2:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // datum/bool.yaml #3
            /* 'BOOL' */
            String expected_ = "BOOL";
            /* r.expr(False).type_of() */
            System.out.println("About to run #3: r.expr(false).typeOf()");
            Object obtained = runOrCatch(r.expr(false).typeOf(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #3");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #3");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #3:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // datum/bool.yaml #4
            /* 'true' */
            String expected_ = "true";
            /* r.expr(True).coerce_to('string') */
            System.out.println("About to run #4: r.expr(true).coerceTo('string')");
            Object obtained = runOrCatch(r.expr(true).coerceTo("string"),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #4");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #4");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #4:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // datum/bool.yaml #5
            /* True */
            Boolean expected_ = true;
            /* r.expr(True).coerce_to('bool') */
            System.out.println("About to run #5: r.expr(true).coerceTo('bool')");
            Object obtained = runOrCatch(r.expr(true).coerceTo("bool"),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #5");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #5");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #5:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}
