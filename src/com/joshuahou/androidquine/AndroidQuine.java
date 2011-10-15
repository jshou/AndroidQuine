package com.joshuahou.androidquine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.common.collect.Lists;

import java.util.List;

public class AndroidQuine extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        TextView textView = (TextView) findViewById(R.id.display);

        char q = 34;
        char nl = 10;

        List<String> sourceCode = Lists.newArrayList(
"package com.joshuahou.androidquine;",
"",
"import android.app.Activity;",
"import android.os.Bundle;",
"import android.widget.TextView;",
"import com.google.common.collect.Lists;",
"",
"import java.util.List;",
"",
"public class AndroidQuine extends Activity {",
"    @Override",
"    public void onCreate(Bundle savedInstanceState) {",
"        super.onCreate(savedInstanceState);",
"",
"        setContentView(R.layout.main);",
"",
"        TextView textView = (TextView) findViewById(R.id.display);",
"",
"        char q = 34;",
"        char nl = 10;",
"",
"        List<String> sourceCode = Lists.newArrayList(",
"        );",
"",
"        String output = new String();",
"",
"        // before sourceCode",
"        for (int i = 0; i < 22; i++) {",
"            output += sourceCode.get(i) + nl;",
"        }",
"",
"        // output",
"        for (String line : sourceCode) {",
"            output += q + line + q + ',' + nl;",
"        }",
"",
"        // after sourceCode",
"        for (int i = 22; i < sourceCode.size(); i++) {",
"            output += sourceCode.get(i) + nl;",
"        }",
"",
"        textView.setText(output);",
"    }",
"}"
        );

        String output = new String();

        // before sourceCode
        for (int i = 0; i < 22; i++) {
            output += sourceCode.get(i) + nl;
        }

        // output
        for (String line : sourceCode) {
            output += q + line + q + ',' + nl;
        }

        // after sourceCode
        for (int i = 22; i < sourceCode.size(); i++) {
            output += sourceCode.get(i) + nl;
        }

        textView.setText(output);
    }
}
