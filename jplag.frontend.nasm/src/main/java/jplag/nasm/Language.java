package jplag.nasm;

import java.io.File;

import jplag.ProgramI;

public class Language implements jplag.Language {

    private jplag.nasm.Parser parser;

    public Language(ProgramI program) {
        this.parser = new jplag.nasm.Parser();
        this.parser.setProgram(program);
    }

    public String[] suffixes() {
        String[] res = {".asm"};
        return res;
    }

    public int errorsCount() {
        return this.parser.errorsCount();
    }

    public String name() {
        return "Nasm Parser";
    }

    public String getShortName() {
        return "nasm";
    }

    public int min_token_match() {
        return 12;
    }

    public jplag.Structure parse(File dir, String[] files) {
        return this.parser.parse(dir, files);
    }

    public boolean errors() {
        return this.parser.getErrors();
    }

    public boolean supportsColumns() {
        return true;
    }

    public boolean isPreformated() {
        return true;
    }

    public boolean usesIndex() {
        return false;
    }

    public int noOfTokens() {
        return jplag.nasm.NasmToken.numberOfTokens();
    }

    public String type2string(int type) {
        return jplag.nasm.NasmToken.type2string(type);
    }
}
