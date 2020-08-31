class VampyreKing(name: String) : Vampyre(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    fun dodges(): Boolean {
        val chance = (1..6).shuffled().first()
        if (chance > 3) {
            println("Dracula dodges")

            return true
        }

        return false
    }
}