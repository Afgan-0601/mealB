package javaMealB;

import io.restassured.RestAssured;
import org.junit.Test;

public class GetMonthlyExprense {

    @Test
    public void getMonthlyExpense(){
        RestAssured.baseURI="http://34.235.0.4/api/expenses/getMonthlyExpenses";

    }
}
