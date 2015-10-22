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

public class Timeout {
    Logger logger = LoggerFactory.getLogger(Timeout.class);
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
            // timeout.yaml #1
            /* err("ReqlQueryLogicError", "JavaScript query `while(true) {}` timed out after 5.000 seconds.", [0]) */
            Err expected_ = err("ReqlQueryLogicError", "JavaScript query `while(true) {}` timed out after 5.000 seconds.", r.array(0L));
            /* r.js('while(true) {}') */
            System.out.println("About to run #1: r.js('while(true) {}')");
            Object obtained = runOrCatch(r.js("while(true) {}"),
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
            // timeout.yaml #2
            /* err("ReqlQueryLogicError", "JavaScript query `while(true) {}` timed out after 1.300 seconds.", [0]) */
            Err expected_ = err("ReqlQueryLogicError", "JavaScript query `while(true) {}` timed out after 1.300 seconds.", r.array(0L));
            /* r.js('while(true) {}', timeout=1.3) */
            System.out.println("About to run #2: r.js('while(true) {}').optArg('timeout', 1.3)");
            Object obtained = runOrCatch(r.js("while(true) {}").optArg("timeout", 1.3),
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
            // timeout.yaml #3
            /* err("ReqlQueryLogicError", "JavaScript query `while(true) {}` timed out after 8.000 seconds.", [0]) */
            Err expected_ = err("ReqlQueryLogicError", "JavaScript query `while(true) {}` timed out after 8.000 seconds.", r.array(0L));
            /* r.js('while(true) {}', timeout=8) */
            System.out.println("About to run #3: r.js('while(true) {}').optArg('timeout', 8L)");
            Object obtained = runOrCatch(r.js("while(true) {}").optArg("timeout", 8L),
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
            // timeout.yaml #4
            /* err("ReqlQueryLogicError", "JavaScript query `(function(x) { while(true) {} })` timed out after 5.000 seconds.", [0]) */
            Err expected_ = err("ReqlQueryLogicError", "JavaScript query `(function(x) { while(true) {} })` timed out after 5.000 seconds.", r.array(0L));
            /* r.expr('foo').do(r.js('(function(x) { while(true) {} })')) */
            System.out.println("About to run #4: r.expr('foo').do_(r.js('(function(x) { while(true) {} })'))");
            Object obtained = runOrCatch(r.expr("foo").do_(r.js("(function(x) { while(true) {} })")),
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
            // timeout.yaml #5
            /* err("ReqlQueryLogicError", "JavaScript query `(function(x) { while(true) {} })` timed out after 1.300 seconds.", [0]) */
            Err expected_ = err("ReqlQueryLogicError", "JavaScript query `(function(x) { while(true) {} })` timed out after 1.300 seconds.", r.array(0L));
            /* r.expr('foo').do(r.js('(function(x) { while(true) {} })', timeout=1.3)) */
            System.out.println("About to run #5: r.expr('foo').do_(r.js('(function(x) { while(true) {} })').optArg('timeout', 1.3))");
            Object obtained = runOrCatch(r.expr("foo").do_(r.js("(function(x) { while(true) {} })").optArg("timeout", 1.3)),
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
        
        {
            // timeout.yaml #6
            /* err("ReqlQueryLogicError", "JavaScript query `(function(x) { while(true) {} })` timed out after 8.000 seconds.", [0]) */
            Err expected_ = err("ReqlQueryLogicError", "JavaScript query `(function(x) { while(true) {} })` timed out after 8.000 seconds.", r.array(0L));
            /* r.expr('foo').do(r.js('(function(x) { while(true) {} })', timeout=8)) */
            System.out.println("About to run #6: r.expr('foo').do_(r.js('(function(x) { while(true) {} })').optArg('timeout', 8L))");
            Object obtained = runOrCatch(r.expr("foo").do_(r.js("(function(x) { while(true) {} })").optArg("timeout", 8L)),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #6");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #6");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #6:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // timeout.yaml #7
            /* err("ReqlNonExistenceError", "Error in HTTP GET of `httpbin.org/delay/10`:" + " timed out after 0.800 seconds.", []) */
            Err expected_ = err("ReqlNonExistenceError", "Error in HTTP GET of `httpbin.org/delay/10`:" + " timed out after 0.800 seconds.", r.array());
            /* r.http('httpbin.org/delay/10', timeout=0.8) */
            System.out.println("About to run #7: r.http('httpbin.org/delay/10').optArg('timeout', 0.8)");
            Object obtained = runOrCatch(r.http("httpbin.org/delay/10").optArg("timeout", 0.8),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #7");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #7");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #7:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // timeout.yaml #8
            /* err("ReqlNonExistenceError", "Error in HTTP PUT of `httpbin.org/delay/10`:" + " timed out after 0.000 seconds.", []) */
            Err expected_ = err("ReqlNonExistenceError", "Error in HTTP PUT of `httpbin.org/delay/10`:" + " timed out after 0.000 seconds.", r.array());
            /* r.http('httpbin.org/delay/10', method='PUT', timeout=0.0) */
            System.out.println("About to run #8: r.http('httpbin.org/delay/10').optArg('method', 'PUT').optArg('timeout', 0.0)");
            Object obtained = runOrCatch(r.http("httpbin.org/delay/10").optArg("method", "PUT").optArg("timeout", 0.0),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #8");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #8");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #8:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}
