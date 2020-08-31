fun main(args: Array<String>) {
//    val nikolaj = Player("Nikolaj")
//
//    val sword = Weapon("Sword", 10)
//
//    val louise = Player("Louise", 5)
//    louise.weapon = sword
//    println(louise.toString())
//
//    val nik = Player("Nik", 4, 8)
//    println(nik.toString())
//
//    val axe = Weapon("Axe", 12)
//    val niko = Player("Niko", 2, 5, 1000)
//    niko.weapon = axe
//    println(niko.toString())
//
//    nikolaj.weapon = sword
//    println(nikolaj.toString())
//
//    nikolaj.weapon = Weapon("Spear", 14)
//    println(nikolaj.toString())
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
//    nikolaj.getLoot(redPotion)
//    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.0)
//    nikolaj.getLoot(chestArmor)
//    nikolaj.getLoot(Loot("Ring of Protection +2", LootType.RING, 40.25))
//    nikolaj.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
//    nikolaj.showInventory()
//
//    if (nikolaj.dropLoot(redPotion)) {
//        nikolaj.showInventory()
//    } else {
//        println("you don't have ${redPotion.name}")
//    }
//
//    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
//    if (nikolaj.dropLoot(bluePotion)) {
//        nikolaj.showInventory()
//    } else {
//        println("you don't have ${bluePotion.name}")
//    }
//
//    if (nikolaj.dropLoot("Invisibility Potion")) {
//        nikolaj.showInventory()
//    } else {
//        println("You don't have an Invisibility Potion")
//    }

//    for (i in 0..9) {
//        println("$i squared is ${i * i}")
//    }
//    println("================================")
//
//    for (i in 0 until 10) {
//        println("$i squared is ${i * i}")
//    }
//    println("================================")
//
//    for (i in 10 downTo 0) {
//        println("$i squared is ${i * i}")
//    }
//    println("================================")
//
//    for (i in 10 downTo 0 step 2) {
//        println("$i squared is ${i * i}")
//    }
//    println("================================")
//
//    for (i in 0..100) {
//        if ((i % 3) == 0 || (i % 5) == 0) {
//            println(i)
//        }
//    }
//    println("================================")

    val enemy = Enemy("test enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampyreKing("Dracula")
    while (dracula.lives > 0) {
        if (dracula.dodges()) {
            continue
        }

        if (dracula.runAway()) {
            println("Dracula ran away")
            break
        } else {
            dracula.takeDamage(12)
        }
    }
    println(dracula)

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()
    conan.dropLoot("Gold Ring")
    conan.showInventory()
    conan.dropLoot("Silver Ring")
    conan.showInventory()
}
