package com.example.cadastrokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.*
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var cadastrosAdapter: CadastrosAdapter
    lateinit var pesquisa: EditText
    lateinit var pesquisar: ImageButton
    lateinit var resultado: RecyclerView
    lateinit var limparPesquisa: Button
    lateinit var cadastrarContato: Button
    lateinit var excluir : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pesquisa = findViewById(R.id.edtPesquisa)
        pesquisar = findViewById(R.id.btnPesquisar)
        resultado = findViewById(R.id.txtResultado)
        limparPesquisa = findViewById(R.id.btnLimparPesquisa)
        cadastrarContato = findViewById(R.id.btnIrCadastro)

        //Comandos que chamam as informações de RecyclerView da classe "Adapter":
        cadastrosAdapter = CadastrosAdapter(this, dataSet = frase)
        resultado.adapter = cadastrosAdapter
        resultado.layoutManager = LinearLayoutManager(this)

        //Comando que chama as informações da classe "Cadastro":
        val cadastro = Cadastro()

        //Comandos que chamam as informações da "SecondActivity":
        intent.extras?.get("salvar")

        //Botão que dispara a função de pesquisa da classe "Cadastro", e mostra mensagem caso o que for pesquisado não existir no registro:
        pesquisar.setOnClickListener {
            val nomeConsultado = pesquisa.text.toString()
            if (nomeConsultado.isNotEmpty()) {
                if (cadastro.consultarLista(nomeConsultado).isNotEmpty()) {
                    cadastrosAdapter.atualizarLista(cadastro.consultarLista(nomeConsultado))
                    pesquisa.text = null
                } else {
                    Toast.makeText(
                        this,
                        "Esse cadastro não consta na agenda!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else pesquisa.error = "Informe um nome para consultar."
        }

        //Botão que limpa a pesquisa realizada através da função "exibirLista" da classe "Cadastro":
        limparPesquisa.setOnClickListener {
            cadastrosAdapter.atualizarLista(cadastro.exibirLista())
        }

        //Botão que leva da página inicial à página de cadastro de anúncios ("SecondActivity"):
        cadastrarContato.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}