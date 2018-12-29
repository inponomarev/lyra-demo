package ru.curs.demo;

import ru.curs.celesta.CallContext;
import ru.curs.celesta.dbutils.BasicCursor;
import ru.curs.lyra.BasicGridForm;
import ru.curs.lyra.LyraFormField;
import ru.curs.lyra.LyraFormProperties;
import ru.curs.lyra.LyraNamedElementHolder;

//@Form(header="sdfsadf")
public class TestForm extends BasicGridForm {

    public TestForm(CallContext c){
        super(c);
        createAllBoundFields();


    }

   // @FormField(caption = "asadasf", width="asdfasdf")
    public String getFoo(CallContext ctx){
        return "foo";
    }

    @Override
    public int getGridHeight() {
        return 0;
    }

    @Override
    public String getSummaryRow() {
        return null;
    }

    @Override
    public BasicCursor _getCursor(CallContext callContext) {
        return new OrderLineCursor(callContext);
    }

    @Override
    public String _getId() {
        return null;
    }

    @Override
    public LyraFormProperties getFormProperties() {
        return null;
    }

    @Override
    protected LyraFormField _createUnboundField(LyraNamedElementHolder<LyraFormField> lyraNamedElementHolder, String s) {
        return null;
    }

    @Override
    protected void _createAllUnboundFields(LyraNamedElementHolder<LyraFormField> lyraNamedElementHolder) {

    }

    @Override
    public void _beforeSending(BasicCursor basicCursor) {

    }
}
