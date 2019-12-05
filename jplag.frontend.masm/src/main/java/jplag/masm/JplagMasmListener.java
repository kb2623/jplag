package jplag.masm;

import jplag.masm.grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JplagMasmListener implements MasmListener, MasmTokenConstants {

    private jplag.masm.Parser jplagParser;

    public JplagMasmListener(jplag.masm.Parser jplag) {
        jplagParser = jplag;
    }

    @Override
    public void enterTestlist(@NotNull MasmParser.TestlistContext ctx) {
    }

    @Override
    public void exitTestlist(@NotNull MasmParser.TestlistContext ctx) {
    }

    @Override
    public void enterAssert_stmt(@NotNull MasmParser.Assert_stmtContext ctx) {
        jplagParser.add(ASSERT, ctx.getStart());
    }

    @Override
    public void exitAssert_stmt(@NotNull MasmParser.Assert_stmtContext ctx) {
    }

    @Override
    public void enterArgument(@NotNull MasmParser.ArgumentContext ctx) {
    }

    @Override
    public void exitArgument(@NotNull MasmParser.ArgumentContext ctx) {
    }

    @Override
    public void enterNot_test(@NotNull MasmParser.Not_testContext ctx) {
    }

    @Override
    public void exitNot_test(@NotNull MasmParser.Not_testContext ctx) {
    }

    @Override
    public void enterFile_input(@NotNull MasmParser.File_inputContext ctx) {
    }

    @Override
    public void exitFile_input(@NotNull MasmParser.File_inputContext ctx) {
    }

    @Override
    public void enterXor_expr(@NotNull MasmParser.Xor_exprContext ctx) {
    }

    @Override
    public void exitXor_expr(@NotNull MasmParser.Xor_exprContext ctx) {
    }

    @Override
    public void enterImport_from(@NotNull MasmParser.Import_fromContext ctx) {
    }

    @Override
    public void exitImport_from(@NotNull MasmParser.Import_fromContext ctx) {
    }

    @Override
    public void enterSingle_input(@NotNull MasmParser.Single_inputContext ctx) {
    }

    @Override
    public void exitSingle_input(@NotNull MasmParser.Single_inputContext ctx) {
    }

    @Override
    public void enterDecorated(@NotNull MasmParser.DecoratedContext ctx) {
        jplagParser.add(DEC_BEGIN, ctx.getStart());
    }

    @Override
    public void exitDecorated(@NotNull MasmParser.DecoratedContext ctx) {
        jplagParser.addEnd(DEC_END, ctx.getStart());
    }

    @Override
    public void enterWith_item(@NotNull MasmParser.With_itemContext ctx) {
    }

    @Override
    public void exitWith_item(@NotNull MasmParser.With_itemContext ctx) {
    }

    @Override
    public void enterRaise_stmt(@NotNull MasmParser.Raise_stmtContext ctx) {
        jplagParser.add(RAISE, ctx.getStart());
    }

    @Override
    public void exitRaise_stmt(@NotNull MasmParser.Raise_stmtContext ctx) {
    }

    @Override
    public void enterImport_as_name(@NotNull MasmParser.Import_as_nameContext ctx) {
    }

    @Override
    public void exitImport_as_name(@NotNull MasmParser.Import_as_nameContext ctx) {
    }

    @Override
    public void enterExcept_clause(@NotNull MasmParser.Except_clauseContext ctx) {
        jplagParser.add(EXCEPT_BEGIN, ctx.getStart());
    }

    @Override
    public void exitExcept_clause(@NotNull MasmParser.Except_clauseContext ctx) {
        jplagParser.addEnd(EXCEPT_END, ctx.getStart());
    }

    @Override
    public void enterCompound_stmt(@NotNull MasmParser.Compound_stmtContext ctx) {
    }

    @Override
    public void exitCompound_stmt(@NotNull MasmParser.Compound_stmtContext ctx) {
    }

    @Override
    public void enterAnd_expr(@NotNull MasmParser.And_exprContext ctx) {
    }

    @Override
    public void exitAnd_expr(@NotNull MasmParser.And_exprContext ctx) {
    }

    @Override
    public void enterLambdef_nocond(@NotNull MasmParser.Lambdef_nocondContext ctx) {
    }

    @Override
    public void exitLambdef_nocond(@NotNull MasmParser.Lambdef_nocondContext ctx) {
    }

    @Override
    public void enterDictorsetmaker(@NotNull MasmParser.DictorsetmakerContext ctx) {
        jplagParser.add(ARRAY, ctx.getStart());
    }

    @Override
    public void exitDictorsetmaker(@NotNull MasmParser.DictorsetmakerContext ctx) {
    }

    @Override
    public void enterReturn_stmt(@NotNull MasmParser.Return_stmtContext ctx) {
        jplagParser.add(RETURN, ctx.getStart());
    }

    @Override
    public void exitReturn_stmt(@NotNull MasmParser.Return_stmtContext ctx) {
    }

    @Override
    public void enterDotted_name(@NotNull MasmParser.Dotted_nameContext ctx) {
    }

    @Override
    public void exitDotted_name(@NotNull MasmParser.Dotted_nameContext ctx) {
    }

    @Override
    public void enterFlow_stmt(@NotNull MasmParser.Flow_stmtContext ctx) {
    }

    @Override
    public void exitFlow_stmt(@NotNull MasmParser.Flow_stmtContext ctx) {
    }

    @Override
    public void enterWhile_stmt(@NotNull MasmParser.While_stmtContext ctx) {
        jplagParser.add(WHILE_BEGIN, ctx.getStart());
    }

    @Override
    public void exitWhile_stmt(@NotNull MasmParser.While_stmtContext ctx) {
        jplagParser.addEnd(WHILE_END, ctx.getStart());
    }

    @Override
    public void enterOr_test(@NotNull MasmParser.Or_testContext ctx) {
    }

    @Override
    public void exitOr_test(@NotNull MasmParser.Or_testContext ctx) {
    }

    @Override
    public void enterComparison(@NotNull MasmParser.ComparisonContext ctx) {
    }

    @Override
    public void exitComparison(@NotNull MasmParser.ComparisonContext ctx) {
    }

    @Override
    public void enterTest(@NotNull MasmParser.TestContext ctx) {
    }

    @Override
    public void exitTest(@NotNull MasmParser.TestContext ctx) {
    }

    @Override
    public void enterSubscript(@NotNull MasmParser.SubscriptContext ctx) {
    }

    @Override
    public void exitSubscript(@NotNull MasmParser.SubscriptContext ctx) {
    }

    @Override
    public void enterComp_for(@NotNull MasmParser.Comp_forContext ctx) {
    }

    @Override
    public void exitComp_for(@NotNull MasmParser.Comp_forContext ctx) {
    }

    @Override
    public void enterYield_arg(@NotNull MasmParser.Yield_argContext ctx) {
        jplagParser.add(YIELD, ctx.getStart());
    }

    @Override
    public void exitYield_arg(@NotNull MasmParser.Yield_argContext ctx) {
    }

    @Override
    public void enterYield_expr(@NotNull MasmParser.Yield_exprContext ctx) {
    }

    @Override
    public void exitYield_expr(@NotNull MasmParser.Yield_exprContext ctx) {
    }

    @Override
    public void enterImport_stmt(@NotNull MasmParser.Import_stmtContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
    }

    @Override
    public void exitImport_stmt(@NotNull MasmParser.Import_stmtContext ctx) {
    }

    @Override
    public void enterShift_expr(@NotNull MasmParser.Shift_exprContext ctx) {
    }

    @Override
    public void exitShift_expr(@NotNull MasmParser.Shift_exprContext ctx) {
    }

    @Override
    public void enterLambdef(@NotNull MasmParser.LambdefContext ctx) {
        jplagParser.add(LAMBDA, ctx.getStart());
    }

    @Override
    public void exitLambdef(@NotNull MasmParser.LambdefContext ctx) {
    }

    @Override
    public void enterAnd_test(@NotNull MasmParser.And_testContext ctx) {
    }

    @Override
    public void exitAnd_test(@NotNull MasmParser.And_testContext ctx) {
    }

    @Override
    public void enterGlobal_stmt(@NotNull MasmParser.Global_stmtContext ctx) {
    }

    @Override
    public void exitGlobal_stmt(@NotNull MasmParser.Global_stmtContext ctx) {
    }

    @Override
    public void enterImport_as_names(@NotNull MasmParser.Import_as_namesContext ctx) {
    }

    @Override
    public void exitImport_as_names(@NotNull MasmParser.Import_as_namesContext ctx) {
    }

    @Override
    public void enterDecorators(@NotNull MasmParser.DecoratorsContext ctx) {
    }

    @Override
    public void exitDecorators(@NotNull MasmParser.DecoratorsContext ctx) {
    }

    @Override
    public void enterTry_stmt(@NotNull MasmParser.Try_stmtContext ctx) {
        jplagParser.add(TRY_BEGIN, ctx.getStart());
    }

    @Override
    public void exitTry_stmt(@NotNull MasmParser.Try_stmtContext ctx) {
    }

    @Override
    public void enterComp_op(@NotNull MasmParser.Comp_opContext ctx) {
    }

    @Override
    public void exitComp_op(@NotNull MasmParser.Comp_opContext ctx) {
    }

    @Override
    public void enterStar_expr(@NotNull MasmParser.Star_exprContext ctx) {
    }

    @Override
    public void exitStar_expr(@NotNull MasmParser.Star_exprContext ctx) {
    }

    @Override
    public void enterBreak_stmt(@NotNull MasmParser.Break_stmtContext ctx) {
        jplagParser.add(BREAK, ctx.getStart());
    }

    @Override
    public void exitBreak_stmt(@NotNull MasmParser.Break_stmtContext ctx) {
    }

    @Override
    public void enterParameters(@NotNull MasmParser.ParametersContext ctx) {
    }

    @Override
    public void exitParameters(@NotNull MasmParser.ParametersContext ctx) {
    }

    @Override
    public void enterDecorator(@NotNull MasmParser.DecoratorContext ctx) {
    }

    @Override
    public void exitDecorator(@NotNull MasmParser.DecoratorContext ctx) {
    }

    @Override
    public void enterTfpdef(@NotNull MasmParser.TfpdefContext ctx) {
    }

    @Override
    public void exitTfpdef(@NotNull MasmParser.TfpdefContext ctx) {
    }

    @Override
    public void enterTestlist_comp(@NotNull MasmParser.Testlist_compContext ctx) {
        if (ctx.getText().contains(",")) {
            jplagParser.add(ARRAY, ctx.getStart());
        }
    }

    @Override
    public void exitTestlist_comp(@NotNull MasmParser.Testlist_compContext ctx) {
    }

    @Override
    public void enterIf_stmt(@NotNull MasmParser.If_stmtContext ctx) {
        jplagParser.add(IF_BEGIN, ctx.getStart());
    }

    @Override
    public void exitIf_stmt(@NotNull MasmParser.If_stmtContext ctx) {
        jplagParser.addEnd(IF_END, ctx.getStart());
    }

    @Override
    public void enterWith_stmt(@NotNull MasmParser.With_stmtContext ctx) {
        jplagParser.add(WITH_BEGIN, ctx.getStart());
    }

    @Override
    public void exitWith_stmt(@NotNull MasmParser.With_stmtContext ctx) {
        jplagParser.addEnd(WITH_END, ctx.getStart());
    }

    @Override
    public void enterClassdef(@NotNull MasmParser.ClassdefContext ctx) {
        jplagParser.add(CLASS_BEGIN, ctx.getStart());
    }

    @Override
    public void exitClassdef(@NotNull MasmParser.ClassdefContext ctx) {
        jplagParser.addEnd(CLASS_END, ctx.getStart());
    }

    @Override
    public void enterExprlist(@NotNull MasmParser.ExprlistContext ctx) {
    }

    @Override
    public void exitExprlist(@NotNull MasmParser.ExprlistContext ctx) {
    }

    @Override
    public void enterSmall_stmt(@NotNull MasmParser.Small_stmtContext ctx) {
    }

    @Override
    public void exitSmall_stmt(@NotNull MasmParser.Small_stmtContext ctx) {
    }

    @Override
    public void enterTrailer(@NotNull MasmParser.TrailerContext ctx) {
        if (ctx.getText().charAt(0)=='(') {
            jplagParser.add(APPLY, ctx.getStart());
        } else {
            jplagParser.add(ARRAY, ctx.getStart());
        }
    }

    @Override
    public void exitTrailer(@NotNull MasmParser.TrailerContext ctx) {
    }

    @Override
    public void enterDotted_as_names(@NotNull MasmParser.Dotted_as_namesContext ctx) {
    }

    @Override
    public void exitDotted_as_names(@NotNull MasmParser.Dotted_as_namesContext ctx) {
    }

    @Override
    public void enterArith_expr(@NotNull MasmParser.Arith_exprContext ctx) {
    }

    @Override
    public void exitArith_expr(@NotNull MasmParser.Arith_exprContext ctx) {
    }

    @Override
    public void enterArglist(@NotNull MasmParser.ArglistContext ctx) {
    }

    @Override
    public void exitArglist(@NotNull MasmParser.ArglistContext ctx) {
    }

    @Override
    public void enterSimple_stmt(@NotNull MasmParser.Simple_stmtContext ctx) {
    }

    @Override
    public void exitSimple_stmt(@NotNull MasmParser.Simple_stmtContext ctx) {
    }

    @Override
    public void enterTypedargslist(@NotNull MasmParser.TypedargslistContext ctx) {
    }

    @Override
    public void exitTypedargslist(@NotNull MasmParser.TypedargslistContext ctx) {
    }

    @Override
    public void enterExpr(@NotNull MasmParser.ExprContext ctx) {
    }

    @Override
    public void exitExpr(@NotNull MasmParser.ExprContext ctx) {
    }

    @Override
    public void enterTerm(@NotNull MasmParser.TermContext ctx) {
    }

    @Override
    public void exitTerm(@NotNull MasmParser.TermContext ctx) {
    }

    @Override
    public void enterPower(@NotNull MasmParser.PowerContext ctx) {
    }

    @Override
    public void exitPower(@NotNull MasmParser.PowerContext ctx) {
    }

    @Override
    public void enterDotted_as_name(@NotNull MasmParser.Dotted_as_nameContext ctx) {
    }

    @Override
    public void exitDotted_as_name(@NotNull MasmParser.Dotted_as_nameContext ctx) {
    }

    @Override
    public void enterFactor(@NotNull MasmParser.FactorContext ctx) {
    }

    @Override
    public void exitFactor(@NotNull MasmParser.FactorContext ctx) {
    }

    @Override
    public void enterSliceop(@NotNull MasmParser.SliceopContext ctx) {
    }

    @Override
    public void exitSliceop(@NotNull MasmParser.SliceopContext ctx) {
    }

    @Override
    public void enterFuncdef(@NotNull MasmParser.FuncdefContext ctx) {
        jplagParser.add(METHOD_BEGIN, ctx.getStart());
    }

    @Override
    public void exitFuncdef(@NotNull MasmParser.FuncdefContext ctx) {
        jplagParser.addEnd(METHOD_END, ctx.getStart());
    }

    @Override
    public void enterSubscriptlist(@NotNull MasmParser.SubscriptlistContext ctx) {
    }

    @Override
    public void exitSubscriptlist(@NotNull MasmParser.SubscriptlistContext ctx) {
    }

    @Override
    public void enterTest_nocond(@NotNull MasmParser.Test_nocondContext ctx) {
    }

    @Override
    public void exitTest_nocond(@NotNull MasmParser.Test_nocondContext ctx) {
    }

    @Override
    public void enterComp_iter(@NotNull MasmParser.Comp_iterContext ctx) {
    }

    @Override
    public void exitComp_iter(@NotNull MasmParser.Comp_iterContext ctx) {
    }

    @Override
    public void enterNonlocal_stmt(@NotNull MasmParser.Nonlocal_stmtContext ctx) {
    }

    @Override
    public void exitNonlocal_stmt(@NotNull MasmParser.Nonlocal_stmtContext ctx) {
    }

    @Override
    public void enterEval_input(@NotNull MasmParser.Eval_inputContext ctx) {
    }

    @Override
    public void exitEval_input(@NotNull MasmParser.Eval_inputContext ctx) {
    }

    @Override
    public void enterVfpdef(@NotNull MasmParser.VfpdefContext ctx) {
    }

    @Override
    public void exitVfpdef(@NotNull MasmParser.VfpdefContext ctx) {
    }

    @Override
    public void enterImport_name(@NotNull MasmParser.Import_nameContext ctx) {
    }

    @Override
    public void exitImport_name(@NotNull MasmParser.Import_nameContext ctx) {
    }

    @Override
    public void enterComp_if(@NotNull MasmParser.Comp_ifContext ctx) {
    }

    @Override
    public void exitComp_if(@NotNull MasmParser.Comp_ifContext ctx) {
    }

    @Override
    public void enterAugassign(@NotNull MasmParser.AugassignContext ctx) {
        jplagParser.add(ASSIGN, ctx.getStart());
    }

    @Override
    public void exitAugassign(@NotNull MasmParser.AugassignContext ctx) {
    }

    @Override
    public void enterPass_stmt(@NotNull MasmParser.Pass_stmtContext ctx) {
    }

    @Override
    public void exitPass_stmt(@NotNull MasmParser.Pass_stmtContext ctx) {
    }

    @Override
    public void enterExpr_stmt(@NotNull MasmParser.Expr_stmtContext ctx) {
    }

    @Override
    public void exitExpr_stmt(@NotNull MasmParser.Expr_stmtContext ctx) {
    }

    @Override
    public void enterYield_stmt(@NotNull MasmParser.Yield_stmtContext ctx) {
        jplagParser.add(YIELD, ctx.getStart());
    }

    @Override
    public void exitYield_stmt(@NotNull MasmParser.Yield_stmtContext ctx) {
    }

    @Override
    public void enterSuite(@NotNull MasmParser.SuiteContext ctx) {
    }

    @Override
    public void exitSuite(@NotNull MasmParser.SuiteContext ctx) {
    }

    @Override
    public void enterContinue_stmt(@NotNull MasmParser.Continue_stmtContext ctx) {
        jplagParser.add(CONTINUE, ctx.getStart());
    }

    @Override
    public void exitContinue_stmt(@NotNull MasmParser.Continue_stmtContext ctx) {
    }

    @Override
    public void enterTestlist_star_expr(@NotNull MasmParser.Testlist_star_exprContext ctx) {
    }

    @Override
    public void exitTestlist_star_expr(@NotNull MasmParser.Testlist_star_exprContext ctx) {
    }

    @Override
    public void enterVarargslist(@NotNull MasmParser.VarargslistContext ctx) {
    }

    @Override
    public void exitVarargslist(@NotNull MasmParser.VarargslistContext ctx) {
    }

    @Override
    public void enterFor_stmt(@NotNull MasmParser.For_stmtContext ctx) {
        jplagParser.add(FOR_BEGIN, ctx.getStart());
    }

    @Override
    public void exitFor_stmt(@NotNull MasmParser.For_stmtContext ctx) {
        jplagParser.addEnd(FOR_END, ctx.getStart());
    }

    @Override
    public void enterDel_stmt(@NotNull MasmParser.Del_stmtContext ctx) {
        jplagParser.add(DEL, ctx.getStart());
    }

    @Override
    public void exitDel_stmt(@NotNull MasmParser.Del_stmtContext ctx) {
    }

    @Override
    public void enterAtom(@NotNull MasmParser.AtomContext ctx) {
    }

    @Override
    public void exitAtom(@NotNull MasmParser.AtomContext ctx) {
    }

    @Override
    public void enterStmt(@NotNull MasmParser.StmtContext ctx) {
    }

    @Override
    public void exitStmt(@NotNull MasmParser.StmtContext ctx) {
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
	public void enterAnnassign(MasmParser.AnnassignContext ctx) {
	}

	@Override
	public void exitAnnassign(MasmParser.AnnassignContext ctx) {
	}

	@Override
	public void enterEncoding_decl(MasmParser.Encoding_declContext ctx) {
	}

	@Override
	public void exitEncoding_decl(MasmParser.Encoding_declContext ctx) {
	}

	@Override
	public void enterAtom_expr(MasmParser.Atom_exprContext ctx) {
	}

	@Override
	public void exitAtom_expr(MasmParser.Atom_exprContext ctx) {
	}

	@Override
	public void enterAsync_funcdef(MasmParser.Async_funcdefContext ctx) {
	}

	@Override
	public void exitAsync_funcdef(MasmParser.Async_funcdefContext ctx) {
	}

	@Override
	public void enterAsync_stmt(MasmParser.Async_stmtContext ctx) {
	}

	@Override
	public void exitAsync_stmt(MasmParser.Async_stmtContext ctx) {
	}
}
