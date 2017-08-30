package co.edu.ucc.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_nombres)
    EditText txt_nombres;

    @BindView(R.id.txt_apellidos)
    EditText txt_apellidos;

    @BindView(R.id.txt_direccion)
    EditText txt_direccion;

    @BindView(R.id.txt_email)
    EditText txt_email;

    @BindView(R.id.txt_telefono)
    EditText txt_telefono;

    @BindView(R.id.txt_celular)
    EditText txt_celular;

    @BindView(R.id.btn_registrar)
    Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_registrar)
    public void clickRegistrar() {

        String nombres = txt_nombres.getText().toString();
        String apellidos = txt_apellidos.getText().toString();
        String direccion = txt_direccion.getText().toString();
        String email = txt_email.getText().toString();
        String telefono = txt_telefono.getText().toString();
        String celular = txt_celular.getText().toString();

        if (!nombres.equals("") &&
                !apellidos.equals("") &&
                !direccion.equals("") &&
                !email.equals("") &&
                !telefono.equals("") &&
                !celular.equals("")) {
            btn_registrar.setEnabled(false);
            setTitle("Registro de Datos");

            Intent intent_preview = new Intent(getApplicationContext(),
                    Preview.class);
            intent_preview.putExtra("nombreReg", nombres);
            intent_preview.putExtra("apellidoReg", apellidos);
            intent_preview.putExtra("direccionReg", direccion);
            intent_preview.putExtra("emailReg", email);
            intent_preview.putExtra("telefonoReg", telefono);
            intent_preview.putExtra("celularReg", celular);

            startActivity(intent_preview);
            finish();
            return;
        }
        else{
            Toast.makeText(getApplicationContext(),"Error, Debe Diligenciar Todos Los Campos",Toast.LENGTH_LONG).show();
        }

        }
    }
