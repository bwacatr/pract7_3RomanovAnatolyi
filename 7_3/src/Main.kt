import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*Задание 1 (7)*/
    try {


        println("Введите стороны")
        val a = readln().toDouble()
        val b = readln().toDouble()
        val c = readln().toDouble()

        var S: Double = 0.0
        var p: Double = 0.0

        if ((a + b) < c || (c + b) < a || (c + a) < b) {
            println("Треугольник не существует. сумма двух сторон меньше третьей.")
        } else if (a <= 0 || b <= 0 || c <= 0) {
            println("Треугольник не существует. Длина стороны не может быть меньше или равной нулю.")
        } else {
            p = (a + b + c) / 2
            println(p)
            S = sqrt(p * (p - a) * (p - b) * (p - c))
            println("Площадь по формуле Герона: $S")
        }
    }
    catch (e: NumberFormatException) {
        println("Неверный тип данных")
    }

    //Задание 1 (18)

   /* try
    {
        println("Введите сторону")
        val a = readln().toDouble()

        var S: Double = 0.0
        var r: Double = 0.0
        var R: Double = 0.0

        if (a <= 0) {
            println("Треугольник не существует. Длина стороны не может быть меньше или равной нулю.")
        } else {
            S = (a * a * sqrt(3.0)) / 4
            r = a / (2 * sqrt(3.0))
            R = 2 * r
            println("Площадь: $S, радиус вписанной окружности: $r, радиус описанной окружности: $R")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Неверный тип данных")
    }*/



    //Задание 2 (7)

    /*try {
        println("Введите трехзначное число")
        var K = readln().toInt()

        var a = 0

        val array = arrayOf<Int>(0, 0, 0)

        when (K > 99 && K < 1000) {
            true -> {
                for (i in 0..2) {
                    a = K % 10
                    println(a)
                    K = K / 10
                    array[i] = a
                }

                if (array[0] - array[1] == array[1] - array[2]) {
                    println("Цифры образуют арифметическую прогрессию")
                } else {
                    println("Цифры не образуют арифметическую прогрессию")
                }
            }

            false -> {
                println("Введено не трехзначное число")
            }
        }
    }
        catch(e: NumberFormatException)
        {
            println("Неверный тип данных")
        }*/


    //Задание 2 (18)
    /*try {


        println("Введите точки M1(x1,y1)")
        val x1 = readln().toDouble()
        val y1 = readln().toDouble()
        println("Введите точки M2(x2,y2)")
        val x2 = readln().toDouble()
        val y2 = readln().toDouble()
        println("Введите точки N1(x3,y3)")
        val x3 = readln().toDouble()
        val y3 = readln().toDouble()
        println("Введите точки N2(x4,y4)")
        val x4 = readln().toDouble()
        val y4 = readln().toDouble()

        val Km = (y2 - y1) / (x2 - x1)
        val Kn = (y4 - y3) / (x4 - x3)

        var y: Double = 0.0
        var x: Double = 0.0

        when (Km == Kn) {
            true -> {
                if (Km == Kn && Kn == (y4 - y1) / (x4 - x1)) {
                    println("Прямые совпадают, точка пересечения - любая из заданных точек")
                } else
                    println("Прямые параллельны и не пересекаются")
            }

            false -> {
                x = (y3 - y1 + Km * x1 - Kn * x3) / (Km - Kn)
                y = Km * x + y1 - Km * x1

                println("Точка пересечения: ($x ; $y)")
            }
        }
    }
    catch (e: NumberFormatException)
    {
        println("Неверный тип данных")
    }*/

    //Задание 2 (20)
    /*val choice = readln()
    try {
        when (choice) {
            "а" -> {
                println("x = 2, y = 1")
            }

            "б" -> {
                println("x = 2, y = 1")
            }

            "в" -> {
                println("x = 2, y = 1")
            }

            "г" -> {
                println("x = 2, y = 1")
            }

            else -> println("Такого варианта нет")
        }
    } catch (e: NumberFormatException) {
        println("Неверное значение")
    }*/
}