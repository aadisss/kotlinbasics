package com.aadisss.kotlinbasics

import kotlin.random.Random

fun main(){
    var userChoice  = ""
    var computerChoice = ""
    println("Rock, Paper or Scissors. Enter your choice!")
    userChoice = readln()
    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }
    println(computerChoice)
    val winner = when{
        userChoice == computerChoice -> "Tie"
        userChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        userChoice == "Paper" && computerChoice == "Rock" -> "Player"
        userChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if(winner=="Tie"){
        println("No one won")
    }
    else {
        print("$winner Won")
    }
}