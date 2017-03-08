package foo.bar

enum class DemoEnum(val value : String) {

    One("one"),
    Two("two"),
    Three("three");

    companion object {

        init {
            val value = DemoEnum.values()[0].value
        }

    }
}
