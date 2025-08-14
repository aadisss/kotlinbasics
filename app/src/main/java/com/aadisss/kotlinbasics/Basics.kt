package com.aadisss.kotlinbasics

import kotlin.random.Random

fun main(){
    var userChoice  = ""
    var computerChoice = ""
    println("Rock, Paper or Scissors. Enter your choice!")
    userChoice = readln()
    val randomNumber = (1..3).random()
    if(randomNumber == 1){
    computerChoice = "Rock"
    }
    else if(randomNumber == 2){
        computerChoice = "Paper"
    }
    else if(randomNumber == 3) {
        computerChoice = "Scissors"
    }
    println(computerChoice)
}