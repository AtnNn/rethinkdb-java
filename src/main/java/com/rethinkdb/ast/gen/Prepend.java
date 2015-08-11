// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class Prepend extends ReqlQuery {


    public Prepend(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Prepend(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Prepend(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.PREPEND, args, optargs);
    }
    protected Prepend(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Prepend fromArgs(java.lang.Object... args){
        return new Prepend(new Arguments(args), null);
    }


}
