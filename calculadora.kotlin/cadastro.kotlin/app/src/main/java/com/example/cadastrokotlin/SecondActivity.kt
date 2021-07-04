package com.example.cadastrokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.*
import com.example.cadastrokotlin.MainActivity as MainActivity
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import android.app.DatePickerDialog
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import kotlin.math.absoluteValue

class SecondActivity : AppCompatActivity() {

    lateinit var nomeAnuncio : EditText
    lateinit var cliente : EditText
    lateinit var dataInicio : EditText
    lateinit var dataTermino : EditText
    lateinit var investimento : EditText
    lateinit var salvar : Button

    val calendar: Calendar = Calendar.getInstance()
    val dia: Int = calendar.get(Calendar.DAY_OF_MONTH)
    val mes: Int = calendar.get(Calendar.MONTH)+1
    val ano: Int = calendar.get(Calendar.YEAR)
    var datepicker: DatePickerDialog? = null
    var diasRestantes : Long = 0

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nomeAnuncio = findViewById(R.id.edtNomeAnuncio)
        cliente = findViewById(R.id.edtCliente)
        dataInicio = findViewById(R.id.edtDataInicio)
        dataTermino = findViewById(R.id.edtDataTermino)
        investimento = findViewById(R.id.edtInvestimento)
        salvar = findViewById(R.id.btnSalvar)

        var inicio = LocalDate.of(ano,mes,dia)
        var termino = LocalDate.of(ano,mes,dia)

        //Cálculo da Data de Início (datepicker e contagem de dias):
        dataInicio.setOnClickListener { datepicker = DatePickerDialog(this,
            { view, ano, monthOfYear, dayOfMonth -> dataInicio.setText(dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + ano)
                inicio = LocalDate.of(ano, monthOfYear, dayOfMonth)
                diasRestantes = ChronoUnit.DAYS.between(inicio, termino).absoluteValue
            }, ano, mes, dia)
            datepicker!!.show()
        }

        //Cálculo da Data de Término (datepicker e contagem de dias):
        dataTermino.setOnClickListener { datepicker = DatePickerDialog(this,
            { view, ano, monthOfYear, dayOfMonth -> dataTermino.setText(dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + ano)
                termino = LocalDate.of(ano, monthOfYear, dayOfMonth)
                diasRestantes = ChronoUnit.DAYS.between(inicio, termino).absoluteValue
            }, ano, mes, dia)
            datepicker!!.show()
        }

        //Cálculo - Calculadora de Anúncios:

        var visualizacoes = 0
        var cliques = 0
        var compartilhamentos = 0

        fun calcularProjecao(X: Float){

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
        }

        //Comando que chama as informações da classe "Cadastro":
        val cadastro = Cadastro()

        //Botão que dispara todos os cálculos e monta o texto (fazendo verificação de caixas de texto em branco e gerando erro, bem como limpando as caixas de texto após o clique do botão):
        salvar.setOnClickListener {
            if (nomeAnuncio.text.isEmpty()) {
                nomeAnuncio.error = "Digite um nome de anúncio."
            } else if (cliente.text.isEmpty()) {
                cliente.error = "Digite um cliente."
            } else if (dataInicio.text.isEmpty()) {
                dataInicio.error = "Digite uma data de início."
            } else if (dataTermino.text.isEmpty()) {
                dataTermino.error = "Digite uma data de término."
            } else if (investimento.text.isEmpty()) {
                investimento.error = "Digite um valor de investimento."
            } else {
                val valorTotal = (investimento.text.toString().toInt()*diasRestantes)
                calcularProjecao(valorTotal.toFloat())
                cadastro.adicionarLista(" " + "Anúncio:" + " " + nomeAnuncio.text.toString() + " " + "\n" + " " + "Cliente:" + " " + cliente.text.toString() + " " + "\n" +
                                        " " + "Valor Total Investido:" + " " + valorTotal.toString() + "\n" +
                                        " " + "Quantidade máxima de visualizações:" + " " + visualizacoes.toString() + "\n" +
                                        " " + "Quantidade máxima de cliques:" + " " + cliques.toString() + "\n" +
                                        " " + "Quantidade máxima de compartilhamentos:" + " " + compartilhamentos.toString() + "\n")
                //Comandos que levam as informações deste arquivo à "MainActivity":
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            nomeAnuncio.text = null
            cliente.text = null
            dataInicio.text = null
            dataTermino.text = null
            investimento.text = null
        }

    }

}