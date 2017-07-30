package cruso.umg.gt.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3, et4;
    Button bt1, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.etnombre);
        et2 = (EditText) findViewById(R.id.etapellido);
        et3 = (EditText) findViewById(R.id.etpass1);
        et4 = (EditText) findViewById(R.id.etpass2);
    }

    public void ingresar(View view)
    {
        String pass1= et3.getText().toString();
        String pass2= et4.getText().toString();

        if (pass1.equals(pass2)){
            Toast notification=Toast.makeText(this, "Credenciales Validas, Bienvenido",Toast.LENGTH_SHORT);
            notification.show();

            Intent i=new Intent(this, Intereses.class);
            startActivity(i);
        }else{
            Toast notification=Toast.makeText(this, "Ingrese contrase;as Iguales",Toast.LENGTH_SHORT);
            notification.show();
        }

    }

    public void cancelar(View view){
        et1=(EditText) findViewById(R.id.etnombre);
        et1.setText("");
        et2=(EditText) findViewById(R.id.etapellido);
        et2.setText("");
        et3=(EditText) findViewById(R.id.etpass1);
        et3.setText("");
        et3=(EditText) findViewById(R.id.etpass2);
        et3.setText("");
    }
}

