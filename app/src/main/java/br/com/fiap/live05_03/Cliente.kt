package br.com.fiap.live05_03

class Cliente {

  var nome = ""
  var email: String = ""
  var salario: Double = 0.0
  var idade = 0

  fun andar(){

  }

  fun cumprimentar(nomePessoa: String){
    idade = 34
  }

  fun calcularAumento(): Double {
    return salario * 110;
  }


}