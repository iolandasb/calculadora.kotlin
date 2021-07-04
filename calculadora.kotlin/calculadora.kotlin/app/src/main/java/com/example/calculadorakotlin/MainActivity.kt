package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nomeAnuncio: EditText
    lateinit var valor: EditText
    lateinit var calcular: Button
    lateinit var anuncio: TextView
    lateinit var projecao: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nomeAnuncio = findViewById(R.id.edtNomeAnuncio)
        valor = findViewById(R.id.edtValor)
        calcular = findViewById(R.id.btnCalcular)
        anuncio = findViewById(R.id.txtAnuncio)
        projecao = findViewById(R.id.txtProjecao)

        //Cálculo - Calculadora de Anúncios
        fun calcularProjecao(X: Float): Int {
            var visualizacoes = 0
            var cliques = 0
            var compartilhamentos = 0
            var Y = 0

            var visTemp : Float = 30 * X
            var cliquesTemp : Float = (visTemp * 0.12).toFloat()
            var compTemp : Float = ((cliquesTemp / 20) * 3)

            visualizacoes += visTemp.toInt()
            cliques += cliquesTemp.toInt()
            compartilhamentos += compTemp.toInt()

            if(compTemp > 0)
                Y = 0
            else
                Y = 5

            while (Y < 4) {

                visTemp = compTemp*40
                cliquesTemp = (visTemp * 0.12).toFloat()
                compTemp = (cliquesTemp / 20) * 3

                visualizacoes += visTemp.toInt()
                cliques += cliquesTemp.toInt()
                compartilhamentos += compTemp.toInt()

                if(compTemp > 0)
                    Y++
                else
                    Y = 5

            }
            return visualizacoes
        }

        //Botão que dispara todos os cálculos e monta o texto (fazendo verificação de caixas de texto em branco e gerando erro, bem como limpando as caixas de texto após o clique do botão)
        calcular.setOnClickListener {
            if (nomeAnuncio.text.isEmpty()) {
                nomeAnuncio.error = "Digite um anúncio."
            } else if (valor.text.isEmpty()) {
                valor.error = "Digite um valor de investimento."
            } else {
                anuncio.text = "Anúncio: " + nomeAnuncio.text.toString()
                projecao.text = "Projeção - Máximo de Visualizações: " + calcularProjecao(valor.text.toString().toFloat()).toString()
            }
            nomeAnuncio.text = null
            valor.text = null
        }
    }
}