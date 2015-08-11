// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class Ge extends ReqlQuery {


    public Ge(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Ge(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Ge(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.GE, args, optargs);
    }
    protected Ge(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Ge fromArgs(java.lang.Object... args){
        return new Ge(new Arguments(args), null);
    }


}
