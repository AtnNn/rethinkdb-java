// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class TableList extends ReqlQuery {


    public TableList(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public TableList(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public TableList(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.TABLE_LIST, args, optargs);
    }
    protected TableList(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static TableList fromArgs(java.lang.Object... args){
        return new TableList(new Arguments(args), null);
    }


}
