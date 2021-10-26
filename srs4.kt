fun main() {
    alphabet()
}

fun alphabet(){   
    val chars = mutableListOf<Char>()
    
    for (c in 'A'..'Z'){        
         chars.add(c)        
    }
    
    for (i in chars){     
        if (chars.indexOf(i) % 2 != 0) {
            print(i + " ")
        }    
    }
}
