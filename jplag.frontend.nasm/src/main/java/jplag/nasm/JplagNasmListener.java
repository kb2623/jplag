package jplag.nasm;

import jplag.nasm.grammar.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JplagNasmListener implements NasmListener, NasmTokenConstants {

    private jplag.nasm.Parser jplagParser;

    public JplagNasmListener(jplag.nasm.Parser jplag) {
        jplagParser = jplag;
    }

    @Override
    public void enterTestlist(@NotNull NasmParser.TestlistContext ctx) {
    }

    @Override
    public void exitTestlist(@NotNull NasmParser.TestlistContext ctx) {
    }

    @Override
    public void enterAssert_stmt(@NotNull NasmParser.Assert_stmtContext ctx) {
        jplagParser.add(ASSERT, ctx.getStart());
    }

    @Override
    public void exitAssert_stmt(@NotNull NasmParser.Assert_stmtContext ctx) {
    }

    @Override
    public void enterArgument(@NotNull NasmParser.ArgumentContext ctx) {
    }

    @Override
    public void exitArgument(@NotNull NasmParser.ArgumentContext ctx) {
    }

    @Override
    public void enterNot_test(@NotNull NasmParser.Not_testContext ctx) {
    }

    @Override
    public void exitNot_test(@NotNull NasmParser.Not_testContext ctx) {
    }

    @Override
    public void enterFile_input(@NotNull NasmParser.File_inputContext ctx) {
    }

    @Override
    public void exitFile_input(@NotNull NasmParser.File_inputContext ctx) {
    }

    @Override
    public void enterXor_expr(@NotNull NasmParser.Xor_exprContext ctx) {
    }

    @Override
    public void exitXor_expr(@NotNull NasmParser.Xor_exprContext ctx) {
    }

    @Override
    public void enterImport_from(@NotNull NasmParser.Import_fromContext ctx) {
    }

    @Override
    public void exitImport_from(@NotNull NasmParser.Import_fromContext ctx) {
    }

    @Override
    public void enterSingle_input(@NotNull NasmParser.Single_inputContext ctx) {
    }

    @Override
    public void exitSingle_input(@NotNull NasmParser.Single_inputContext ctx) {
    }

    @Override
    public void enterDecorated(@NotNull NasmParser.DecoratedContext ctx) {
        jplagParser.add(DEC_BEGIN, ctx.getStart());
    }

    @Override
    public void exitDecorated(@NotNull NasmParser.DecoratedContext ctx) {
        jplagParser.addEnd(DEC_END, ctx.getStart());
    }

    @Override
    public void enterWith_item(@NotNull NasmParser.With_itemContext ctx) {
    }

    @Override
    public void exitWith_item(@NotNull NasmParser.With_itemContext ctx) {
    }

    @Override
    public void enterRaise_stmt(@NotNull NasmParser.Raise_stmtContext ctx) {
        jplagParser.add(RAISE, ctx.getStart());
    }

    @Override
    public void exitRaise_stmt(@NotNull NasmParser.Raise_stmtContext ctx) {
    }

    @Override
    public void enterImport_as_name(@NotNull NasmParser.Import_as_nameContext ctx) {
    }

    @Override
    public void exitImport_as_name(@NotNull NasmParser.Import_as_nameContext ctx) {
    }

    @Override
    public void enterExcept_clause(@NotNull NasmParser.Except_clauseContext ctx) {
        jplagParser.add(EXCEPT_BEGIN, ctx.getStart());
    }

    @Override
    public void exitExcept_clause(@NotNull NasmParser.Except_clauseContext ctx) {
        jplagParser.addEnd(EXCEPT_END, ctx.getStart());
    }

    @Override
    public void enterCompound_stmt(@NotNull NasmParser.Compound_stmtContext ctx) {
    }

    @Override
    public void exitCompound_stmt(@NotNull NasmParser.Compound_stmtContext ctx) {
    }

    @Override
    public void enterAnd_expr(@NotNull NasmParser.And_exprContext ctx) {
    }

    @Override
    public void exitAnd_expr(@NotNull NasmParser.And_exprContext ctx) {
    }

    @Override
    public void enterLambdef_nocond(@NotNull NasmParser.Lambdef_nocondContext ctx) {
    }

    @Override
    public void exitLambdef_nocond(@NotNull NasmParser.Lambdef_nocondContext ctx) {
    }

    @Override
    public void enterDictorsetmaker(@NotNull NasmParser.DictorsetmakerContext ctx) {
        jplagParser.add(ARRAY, ctx.getStart());
    }

    @Override
    public void exitDictorsetmaker(@NotNull NasmParser.DictorsetmakerContext ctx) {
    }

    @Override
    public void enterReturn_stmt(@NotNull NasmParser.Return_stmtContext ctx) {
        jplagParser.add(RETURN, ctx.getStart());
    }

    @Override
    public void exitReturn_stmt(@NotNull NasmParser.Return_stmtContext ctx) {
    }

    @Override
    public void enterDotted_name(@NotNull NasmParser.Dotted_nameContext ctx) {
    }

    @Override
    public void exitDotted_name(@NotNull NasmParser.Dotted_nameContext ctx) {
    }

    @Override
    public void enterFlow_stmt(@NotNull NasmParser.Flow_stmtContext ctx) {
    }

    @Override
    public void exitFlow_stmt(@NotNull NasmParser.Flow_stmtContext ctx) {
    }

    @Override
    public void enterWhile_stmt(@NotNull NasmParser.While_stmtContext ctx) {
        jplagParser.add(WHILE_BEGIN, ctx.getStart());
    }

    @Override
    public void exitWhile_stmt(@NotNull NasmParser.While_stmtContext ctx) {
        jplagParser.addEnd(WHILE_END, ctx.getStart());
    }

    @Override
    public void enterOr_test(@NotNull NasmParser.Or_testContext ctx) {
    }

    @Override
    public void exitOr_test(@NotNull NasmParser.Or_testContext ctx) {
    }

    @Override
    public void enterComparison(@NotNull NasmParser.ComparisonContext ctx) {
    }

    @Override
    public void exitComparison(@NotNull NasmParser.ComparisonContext ctx) {
    }

    @Override
    public void enterTest(@NotNull NasmParser.TestContext ctx) {
    }

    @Override
    public void exitTest(@NotNull NasmParser.TestContext ctx) {
    }

    @Override
    public void enterSubscript(@NotNull NasmParser.SubscriptContext ctx) {
    }

    @Override
    public void exitSubscript(@NotNull NasmParser.SubscriptContext ctx) {
    }

    @Override
    public void enterComp_for(@NotNull NasmParser.Comp_forContext ctx) {
    }

    @Override
    public void exitComp_for(@NotNull NasmParser.Comp_forContext ctx) {
    }

    @Override
    public void enterYield_arg(@NotNull NasmParser.Yield_argContext ctx) {
        jplagParser.add(YIELD, ctx.getStart());
    }

    @Override
    public void exitYield_arg(@NotNull NasmParser.Yield_argContext ctx) {
    }

    @Override
    public void enterYield_expr(@NotNull NasmParser.Yield_exprContext ctx) {
    }

    @Override
    public void exitYield_expr(@NotNull NasmParser.Yield_exprContext ctx) {
    }

    @Override
    public void enterImport_stmt(@NotNull NasmParser.Import_stmtContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
    }

    @Override
    public void exitImport_stmt(@NotNull NasmParser.Import_stmtContext ctx) {
    }

    @Override
    public void enterShift_expr(@NotNull NasmParser.Shift_exprContext ctx) {
    }

    @Override
    public void exitShift_expr(@NotNull NasmParser.Shift_exprContext ctx) {
    }

    @Override
    public void enterLambdef(@NotNull NasmParser.LambdefContext ctx) {
        jplagParser.add(LAMBDA, ctx.getStart());
    }

    @Override
    public void exitLambdef(@NotNull NasmParser.LambdefContext ctx) {
    }

    @Override
    public void enterAnd_test(@NotNull NasmParser.And_testContext ctx) {
    }

    @Override
    public void exitAnd_test(@NotNull NasmParser.And_testContext ctx) {
    }

    @Override
    public void enterGlobal_stmt(@NotNull NasmParser.Global_stmtContext ctx) {
    }

    @Override
    public void exitGlobal_stmt(@NotNull NasmParser.Global_stmtContext ctx) {
    }

    @Override
    public void enterImport_as_names(@NotNull NasmParser.Import_as_namesContext ctx) {
    }

    @Override
    public void exitImport_as_names(@NotNull NasmParser.Import_as_namesContext ctx) {
    }

    @Override
    public void enterDecorators(@NotNull NasmParser.DecoratorsContext ctx) {
    }

    @Override
    public void exitDecorators(@NotNull NasmParser.DecoratorsContext ctx) {
    }

    @Override
    public void enterTry_stmt(@NotNull NasmParser.Try_stmtContext ctx) {
        jplagParser.add(TRY_BEGIN, ctx.getStart());
    }

    @Override
    public void exitTry_stmt(@NotNull NasmParser.Try_stmtContext ctx) {
    }

    @Override
    public void enterComp_op(@NotNull NasmParser.Comp_opContext ctx) {
    }

    @Override
    public void exitComp_op(@NotNull NasmParser.Comp_opContext ctx) {
    }

    @Override
    public void enterStar_expr(@NotNull NasmParser.Star_exprContext ctx) {
    }

    @Override
    public void exitStar_expr(@NotNull NasmParser.Star_exprContext ctx) {
    }

    @Override
    public void enterBreak_stmt(@NotNull NasmParser.Break_stmtContext ctx) {
        jplagParser.add(BREAK, ctx.getStart());
    }

    @Override
    public void exitBreak_stmt(@NotNull NasmParser.Break_stmtContext ctx) {
    }

    @Override
    public void enterParameters(@NotNull NasmParser.ParametersContext ctx) {
    }

    @Override
    public void exitParameters(@NotNull NasmParser.ParametersContext ctx) {
    }

    @Override
    public void enterDecorator(@NotNull NasmParser.DecoratorContext ctx) {
    }

    @Override
    public void exitDecorator(@NotNull NasmParser.DecoratorContext ctx) {
    }

    @Override
    public void enterTfpdef(@NotNull NasmParser.TfpdefContext ctx) {
    }

    @Override
    public void exitTfpdef(@NotNull NasmParser.TfpdefContext ctx) {
    }

    @Override
    public void enterTestlist_comp(@NotNull NasmParser.Testlist_compContext ctx) {
        if (ctx.getText().contains(",")) {
            jplagParser.add(ARRAY, ctx.getStart());
        }
    }

    @Override
    public void exitTestlist_comp(@NotNull NasmParser.Testlist_compContext ctx) {
    }

    @Override
    public void enterIf_stmt(@NotNull NasmParser.If_stmtContext ctx) {
        jplagParser.add(IF_BEGIN, ctx.getStart());
    }

    @Override
    public void exitIf_stmt(@NotNull NasmParser.If_stmtContext ctx) {
        jplagParser.addEnd(IF_END, ctx.getStart());
    }

    @Override
    public void enterWith_stmt(@NotNull NasmParser.With_stmtContext ctx) {
        jplagParser.add(WITH_BEGIN, ctx.getStart());
    }

    @Override
    public void exitWith_stmt(@NotNull NasmParser.With_stmtContext ctx) {
        jplagParser.addEnd(WITH_END, ctx.getStart());
    }

    @Override
    public void enterClassdef(@NotNull NasmParser.ClassdefContext ctx) {
        jplagParser.add(CLASS_BEGIN, ctx.getStart());
    }

    @Override
    public void exitClassdef(@NotNull NasmParser.ClassdefContext ctx) {
        jplagParser.addEnd(CLASS_END, ctx.getStart());
    }

    @Override
    public void enterExprlist(@NotNull NasmParser.ExprlistContext ctx) {
    }

    @Override
    public void exitExprlist(@NotNull NasmParser.ExprlistContext ctx) {
    }

    @Override
    public void enterSmall_stmt(@NotNull NasmParser.Small_stmtContext ctx) {
    }

    @Override
    public void exitSmall_stmt(@NotNull NasmParser.Small_stmtContext ctx) {
    }

    @Override
    public void enterTrailer(@NotNull NasmParser.TrailerContext ctx) {
        if (ctx.getText().charAt(0)=='(') {
            jplagParser.add(APPLY, ctx.getStart());
        } else {
            jplagParser.add(ARRAY, ctx.getStart());
        }
    }

    @Override
    public void exitTrailer(@NotNull NasmParser.TrailerContext ctx) {
    }

    @Override
    public void enterDotted_as_names(@NotNull NasmParser.Dotted_as_namesContext ctx) {
    }

    @Override
    public void exitDotted_as_names(@NotNull NasmParser.Dotted_as_namesContext ctx) {
    }

    @Override
    public void enterArith_expr(@NotNull NasmParser.Arith_exprContext ctx) {
    }

    @Override
    public void exitArith_expr(@NotNull NasmParser.Arith_exprContext ctx) {
    }

    @Override
    public void enterArglist(@NotNull NasmParser.ArglistContext ctx) {
    }

    @Override
    public void exitArglist(@NotNull NasmParser.ArglistContext ctx) {
    }

    @Override
    public void enterSimple_stmt(@NotNull NasmParser.Simple_stmtContext ctx) {
    }

    @Override
    public void exitSimple_stmt(@NotNull NasmParser.Simple_stmtContext ctx) {
    }

    @Override
    public void enterTypedargslist(@NotNull NasmParser.TypedargslistContext ctx) {
    }

    @Override
    public void exitTypedargslist(@NotNull NasmParser.TypedargslistContext ctx) {
    }

    @Override
    public void enterExpr(@NotNull NasmParser.ExprContext ctx) {
    }

    @Override
    public void exitExpr(@NotNull NasmParser.ExprContext ctx) {
    }

    @Override
    public void enterTerm(@NotNull NasmParser.TermContext ctx) {
    }

    @Override
    public void exitTerm(@NotNull NasmParser.TermContext ctx) {
    }

    @Override
    public void enterPower(@NotNull NasmParser.PowerContext ctx) {
    }

    @Override
    public void exitPower(@NotNull NasmParser.PowerContext ctx) {
    }

    @Override
    public void enterDotted_as_name(@NotNull NasmParser.Dotted_as_nameContext ctx) {
    }

    @Override
    public void exitDotted_as_name(@NotNull NasmParser.Dotted_as_nameContext ctx) {
    }

    @Override
    public void enterFactor(@NotNull NasmParser.FactorContext ctx) {
    }

    @Override
    public void exitFactor(@NotNull NasmParser.FactorContext ctx) {
    }

    @Override
    public void enterSliceop(@NotNull NasmParser.SliceopContext ctx) {
    }

    @Override
    public void exitSliceop(@NotNull NasmParser.SliceopContext ctx) {
    }

    @Override
    public void enterFuncdef(@NotNull NasmParser.FuncdefContext ctx) {
        jplagParser.add(METHOD_BEGIN, ctx.getStart());
    }

    @Override
    public void exitFuncdef(@NotNull NasmParser.FuncdefContext ctx) {
        jplagParser.addEnd(METHOD_END, ctx.getStart());
    }

    @Override
    public void enterSubscriptlist(@NotNull NasmParser.SubscriptlistContext ctx) {
    }

    @Override
    public void exitSubscriptlist(@NotNull NasmParser.SubscriptlistContext ctx) {
    }

    @Override
    public void enterTest_nocond(@NotNull NasmParser.Test_nocondContext ctx) {
    }

    @Override
    public void exitTest_nocond(@NotNull NasmParser.Test_nocondContext ctx) {
    }

    @Override
    public void enterComp_iter(@NotNull NasmParser.Comp_iterContext ctx) {
    }

    @Override
    public void exitComp_iter(@NotNull NasmParser.Comp_iterContext ctx) {
    }

    @Override
    public void enterNonlocal_stmt(@NotNull NasmParser.Nonlocal_stmtContext ctx) {
    }

    @Override
    public void exitNonlocal_stmt(@NotNull NasmParser.Nonlocal_stmtContext ctx) {
    }

    @Override
    public void enterEval_input(@NotNull NasmParser.Eval_inputContext ctx) {
    }

    @Override
    public void exitEval_input(@NotNull NasmParser.Eval_inputContext ctx) {
    }

    @Override
    public void enterVfpdef(@NotNull NasmParser.VfpdefContext ctx) {
    }

    @Override
    public void exitVfpdef(@NotNull NasmParser.VfpdefContext ctx) {
    }

    @Override
    public void enterImport_name(@NotNull NasmParser.Import_nameContext ctx) {
    }

    @Override
    public void exitImport_name(@NotNull NasmParser.Import_nameContext ctx) {
    }

    @Override
    public void enterComp_if(@NotNull NasmParser.Comp_ifContext ctx) {
    }

    @Override
    public void exitComp_if(@NotNull NasmParser.Comp_ifContext ctx) {
    }

    @Override
    public void enterAugassign(@NotNull NasmParser.AugassignContext ctx) {
        jplagParser.add(ASSIGN, ctx.getStart());
    }

    @Override
    public void exitAugassign(@NotNull NasmParser.AugassignContext ctx) {
    }

    @Override
    public void enterPass_stmt(@NotNull NasmParser.Pass_stmtContext ctx) {
    }

    @Override
    public void exitPass_stmt(@NotNull NasmParser.Pass_stmtContext ctx) {
    }

    @Override
    public void enterExpr_stmt(@NotNull NasmParser.Expr_stmtContext ctx) {
    }

    @Override
    public void exitExpr_stmt(@NotNull NasmParser.Expr_stmtContext ctx) {
    }

    @Override
    public void enterYield_stmt(@NotNull NasmParser.Yield_stmtContext ctx) {
        jplagParser.add(YIELD, ctx.getStart());
    }

    @Override
    public void exitYield_stmt(@NotNull NasmParser.Yield_stmtContext ctx) {
    }

    @Override
    public void enterSuite(@NotNull NasmParser.SuiteContext ctx) {
    }

    @Override
    public void exitSuite(@NotNull NasmParser.SuiteContext ctx) {
    }

    @Override
    public void enterContinue_stmt(@NotNull NasmParser.Continue_stmtContext ctx) {
        jplagParser.add(CONTINUE, ctx.getStart());
    }

    @Override
    public void exitContinue_stmt(@NotNull NasmParser.Continue_stmtContext ctx) {
    }

    @Override
    public void enterTestlist_star_expr(@NotNull NasmParser.Testlist_star_exprContext ctx) {
    }

    @Override
    public void exitTestlist_star_expr(@NotNull NasmParser.Testlist_star_exprContext ctx) {
    }

    @Override
    public void enterVarargslist(@NotNull NasmParser.VarargslistContext ctx) {
    }

    @Override
    public void exitVarargslist(@NotNull NasmParser.VarargslistContext ctx) {
    }

    @Override
    public void enterFor_stmt(@NotNull NasmParser.For_stmtContext ctx) {
        jplagParser.add(FOR_BEGIN, ctx.getStart());
    }

    @Override
    public void exitFor_stmt(@NotNull NasmParser.For_stmtContext ctx) {
        jplagParser.addEnd(FOR_END, ctx.getStart());
    }

    @Override
    public void enterDel_stmt(@NotNull NasmParser.Del_stmtContext ctx) {
        jplagParser.add(DEL, ctx.getStart());
    }

    @Override
    public void exitDel_stmt(@NotNull NasmParser.Del_stmtContext ctx) {
    }

    @Override
    public void enterAtom(@NotNull NasmParser.AtomContext ctx) {
    }

    @Override
    public void exitAtom(@NotNull NasmParser.AtomContext ctx) {
    }

    @Override
    public void enterStmt(@NotNull NasmParser.StmtContext ctx) {
    }

    @Override
    public void exitStmt(@NotNull NasmParser.StmtContext ctx) {
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext ctx) {
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
        if (node.getText().equals("=")) {
            jplagParser.add(ASSIGN, node.getSymbol());
        } else if (node.getText().equals("finally")) {
            jplagParser.add(FINALLY, node.getSymbol());
        }
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {
    }

	@Override
	public void enterAnnassign(NasmParser.AnnassignContext ctx) {
	}

	@Override
	public void exitAnnassign(NasmParser.AnnassignContext ctx) {
	}

	@Override
	public void enterEncoding_decl(NasmParser.Encoding_declContext ctx) {
	}

	@Override
	public void exitEncoding_decl(NasmParser.Encoding_declContext ctx) {
	}

	@Override
	public void enterAtom_expr(NasmParser.Atom_exprContext ctx) {
	}

	@Override
	public void exitAtom_expr(NasmParser.Atom_exprContext ctx) {
	}

	@Override
	public void enterAsync_funcdef(NasmParser.Async_funcdefContext ctx) {
	}

	@Override
	public void exitAsync_funcdef(NasmParser.Async_funcdefContext ctx) {
	}

	@Override
	public void enterAsync_stmt(NasmParser.Async_stmtContext ctx) {
	}

	@Override
	public void exitAsync_stmt(NasmParser.Async_stmtContext ctx) {
	}
}
