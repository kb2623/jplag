package jplag.masm;

import jplag.masm.grammar.MasmListener;
import jplag.masm.grammar.MasmParser.BContext;
import jplag.masm.grammar.MasmParser.Binary_exp10Context;
import jplag.masm.grammar.MasmParser.Binary_exp11Context;
import jplag.masm.grammar.MasmParser.Binary_exp12Context;
import jplag.masm.grammar.MasmParser.Binary_exp1Context;
import jplag.masm.grammar.MasmParser.Binary_exp2Context;
import jplag.masm.grammar.MasmParser.Binary_exp3Context;
import jplag.masm.grammar.MasmParser.Binary_exp4Context;
import jplag.masm.grammar.MasmParser.Binary_exp5Context;
import jplag.masm.grammar.MasmParser.Binary_exp6Context;
import jplag.masm.grammar.MasmParser.Binary_exp7Context;
import jplag.masm.grammar.MasmParser.Binary_exp8Context;
import jplag.masm.grammar.MasmParser.Binary_exp9Context;
import jplag.masm.grammar.MasmParser.CallContext;
import jplag.masm.grammar.MasmParser.CodeContext;
import jplag.masm.grammar.MasmParser.CompilationUnitContext;
import jplag.masm.grammar.MasmParser.Directive_exp1Context;
import jplag.masm.grammar.MasmParser.DirectivesContext;
import jplag.masm.grammar.MasmParser.InContext;
import jplag.masm.grammar.MasmParser.InterruptionContext;
import jplag.masm.grammar.MasmParser.LContext;
import jplag.masm.grammar.MasmParser.MemoryContext;
import jplag.masm.grammar.MasmParser.NotargumentsContext;
import jplag.masm.grammar.MasmParser.OContext;
import jplag.masm.grammar.MasmParser.OpContext;
import jplag.masm.grammar.MasmParser.OpeContext;
import jplag.masm.grammar.MasmParser.OperContext;
import jplag.masm.grammar.MasmParser.OperaContext;
import jplag.masm.grammar.MasmParser.OperatContext;
import jplag.masm.grammar.MasmParser.OperatoContext;
import jplag.masm.grammar.MasmParser.OperatorContext;
import jplag.masm.grammar.MasmParser.OutContext;
import jplag.masm.grammar.MasmParser.ProcContext;
import jplag.masm.grammar.MasmParser.QuestionContext;
import jplag.masm.grammar.MasmParser.ReContext;
import jplag.masm.grammar.MasmParser.RegisterContext;
import jplag.masm.grammar.MasmParser.SContext;
import jplag.masm.grammar.MasmParser.SegmentosContext;
import jplag.masm.grammar.MasmParser.SegmentsContext;
import jplag.masm.grammar.MasmParser.ShContext;
import jplag.masm.grammar.MasmParser.TimeContext;
import jplag.masm.grammar.MasmParser.TyContext;
import jplag.masm.grammar.MasmParser.Unuary_exp1Context;
import jplag.masm.grammar.MasmParser.Unuary_exp2Context;
import jplag.masm.grammar.MasmParser.Unuary_exp3Context;
import jplag.masm.grammar.MasmParser.Unuary_exp4Context;
import jplag.masm.grammar.MasmParser.Unuary_exp5Context;
import jplag.masm.grammar.MasmParser.VariabledeclarationContext;
import jplag.masm.grammar.MasmParser.XContext;

import org.antlr.v4.runtime.ParserRuleContext;
// import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JplagMasmListener implements MasmListener, MasmTokenConstants {

    private jplag.masm.Parser jplagParser;

    public JplagMasmListener(jplag.masm.Parser jplag) {
        jplagParser = jplag;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOpera(OperaContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOpera(OperaContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTy(TyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTy(TyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp12(Binary_exp12Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp12(Binary_exp12Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOperator(OperatorContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOperator(OperatorContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNotarguments(NotargumentsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNotarguments(NotargumentsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOpe(OpeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOpe(OpeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterIn(InContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitIn(InContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterSegmentos(SegmentosContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitSegmentos(SegmentosContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterUnuary_exp2(Unuary_exp2Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitUnuary_exp2(Unuary_exp2Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterUnuary_exp3(Unuary_exp3Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitUnuary_exp3(Unuary_exp3Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterUnuary_exp4(Unuary_exp4Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitUnuary_exp4(Unuary_exp4Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterCompilationUnit(CompilationUnitContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitCompilationUnit(CompilationUnitContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterUnuary_exp5(Unuary_exp5Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitUnuary_exp5(Unuary_exp5Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterRe(ReContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRe(ReContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterVariabledeclaration(VariabledeclarationContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitVariabledeclaration(VariabledeclarationContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOperato(OperatoContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOperato(OperatoContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterUnuary_exp1(Unuary_exp1Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitUnuary_exp1(Unuary_exp1Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOperat(OperatContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOperat(OperatContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterCode(CodeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitCode(CodeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterMemory(MemoryContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMemory(MemoryContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterSegments(SegmentsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitSegments(SegmentsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOut(OutContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOut(OutContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterSh(ShContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitSh(ShContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOp(OpContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOp(OpContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterProc(ProcContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitProc(ProcContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp1(Binary_exp1Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp1(Binary_exp1Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterB(BContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitB(BContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp2(Binary_exp2Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp2(Binary_exp2Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp3(Binary_exp3Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp3(Binary_exp3Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterQuestion(QuestionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitQuestion(QuestionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp4(Binary_exp4Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp4(Binary_exp4Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterDirectives(DirectivesContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitDirectives(DirectivesContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp5(Binary_exp5Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp5(Binary_exp5Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp6(Binary_exp6Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp6(Binary_exp6Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp7(Binary_exp7Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp7(Binary_exp7Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp8(Binary_exp8Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp8(Binary_exp8Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp9(Binary_exp9Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp9(Binary_exp9Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterL(LContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitL(LContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterO(OContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitO(OContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterCall(CallContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitCall(CallContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterS(SContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitS(SContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp11(Binary_exp11Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp11(Binary_exp11Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterX(XContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitX(XContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinary_exp10(Binary_exp10Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinary_exp10(Binary_exp10Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterInterruption(InterruptionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitInterruption(InterruptionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterDirective_exp1(Directive_exp1Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitDirective_exp1(Directive_exp1Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOper(OperContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOper(OperContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTime(TimeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTime(TimeContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterRegister(RegisterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRegister(RegisterContext ctx) {
        // TODO Auto-generated method stub

    }

}
