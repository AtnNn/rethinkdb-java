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

public class MetaDbs {
    Logger logger = LoggerFactory.getLogger(MetaDbs.class);
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
            // meta/dbs.yaml #1
            /* bag(['rethinkdb', 'test']) */
            Bag expected_ = bag(r.array("rethinkdb", "test"));
            /* r.db_list() */
            System.out.println("About to run #1: r.dbList()");
            Object obtained = runOrCatch(r.dbList(),
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
            // meta/dbs.yaml #2
            /* partial({'dbs_created':1}) */
            Partial expected_ = partial(r.hashMap("dbs_created", 1L));
            /* r.db_create('a') */
            System.out.println("About to run #2: r.dbCreate('a')");
            Object obtained = runOrCatch(r.dbCreate("a"),
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
            // meta/dbs.yaml #3
            /* partial({'dbs_created':1}) */
            Partial expected_ = partial(r.hashMap("dbs_created", 1L));
            /* r.db_create('b') */
            System.out.println("About to run #3: r.dbCreate('b')");
            Object obtained = runOrCatch(r.dbCreate("b"),
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
            // meta/dbs.yaml #4
            /* bag(['rethinkdb', 'a', 'b', 'test']) */
            Bag expected_ = bag(r.array("rethinkdb", "a", "b", "test"));
            /* r.db_list() */
            System.out.println("About to run #4: r.dbList()");
            Object obtained = runOrCatch(r.dbList(),
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
            // meta/dbs.yaml #5
            /* {'name': 'a', 'id': uuid()} */
            Map expected_ = r.hashMap("name", "a").with("id", uuid());
            /* r.db('a').config() */
            System.out.println("About to run #5: r.db('a').config()");
            Object obtained = runOrCatch(r.db("a").config(),
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
            // meta/dbs.yaml #6
            /* partial({'dbs_dropped':1}) */
            Partial expected_ = partial(r.hashMap("dbs_dropped", 1L));
            /* r.db_drop('b') */
            System.out.println("About to run #6: r.dbDrop('b')");
            Object obtained = runOrCatch(r.dbDrop("b"),
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
            // meta/dbs.yaml #7
            /* bag(['rethinkdb', 'a', 'test']) */
            Bag expected_ = bag(r.array("rethinkdb", "a", "test"));
            /* r.db_list() */
            System.out.println("About to run #7: r.dbList()");
            Object obtained = runOrCatch(r.dbList(),
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
            // meta/dbs.yaml #8
            /* partial({'dbs_dropped':1}) */
            Partial expected_ = partial(r.hashMap("dbs_dropped", 1L));
            /* r.db_drop('a') */
            System.out.println("About to run #8: r.dbDrop('a')");
            Object obtained = runOrCatch(r.dbDrop("a"),
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
        
        {
            // meta/dbs.yaml #9
            /* bag(['rethinkdb', 'test']) */
            Bag expected_ = bag(r.array("rethinkdb", "test"));
            /* r.db_list() */
            System.out.println("About to run #9: r.dbList()");
            Object obtained = runOrCatch(r.dbList(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #9");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #9");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #9:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // meta/dbs.yaml #10
            /* partial({'dbs_created':1}) */
            Partial expected_ = partial(r.hashMap("dbs_created", 1L));
            /* r.db_create('bar') */
            System.out.println("About to run #10: r.dbCreate('bar')");
            Object obtained = runOrCatch(r.dbCreate("bar"),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #10");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #10");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #10:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // meta/dbs.yaml #11
            /* err('ReqlOpFailedError', 'Database `bar` already exists.', [0]) */
            Err expected_ = err("ReqlOpFailedError", "Database `bar` already exists.", r.array(0L));
            /* r.db_create('bar') */
            System.out.println("About to run #11: r.dbCreate('bar')");
            Object obtained = runOrCatch(r.dbCreate("bar"),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #11");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #11");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #11:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // meta/dbs.yaml #12
            /* partial({'dbs_dropped':1}) */
            Partial expected_ = partial(r.hashMap("dbs_dropped", 1L));
            /* r.db_drop('bar') */
            System.out.println("About to run #12: r.dbDrop('bar')");
            Object obtained = runOrCatch(r.dbDrop("bar"),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #12");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #12");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #12:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // meta/dbs.yaml #13
            /* err('ReqlOpFailedError', 'Database `bar` does not exist.', [0]) */
            Err expected_ = err("ReqlOpFailedError", "Database `bar` does not exist.", r.array(0L));
            /* r.db_drop('bar') */
            System.out.println("About to run #13: r.dbDrop('bar')");
            Object obtained = runOrCatch(r.dbDrop("bar"),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #13");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #13");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #13:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}
