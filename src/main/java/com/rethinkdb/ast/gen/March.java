// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class March extends ReqlQuery {


    public March(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public March(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public March(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.MARCH, args, optargs);
    }
    protected March(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static March fromArgs(java.lang.Object... args){
        return new March(new Arguments(args), null);
    }


}
