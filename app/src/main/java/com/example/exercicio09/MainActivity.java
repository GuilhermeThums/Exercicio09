package com.example.exercicio09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMessage(View view){
        Context context = getApplicationContext();
        int duracao = Toast.LENGTH_SHORT;

        TextView nome = findViewById(R.id.nome);
        String nomeText = nome.getText().toString();

        TextView user = findViewById(R.id.usuario);
        String userText = user.getText().toString();

        TextView senha = findViewById(R.id.senha);
        String senhaText = senha.getText().toString();

        TextView contraSenha = findViewById(R.id.contraSenha);
        String contraSenhaText = contraSenha.getText().toString();

        if(TextUtils.isEmpty(nomeText)){
            Toast toast = Toast.makeText(context, "Campo 'nome' vazio!", duracao);
            toast.show();
        } else if(TextUtils.isEmpty(userText)){
            Toast toast = Toast.makeText(context, "Campo 'Usuário(e-mail)' vazio!", duracao);
            toast.show();
        } else if (!senhaText.equals(contraSenhaText)){
            Toast toast = Toast.makeText(context, "As senhas não coincidem!", duracao);
            toast.show();
        } else{
            Toast toast = Toast.makeText(context, "Tudo ok!", duracao);
            toast.show();
        }
    }
}
