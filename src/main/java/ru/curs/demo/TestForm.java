package ru.curs.demo;

import ru.curs.celesta.CallContext;
import ru.curs.celesta.dbutils.BasicCursor;
import ru.curs.lyra.BasicGridForm;
import ru.curs.lyra.LyraFormField;
import ru.curs.lyra.LyraFormProperties;
import ru.curs.lyra.LyraNamedElementHolder;
import ru.curs.lyra.annotations.FormField;
import ru.curs.lyra.annotations.LyraForm;

@LyraForm(gridWidth = 100, gridHeight = 10)
public class TestForm extends BasicGridForm<OrderLineCursor> {

    //Constructor will be run only once: each form is a Spring's singleton Component
    public TestForm(CallContext c) {
        super(c);
        //First, we add to the form all the table's fields in the order they declared in SQL
        createAllBoundFields();

        //Add a field to the form and then alter its caption
        LyraFormField f = createField("field2");
        f.setCaption("Unbound field caption");

        //Add a field to a form with default attributes (inherited from CelestaDoc or chosen by default)
        createField("field1");
    }

    @Override
    public OrderLineCursor _getCursor(CallContext callContext) {
        //sorting and filtering can also be performed here
        return new OrderLineCursor(callContext);
    }

    @FormField(caption = "Field Caption")
    public String getField1(CallContext ctx) {
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
