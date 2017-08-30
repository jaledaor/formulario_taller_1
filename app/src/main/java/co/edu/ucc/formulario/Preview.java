package co.edu.ucc.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Preview extends AppCompatActivity {

    @BindView(R.id.txt_nombres_out)
    EditText txt_nombres_out;
    @BindView(R.id.txt_apellidos_out)
    EditText txt_apellidos_out;
    @BindView(R.id.txt_direccion_out)
    EditText txt_direccion_out;
    @BindView(R.id.txt_email_out)
    EditText txt_email_out;
    @BindView(R.id.txt_telefono_out)
    EditText txt_telefono_out;
    @BindView(R.id.txt_celular_out)
    EditText txt_celular_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        ButterKnife.bind(this);
        setTitle("Visualización de Datos Ingresados");

        String nombres_in = getIntent().getStringExtra("nombreReg");
        String apellidos_in = getIntent().getStringExtra("apellidoReg");
        String direccion_in = getIntent().getStringExtra("direccionReg");
        String email_in = getIntent().getStringExtra("emailReg");
        String telefono_in = getIntent().getStringExtra("telefonoReg");
        String celular_in = getIntent().getStringExtra("celularReg");

        txt_nombres_out.setText( "Nombres: "+ nombres_in);
        txt_apellidos_out.setText("Apellidos: "+ apellidos_in);
        txt_direccion_out.setText("Direccion Residencia: " +direccion_in);
        txt_email_out.setText("Correo Electronico: "+email_in);
        txt_telefono_out.setText("Telefono Fijo: "+telefono_in);
        txt_celular_out.setText("Numero Celular: " +celular_in);
    }
}
