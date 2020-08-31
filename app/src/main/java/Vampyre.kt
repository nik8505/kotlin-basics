open class Vampyre(name: String) : Enemy(name, 140, 3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}