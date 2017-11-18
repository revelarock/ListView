package listview.abctech.com.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaItens;
    private String [] itens = {
            "Angra dos Reis", "Rio de Janeiro",
            "Salvador", "Sao Paulo", "Nova York",
            "Curitiba", "Ilheus", "Campos de Jordão",
            "china", "Japao", "Venezuela","Chile", "Russia",
            "Cuba","Florianopolis", "BudaPeste"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaItens = (ListView) findViewById(R.id.ListViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens

        );

        listaItens.setAdapter(adaptador);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                String valorClicado = listaItens.getItemAtPosition(codigoPosicao).toString();
                Toast.makeText(getApplicationContext(), valorClicado,Toast.LENGTH_SHORT ).show();
            }
        });



    }
}
